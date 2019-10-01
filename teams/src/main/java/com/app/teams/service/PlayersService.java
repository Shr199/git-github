package com.app.teams.service;

import java.util.List;

import com.app.teams.model.Players;
import com.app.teams.model.Users;

public interface PlayersService {
	public String addPlayer(String name);
	public String getPlayerByName(String name);
	public Players getPlayerById(int id);
	public List<Players> getAllPlayers();
	
	
}
