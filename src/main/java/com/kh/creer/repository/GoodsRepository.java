package com.kh.creer.repository;

import com.kh.creer.entity.GoodsEntity.GoodsList;
import com.kh.creer.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoodsRepository extends JpaRepository<GoodsList, Long> {
    List<GoodsList> findByMember(Member member);
}
