package com.syam.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.syam.player.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
	
	

}
