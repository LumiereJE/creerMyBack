package com.kh.creer.dto.Class;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ClassListDto {
    private Long classListId;
    private String classTitle;      // 클래스 이름
    private String classCategory;   // 분류(카테고리)
    private String classArea;       // 지역
    private Integer reviewCount;    // 리뷰 갯수
}
