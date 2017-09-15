package com.solutionladder.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solutionladder.dao.entity.Member;

/**
 * Data Layer Access for Member
 * @author Kaleb Woldearegay <kaleb@solutionladder.com>
 *
 */
public interface MemberRepository extends JpaRepository<Member, Long> {

}
