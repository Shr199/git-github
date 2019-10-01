package com.app.teams.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import com.app.teams.model.Players;
import com.app.teams.model.Team;
import com.app.teams.model.Teamplayers;
import com.app.teams.repository.PlayerRepository;
import com.app.teams.repository.TeamPlayersRepository;

@Service
public class TeamplayerServiceImpl implements TeamplayerService {

		@Autowired 
		private TeamPlayersRepository teamplayerrepository;
		
		@Autowired
		private PlayersService playersService;
		
		@Autowired 
		private PlayerRepository playerrepository;
		
		@Override
		public List<Players> getTeamPlayers(int teamid) {
			List<Teamplayers> teamplayers= teamplayerrepository.getTeamplayers(teamid);
			List<Players> playerList=new ArrayList<>();
			for(Teamplayers teamplayer:teamplayers){
				Players player= playersService.getPlayerById(teamplayer.getPlayerid());
				playerList.add(player);
			}
			return playerList;		
		}
		public String addPlayertoTeam(int teamid, int playerid){
			
			Teamplayers teamplayers= new Teamplayers();
			teamplayers.setPlayerid(playerid);
			teamplayers.setTeamid(teamid);
			teamplayerrepository.save(teamplayers);
			return "success";
		}
		
	}
		
		
		
	
			
		
			
			
	
	
	


	
	
	
	
	
	
	

