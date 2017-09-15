package com.solutionladder.service;

import java.util.List;

import com.solutionladder.dao.entity.Member;
import com.solutionladder.model.MemberModel;

/**
 * Service for member related tasks
 * 
 * @author Kaleb Woldearegay <kaleb@solutionladder.com>
 *
 */
public interface MemberService {
	/**
	 * Get all members
	 * @return List<Member>
	 */
	public List<Member> getAll();
	
	/**
	 * Convert the given member list to donor models
	 * @return List<MemberModel>
	 */
	public List<MemberModel> getMemberModel(List<Member> members);
	
}
