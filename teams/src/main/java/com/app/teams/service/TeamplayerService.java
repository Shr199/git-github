package com.app.teams.service;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import com.app.teams.model.Players;
import com.app.teams.model.Team;
import com.app.teams.model.Teamplayers;


public interface TeamplayerService{
		
		public List<Players> getTeamPlayers(int teamid);
		public String addPlayertoTeam(int teamid, int playerid);
	}
	


