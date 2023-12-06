package com.kh.creer.entity.Class;

import com.kh.creer.entity.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "classReview")
@Getter @Setter @ToString
@NoArgsConstructor
public class ClassReview {
    @Id
    @Column(name = "classReview_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long classReviewId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classDetail_id")
    private ClassDetail classDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    private LocalDateTime classReviewDate;
    private Integer reviewStar;
    private String classReviewTxt;
    private String classReviewImg;
}
