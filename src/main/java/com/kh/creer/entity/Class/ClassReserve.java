package com.kh.creer.entity.Class;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "classReserve")
@Getter @Setter @ToString
@NoArgsConstructor
public class ClassReserve {
    @Id
    @Column(name = "classReserve_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long classReserveId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classDetail_id")
    private ClassDetail classDetail;       // 클래스 이름

    private LocalDate reserveDate;        // 예약 날짜
    private String reserveStart;          // 시작 시간
    private String reserveEnd;            // 종료 시간
    private String reservePeople;         // 예약한 인원
    private String totalPrice;            // 예약 총 가격
}
