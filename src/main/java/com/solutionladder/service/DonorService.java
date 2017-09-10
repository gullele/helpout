package com.solutionladder.service;

import java.util.List;

import com.solutionladder.dao.entity.Donor;
import com.solutionladder.model.DonorModel;

/**
 * Service for Donor related tasks
 * 
 * @author Kaleb Woldearegay <kaleb@solutionladder.com>
 *
 */
public interface DonorService {
	/**
	 * Get all the donors
	 * @return List<Donor>
	 */
	public List<Donor> getAll();
	
	/**
	 * Convert the given donor list to donor models
	 * @return List<DonorModel>
	 */
	public List<DonorModel> getDonorModel(List<Donor> donors);
	
}
