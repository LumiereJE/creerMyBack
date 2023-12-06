package com.kh.creer.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class MemberDto {
    private Long userId;
    private String userEmail;
    private String pwd;
    private String name;
    private String userProfileImg;
    private String address;
    private String phoneNum;
    private String nickName;
    private LocalDateTime regDate;
}





