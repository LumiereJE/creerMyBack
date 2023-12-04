package com.kh.creer.entity.Class;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "classReviewId")
@Getter @Setter @ToString
@NoArgsConstructor
public class ClassReview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long classReviewId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classDetail_id")
    private ClassDetail classTitle;
    private ClassDetail classImg;

    // member에서 가져오기
    private String userNick;
    private String profileImg;

    private LocalDateTime classReviewDate;
    private Integer reviewStar;
    private String classReviewTxt;
    private String classReviewImg;
}
