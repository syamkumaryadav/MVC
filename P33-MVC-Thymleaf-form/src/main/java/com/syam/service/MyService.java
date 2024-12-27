package com.syam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syam.player.Player;
import com.syam.repo.PlayerRepository;

@Service
public class MyService {
	
	@Autowired
	private PlayerRepository playerRepository;
	
	public void savePlayer(Player player) {
		
		playerRepository.save(player);
	}

}
