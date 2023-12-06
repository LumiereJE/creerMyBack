//package com.kh.creer.controller;
//
//import com.kh.creer.dto.GoodsDto.GoodsItem;
//import com.kh.creer.repository.GoodsRepository;
//import com.kh.creer.security.SecurityUtil;
//import com.kh.creer.service.GoodsService;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Slf4j
//@RestController
//@RequestMapping("/goods")
//@RequiredArgsConstructor
//public class GoodsContoller {
//    private final GoodsService goodsService;
//    // 상품 전체 조회
//    @GetMapping("/list")
//    public ResponseEntity<List<GoodsItem>> goodsList() {
//        List<GoodsItem> list = goodsService.getGoodsList();
//        return ResponseEntity.ok(list);
//    }
//    // 총 페이지 수
//    @GetMapping("/list/count")
//    public ResponseEntity<Integer> goodsCount(@RequestParam(defaultValue = "5") int page,
//                                              @RequestParam(defaultValue = "0") int size) {
//        PageRequest pageRequest = PageRequest.of(page, size);
//        int pageCnt = goodsService.getGoodsPage(pageRequest);
//        return ResponseEntity.ok(pageCnt);
//    }
//    // 상품 조회 페이지네이션
//    @GetMapping("/list/page")
//    public ResponseEntity<List<GoodsItem>> goodsList(@RequestParam(defaultValue = "0") int page,
//                                                     @RequestParam(defaultValue = "5") int size) {
//        List<GoodsItem> list = goodsService.getGoodsList(page,size);
//        return ResponseEntity.ok(list);
//    }
//    // 상품 상세 조회
//    @GetMapping("/detail")
//    public ResponseEntity<GoodsItem> goodsDetail() {
//        Long userId = SecurityUtil.getCurrentMemberId();
//        GoodsItem goodsItem = goodsService.getGoodsDetail(id);
//        return ResponseEntity.ok(goodsItem);
//    }
//    // 상품 등록
//    @PostMapping("/new")
//    public ResponseEntity<Boolean> goodsRegister(@RequestBody GoodsItem goodsItem) {
//        log.info("GoodsItem: {}", goodsItem);
//        boolean result = GoodsService.goodsRegister(goodsItem);
//        return ResponseEntity.ok(result);
//    }
//    // 상품 수정
//    @PutMapping("/modify")
//    public ResponseEntity<Boolean> goodsModify(@RequestBody GoodsItem goodsItem) {
//        log.info("goodsItem: {}", goodsItem.getUserEmail());
//        boolean isTrue = goodsService.modifyGoods(GoodsItem);
//        return ResponseEntity.ok(isTrue);
//    }
//    // 상품 삭제
//   @DeleteMapping("/del/{email}")
//    public ResponseEntity<Boolean> goodsDelete(@PathVariable String userEmail) {
//        boolean isTrue = goodsService.deleteGoods(userEmail);
//        return ResponseEntity.ok(isTrue);
//   }
//   // 상품 검색
//    @GetMapping("/search")
//    public ResponseEntity<List<GoodsItem>> goodsSearch(@RequestBody String keyword) {
//        List<GoodsItem> list = goodsService.getGoodsSearch(keyword);
//        return ResponseEntity.ok(list);
//    }
//}
//
