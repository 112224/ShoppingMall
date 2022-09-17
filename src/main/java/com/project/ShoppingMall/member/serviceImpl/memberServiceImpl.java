package com.project.ShoppingMall.member.serviceImpl;

import com.project.ShoppingMall.domain.Member;
import com.project.ShoppingMall.member.service.memberService;
import com.project.ShoppingMall.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class memberServiceImpl implements memberService {


    private final MemberRepository memberRepository;

    @Autowired
    public memberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Long join(Member member) {
        Member member1 = memberRepository.save(member);
        return member1.getId();
    }

    @Override
    public Member findById(Long id) {
        return null;
    }
}
