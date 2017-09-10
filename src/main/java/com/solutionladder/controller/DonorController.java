package com.solutionladder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.solutionladder.model.DonorModel;
import com.solutionladder.service.DonorService;

/**
 * Controller for Donor related requests
 * @author Kaleb Woldearegay <kaleb@solutionladder.com>
 *
 */
@Controller
@RequestMapping(value="/donor/api")
public class DonorController {

	@Autowired 
	private DonorService donorService;
	
	/**
	 * Get the list of all donors.
	 * @return
	 */
	@RequestMapping(value={"", "/"}, method=RequestMethod.GET)
	public @ResponseBody List<DonorModel> getAll() {		
		return this.donorService.getDonorModel(this.donorService.getAll());
	}
}
