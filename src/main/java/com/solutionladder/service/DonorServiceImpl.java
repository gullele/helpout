package com.solutionladder.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solutionladder.dao.DonorRepository;
import com.solutionladder.dao.entity.Donor;
import com.solutionladder.model.DonorModel;

/**
 * Donor Service implementation
 * @author Kaleb Woldearegay <kaleb@solutionladder.com>
 *
 */
@Service
public class DonorServiceImpl implements DonorService{
	
	@Autowired
	private DonorRepository donorRepository;
	
	@Override
	public List<Donor> getAll() {
		return this.donorRepository.findAll();
	}

	@Override
	public List<DonorModel> getDonorModel(List<Donor> donors) {
		List<DonorModel> donorModels = new ArrayList<DonorModel>();
		for (Donor donor : donors) {
			donorModels.add(new DonorModel(donor));
		}
		
		return donorModels;
	}
}
