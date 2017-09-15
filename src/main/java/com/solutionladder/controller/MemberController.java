package com.solutionladder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.solutionladder.model.MemberModel;
import com.solutionladder.service.MemberService;

/**
 * Controller for Member related requests
 * @author Kaleb Woldearegay <kaleb@solutionladder.com>
 *
 */
@Controller
@RequestMapping(value="/member/api")
public class MemberController {

	@Autowired 
	private MemberService memberService;
	
	/**
	 * Get the list of all members.
	 * @return
	 */
	@RequestMapping(value={"", "/"}, method=RequestMethod.GET)
	public @ResponseBody List<MemberModel> getAll() {		
		return this.memberService.getMemberModel(this.memberService.getAll());
	}
}
