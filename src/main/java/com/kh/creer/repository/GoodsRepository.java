package com.kh.creer.repository;


import com.kh.creer.entity.GoodsEntity.GoodsDetail;
import com.kh.creer.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoodsRepository extends JpaRepository<GoodsDetail, Long> {
    List<GoodsDetail> findByTitleContaining(String keyword);    // 검색
    Page<GoodsDetail> findAll(Pageable pageable);   // 전체 조회
    List<GoodsDetail> findByUserEmail(String userEmail);  // 이메일로 조회 조회
}
