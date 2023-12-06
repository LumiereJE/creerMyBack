//package com.kh.creer.service;
//
//import com.kh.creer.dto.GoodsDto.GoodsItem;
//import com.kh.creer.entity.GoodsEntity.Goods;
//import com.kh.creer.repository.GoodsRepository;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//
//import static com.kh.creer.security.SecurityUtil.getCurrentMemberId;
//
//@Slf4j
//@Service
//@RequiredArgsConstructor
//public class GoodsService {
//    private final GoodsRepository goodsRepository;
//
//    // 상품 전체 조회
//
//    // 상품 상세 조회
//    // 총 페이지 수
//    // 상품 페이지 네이션
//    // 상품 등록
//    public boolean saveGoodsItem(GoodsItem goodsItem) {
//        try {
//            Goods goods = new Goods();
//
//            Long userId = getCurrentMemberId();
//