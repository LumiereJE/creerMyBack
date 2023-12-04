package com.kh.creer.entity.Class;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "classList")
@Getter @Setter @ToString
@NoArgsConstructor
public class ClassList {
    @Id
    @Column(name = "classList_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long classListId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classDetail_id")
    private ClassDetail classTitle;              // 클래스 이름

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classDetail_id")
    private ClassDetail classCategory;           // 분류(카테고리)

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classDetail_id")
    private ClassDetail classArea;               // 지역

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classDetail_id")
    private ClassDetail reviewCount;            // 리뷰 갯수

}
