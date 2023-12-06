package com.kh.creer.dto.Class;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class ClassDetailDto {
    private Long classDetailId;
    private String classTitle;
    private String classImg;
    private String classCategory;
    private String classArea;
    private Integer reviewCount;

    // 클래스 판매 정보
    private String sellerNick;            // member가 만들어지면 fk키로..
    private String sellerProfile;         // 판매자 유저 프로필
    private Integer classLike;          // 좋아요
    private Integer classPrice;         // 가격
    private String classLevel;          // 난이도
    private String classRunningTime;    // 소요시간
    private String classPeople;         // 예약 가능 인원

    // 리뷰 가져오기?????? 뺌 ??????????????/
    private String userNick;
    private String userProfile;
    private LocalDateTime classReviewDate;
    private Integer reviewStar;
    private String classReviewTxt;
    private String classReviewImg;

}
