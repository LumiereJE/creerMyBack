package com.kh.creer.entity.GoodsEntity;

import com.kh.creer.entity.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "goodsReview")
@Getter @Setter
@ToString
@NoArgsConstructor
// 후기
public class GoodsReview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long goodsReviewId;

    @ManyToOne(fetch = FetchType.LAZY)  // 물품 번호로 리뷰 찾기
    @JoinColumn(name = "goodsDetail_id")
    private GoodsDetail goodsDetail;

    @ManyToOne(fetch = FetchType.LAZY)  // 유저 닉네임, 프사
    @JoinColumn(name = "member_id")
    private Member member;

    private LocalDateTime reviewDate;   // 날짜 넣어줌
    @PrePersist
    public void perPersist() {
        reviewDate = LocalDateTime.now();
    }

    private String reviewStar;          // 별점

    private String reviewImg;           // 리뷰 이미지
    @Column(length = 1000)
    private String reviewContent;       // 리뷰 글


}
