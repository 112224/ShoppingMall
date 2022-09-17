package com.project.ShoppingMall.member.repository;

import com.project.ShoppingMall.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Object> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();

}
