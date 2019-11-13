package com.petcare.web.mapper;

import com.petcare.web.domain.Member;

public interface MemberMapper {
    Member findByUsername(String username);
    Member findCorrectUser(Member member);

    void insertMember(Member member);
}
