package com.jsuarezc.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsuarezc.example.domain.Player;

public interface PlayerRepository extends JpaRepository<Player, Long>{

}
