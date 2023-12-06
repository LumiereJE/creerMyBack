package com.kh.creer.entity.Class;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "classDetail")
@Getter @Setter @ToString
@NoArgsConstructor
public class ClassDetail {
    @Id
    @Column(name = "classDetail_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long classDetailId;
    private String classTitle;          // 클래스 이름
    private String classImg;            // 클래스 사진
    private String classCategory;       // 구분(카테고리)
    private String classArea;           // 지역
    private Integer reviewCount;        // 리뷰 갯수

//    // member에서 가져옴
//    @JoinColumn(name = "member_id")
//    private Member member;           // member가 만들어지면 FK로 가져오는거 아닌감 . ..

    private Integer classLike;          // 좋아요
    private Integer classPrice;         // 가격
    private String classLevel;          // 난이도
    private String classRunningTime;    // 소요시간
    private String classPeople;         // 예약 가능 인원

//    // 리뷰에 ManyToOne걸어야 함
//    // 들어가야 하는내용 나열은 DTO, 경로는 Entity... 맞나...맞나 맞나...
//    @JoinColumn(name = "classReview_id") // manyToOne에서만 가능
//    private ClassReview classReview;







}
