package com.jsuarezc.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsuarezc.example.domain.Team;

public interface TeamRepository extends JpaRepository<Team, Long>{
	
}
