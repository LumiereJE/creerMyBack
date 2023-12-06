package com.kh.creer.dto.GoodsDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentDto {
    private Long paymentId;
    private Long goodsOptionId;          // 옵션 번호
    private String optionContent;        // 옵션 내용
    private String goodsDeliveryFee;     // 배달 비
}
