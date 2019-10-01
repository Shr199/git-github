package com.app.teams.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.teams.command.TeamCommand;
import com.app.teams.model.Players;
import com.app.teams.model.Team;
import com.app.teams.model.Teamplayers;
import com.app.teams.model.Users;
import com.app.teams.service.PlayersService;
import com.app.teams.service.TeamService;
import com.app.teams.service.TeamplayerService;
import com.app.teams.service.UserService;


	@Controller
	public class Teamdatacontroller {
		
		@Autowired
		private TeamService teamService;
		
		@Autowired
		private UserService userService;
		
		@Autowired
		private PlayersService playerService;
		
		@Autowired
		private TeamplayerService teamPlayerService;
		
		
		@RequestMapping({"/teamdata"})
		public String geteamdataPage(Model model){
			List<Users> userlist=userService.getAllUsers();
			model.addAttribute("userlist",userlist);
			
			List<Team> teamlist=teamService.getAllTeams();
			/*List<TeamCommand> teamCommandList=new ArrayList<>();
			for(Team team: teamlist){
				TeamCommand teamCommand=new TeamCommand();
				teamCommand.setTeamid(team.getTeamid());
				teamCommand.setTeamname(team.getTeamname());
				if(team.getUsers()!=null){
					teamCommand.setUsername(team.getUsers().getEmail());
				}
				teamCommandList.add(teamCommand);
			}*/
			model.addAttribute("teamlist",teamlist);
			return "team/teamdata";
		}
		@RequestMapping({"/teamdata/add"})
		public String addUser(@RequestParam("teamname") String name,@RequestParam("users") String users, Model model){
			
			Team team=new Team();
			team.setTeamname(name);
			
			Integer uid=Integer.parseInt(users);
			Users user=userService.getUserById(uid);
			team.setUsers(user);
			
			String retval=teamService.addTeam(team);
			model.addAttribute("res",retval);
			return"redirect:/teamdata";		
		}
				
			
		@RequestMapping({"/teamplayers/{teamid}"})
		public String getTeamPlayers(@PathVariable("teamid") String teamid, Model model){
				
			List<Players> teamplayerlist=teamPlayerService.getTeamPlayers(Integer.parseInt(teamid));
			model.addAttribute("teamplayerlist",teamplayerlist);
			List<Players> playerlist=playerService.getAllPlayers();
			playerlist.removeAll(teamplayerlist);
			model.addAttribute("playerlist",playerlist);
			model.addAttribute("teamid",teamid);
			
			return "team/teamplayers";
		}	
		
		@RequestMapping({"/teamplayers/add"})
		public String addPlayerToTeam(@RequestParam("teamplayers") String playerid,@RequestParam("teamid") String teamid,Model model){
			teamPlayerService.addPlayertoTeam(Integer.parseInt(teamid),Integer.parseInt(playerid));
			return "redirect:/teamplayers/"+teamid;
		}	
		}
		
		
		
		
		
		
		
		
	



