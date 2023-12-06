package com.kh.creer.entity.GoodsEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "itemOption")
@Getter @Setter
@ToString
@NoArgsConstructor
// 디테일 옵션
public class GoodsOption {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "goodsOption_id")
    private Long goodsOptionId;
    private String itemOptionNum;
    private String itemOptionContent;
    private String itemSelectNum;       // 수량 선택
    private String itemOrder;           // 요청사항
    private String goodsTotalPrice;     // 총 금액 (배달비 제외)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "goodsDetail_id")
    private GoodsDetail goodsDetail;
}
