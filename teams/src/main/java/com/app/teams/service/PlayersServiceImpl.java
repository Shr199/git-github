package com.app.teams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.teams.model.Players;
import com.app.teams.model.Users;
import com.app.teams.repository.PlayerRepository;
import com.app.teams.repository.TeamRepository;

@Service
public class PlayersServiceImpl implements PlayersService {

	@Autowired
	private PlayerRepository playerRepository;
	private String players;
	
	
	
	@Override
	public String addPlayer(String name) {
		
		Players player=new Players();
		player.setName(name);
		
		playerRepository.save(player);
		return "success";
	}
	

	@Override
	public String getPlayerByName(String name) {
		Players player=playerRepository.getPlayerByName(name);
		return players;
	}

	@Override
	public List<Players> getAllPlayers() {
		List<Players> players=playerRepository.findAll();
		return players;
	}

	@Override
	public Players getPlayerById(int id) {
		Players player=playerRepository.getPlayerById(id);
	    
		return player;
	}

	
}
