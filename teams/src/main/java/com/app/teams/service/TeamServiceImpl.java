package com.app.teams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.teams.model.Players;
import com.app.teams.model.Team;
import com.app.teams.repository.TeamRepository;

	@Service
	public class TeamServiceImpl implements TeamService {

		@Autowired
		private TeamRepository teamRepository;
		
		public List<Team> getAllTeams() {
			List<Team> team=teamRepository.findAll();
			return team;
		}
		public String addTeamName(String name) {			
			 Team team=new Team();
			team.setTeamname(name);
			
			teamRepository.save(team);
			return "success";
		}
		
		@Override
		public String addTeam(Team team) {		
			teamRepository.save(team);
			return "success";
		}		
		@Override
		public String deleteTeam(Team team) {		
			teamRepository.save(team);
			return "success";
		}	
	}
	
