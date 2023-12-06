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

    @JoinColumn(name = "classDetail_id")
    private ClassDetail classDetail;

    @JoinColumn(name = "classReserve_id")
    private ClassReserve classReserve;
}
