package com.project.ShoppingMall.member.repository;

import com.project.ShoppingMall.domain.Member;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class memoryMemberRepository implements MemberRepository {

    private final static ConcurrentHashMap<Long, Member> store = new ConcurrentHashMap<>();
    private static Long seq = 1L;

    @Override
    public Member save(Member member) {
        member.setId(seq++);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Object> findById(Long id) {
        return Optional.of(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }
}
