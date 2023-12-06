package com.kh.creer.entity.GoodsEntity;

import com.kh.creer.entity.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.userdetails.User;

import javax.persistence.*;

@Entity
@Table(name = "payment")
@Getter @Setter
@ToString
@NoArgsConstructor
// 결제 상세 정보
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long paymentId;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "goodsOption")
    private GoodsOption goodsOption;
}
