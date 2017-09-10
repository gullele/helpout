package com.solutionladder.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solutionladder.dao.entity.Donor;

/**
 * Data Layer Access for Donor
 * @author Kaleb Woldearegay <kaleb@solutionladder.com>
 *
 */
public interface DonorRepository extends JpaRepository<Donor, Long> {

}