package com.kh.creer.entity.Class;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

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
}
