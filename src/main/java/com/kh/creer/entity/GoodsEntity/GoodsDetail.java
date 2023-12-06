package com.kh.creer.entity.GoodsEntity;

import com.kh.creer.entity.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "goodsItem")
@Getter @Setter
@ToString
@NoArgsConstructor
// 상품 상세페이지
public class GoodsDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "goodsDetail_id")
    private Long goodsDetailId;
    private String goodsCategory;       // 카테고리
    private String goodsPic;            // 상품 사진
    @Column(length = 1000)
    private String goodsDesc;            // 상품 설명
    private String goodsRefund;         // 상품 배송/환불/교환 안내

    private String goodsTitle;          // 상품 이름

    @ManyToOne(fetch = FetchType.LAZY)  // 판매자 닉네임, 프사
    @JoinColumn(name = "member_id")
    private Member member;

    private String goodsPrice;          // 상품 가격
//    private String reviewStarAvg;       // 별점 평균
//    private Integer reviewCount;        // 리뷰 갯수
    private String goodsDeliveryFee;    // 배달비
    private Integer itemRest;           // 남은 수량

    private LocalDateTime goodsDate;
    @PrePersist
    public void perPersist() {
        goodsDate = LocalDateTime.now();
    }


}
