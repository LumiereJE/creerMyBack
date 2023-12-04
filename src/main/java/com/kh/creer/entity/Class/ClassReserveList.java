package com.kh.creer.entity.Class;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "classReserveList")
@Getter @Setter @ToString
@NoArgsConstructor
public class ClassReserveList {
    @Id
    @Column(name = "classReserveList_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long classReserveListId;

    // 예약페이지 엔티티 다 가져와야 하는데 id도 가져와야 하는지??
    @JoinColumn(name = "classReserve_id")
    private LocalDate reserveDate;        // 예약 날짜
    @JoinColumn(name = "classReserve_id")
    private String reserveStart;          //  시작 시간
    @JoinColumn(name = "classReserve_id")
    private String reserveEnd;            // 종료 시간
    @JoinColumn(name = "classReserve_id")
    private String reservePeople;         // 예약한 인원
    @JoinColumn(name = "classReserve_id")
    private String totalPrice;            // 예약 총 가격
}
