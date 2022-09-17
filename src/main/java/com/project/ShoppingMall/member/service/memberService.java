package com.project.ShoppingMall.member.service;

import com.project.ShoppingMall.domain.Member;

public interface memberService {

    Long join(Member member);

    Member findById(Long id);

}
