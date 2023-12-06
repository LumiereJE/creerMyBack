package com.kh.creer.repository;

import com.kh.creer.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByUserEmail(String UserEmail);
    boolean existsByUserEmail(String UserEmail);
    Optional<Member> findByUserEmailAndPassword(String userEmail, String password);
}
