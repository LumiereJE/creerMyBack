package com.kh.creer.dto.GoodsDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GoodsDetailDto {
    private Long goodsDetailId;
    private String goodsCategory;       // 카테고리
    private String goodsPic;            // 상품 사진
    private String goodsDesc;           // 상품 설명
    private String goodsRefund;         // 상품 배송/환불/교환 안내

    private String goodsTitle;          // 상품 이름
    private String userNickname;        // 판매자(유저) 닉네임
    private String userProfileImg;      // 판매자(유저) 프로필사진
    private String goodsPrice;          // 상품 가격
//    private String reviewStarAvg;       // 별점 평균
//    private Integer reviewCount;        // 리뷰 갯수
    private String goodsDeliveryFee;    // 배달비
    private Integer itemRest;           // 남은 수량


}
