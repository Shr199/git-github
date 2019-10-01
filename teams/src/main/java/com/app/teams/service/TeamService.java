package com.app.teams.service;

import java.util.List;

import com.app.teams.model.Team;


public interface TeamService {
		public String addTeam(Team team);
		public List<Team> getAllTeams();
		public String addTeamName(String name);
		String deleteTeam(Team team);
		
	}



