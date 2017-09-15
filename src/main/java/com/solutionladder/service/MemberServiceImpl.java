package com.solutionladder.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solutionladder.dao.MemberRepository;
import com.solutionladder.dao.entity.Member;
import com.solutionladder.model.MemberModel;

/**
 * Member Service implementation
 * @author Kaleb Woldearegay <kaleb@solutionladder.com>
 *
 */
@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Override
	public List<Member> getAll() {
		return this.memberRepository.findAll();
	}

	@Override
	public List<MemberModel> getMemberModel(List<Member> members) {
		List<MemberModel> memberModels = new ArrayList<MemberModel>();
		for (Member member : members) {
			memberModels.add(new MemberModel(member));
		}
		
		return memberModels;
	}
}
