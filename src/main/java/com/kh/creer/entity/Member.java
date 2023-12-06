package com.kh.creer.entity;

import com.kh.creer.constant.Authority;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "member")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Member {
    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    private String password;
    private String address;
    private String phoneNum;
    private String nickName;
    @Column(unique = true, name="user_email")
    private String userEmail;
    private String userProfileImg;
    private LocalDateTime regDate;

    @Enumerated(EnumType.STRING)
    private Authority authority;

    @Builder
    public Member(String name, String password, String userEmail, String userProfileImg, String address, String phoneNum, String nickName, Authority authority) {
        this.name = name;
        this.password = password;
        this.userEmail = userEmail;
        this.userProfileImg = userProfileImg;
        this.address =address;
        this.phoneNum = phoneNum;
        this.nickName = nickName;
        this.authority = authority;
        this.regDate = LocalDateTime.now();
    }
}
