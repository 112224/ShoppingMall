package com.project.ShoppingMall.member.repository;

import com.project.ShoppingMall.domain.Member;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class memoryMemberRepositoryTest {
    MemberRepository memberRepository = new memoryMemberRepository();

    @Test
    public void 회원가입_정상() {
        //given
        Member member = new Member("email@email.com", "", "", "");
        member.setId(2L);

        //when
        Member member1 = memberRepository.save(member);

        //then
        assertThat(member).isEqualTo(member1);

    }

    //비정상인 부분에 대한 테스트는 입력값 검증 등을 적용 이후에 확인할 것.
}