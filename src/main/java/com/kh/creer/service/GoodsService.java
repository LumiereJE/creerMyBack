package com.kh.creer.service;

import com.kh.creer.dto.GoodsDto.GoodsDetailDto;
import com.kh.creer.entity.GoodsEntity.GoodsDetail;
import com.kh.creer.repository.GoodsRepository;
import com.kh.creer.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GoodsService {
    private final GoodsRepository goodsRepository;
    private final MemberRepository memberRepository;

    // 굿즈 전체 조회
    public List<GoodsDetailDto> getGoodsList() {
        List<GoodsDetail> goodsDetails = goodsRepository.findAll();
        List<GoodsDetailDto> goodsDetailDtos = new ArrayList<>();
        for(GoodsDetail goodsDetail : goodsDetails) {
            goodsDetailDtos.add(convertEntityToDto(goodsDetail));
        }
        return goodsDetailDtos;
    }
    private GoodsDetailDto convertEntityToDto(GoodsDetail goodsDetail) {
        GoodsDetailDto goodsDetailDto = new GoodsDetailDto();
        goodsDetailDto.setGoodsDetailId(goodsDetail.getGoodsDetailId());
        goodsDetailDto.setGoodsCategory(goodsDetail.getGoodsCategory());
        goodsDetailDto.setGoodsPic(goodsDetail.getGoodsPic());
        goodsDetailDto.setGoodsDesc(goodsDetail.getGoodsDesc());
        goodsDetailDto.setGoodsRefund(goodsDetail.getGoodsRefund());

        goodsDetailDto.setGoodsTitle(goodsDetail.getGoodsTitle());
        goodsDetailDto.setNickName(goodsDetail.getMember().getNickName());
        goodsDetailDto.setUserProfileImg(goodsDetail.getMember().getUserProfileImg());
        goodsDetailDto.setGoodsPrice(goodsDetail.getGoodsPrice());

        goodsDetailDto.setGoodsDeliveryFee(goodsDetail.getGoodsDeliveryFee());
        return goodsDetailDto;
    }

}
