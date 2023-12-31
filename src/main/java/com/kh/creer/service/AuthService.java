package com.kh.creer.service;

import com.kh.creer.dto.MemberReqDto;
import com.kh.creer.dto.MemberResDto;
import com.kh.creer.dto.TokenDto;
import com.kh.creer.entity.Member;

import com.kh.creer.jwt.TokenProvider;
import com.kh.creer.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;


@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class AuthService {
    private final AuthenticationManagerBuilder managerBuilder; // 인증을 담당하는 클래스
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;
    private final TokenProvider tokenProvider;

    public MemberResDto signup(MemberReqDto requestDto) {

        if (memberRepository.existsByUserEmail(requestDto.getUserEmail())) {
            throw new RuntimeException("이미 가입되어 있는 유저입니다");
        }

        Member member = requestDto.toEntity(passwordEncoder);
        return MemberResDto.of(memberRepository.save(member));
    }

    public TokenDto login(MemberReqDto requestDto) {
        UsernamePasswordAuthenticationToken authenticationToken = requestDto.toAuthentication();
        Authentication authentication = managerBuilder.getObject().authenticate(authenticationToken);
        return tokenProvider.generateTokenDto(authentication);
    }

    public TokenDto refreshAccessToken(String refreshToken) {
        //refreshToken 검증
        try {
            if (tokenProvider.validateToken(refreshToken)) {
                return tokenProvider.generateTokenDto(tokenProvider.getAuthentication(refreshToken));
            }
        } catch(RuntimeException e) {
            log.error("토큰 유효성 검증 중 예외 발생: {}", e.getMessage());
        }
        return null;
    }
}