package com.kh.creer.dto.Class;

import com.kh.creer.entity.Class.ClassDetail;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class ClassReviewDto {
    private Long classReviewId;
    // 클래스 정보
    private ClassDetail classTitle;
    private ClassDetail classImg;
    // 유저 정보
    private String userNick;
    private String profileImg;
    // 리뷰 항목
    private LocalDateTime classReviewDate;
    private Integer reviewStar;
    private String classReviewTxt;
    private String classReviewImg;


}
