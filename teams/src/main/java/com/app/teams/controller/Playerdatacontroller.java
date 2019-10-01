package com.app.teams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.teams.model.Players;
import com.app.teams.service.PlayersService;
	
@Controller
	public class Playerdatacontroller {
	
	@Autowired
	private PlayersService playerService;
		
		@RequestMapping({"/playerdata"})
		public String getIndexPage(Model model){
			List<Players> playerlist=playerService.getAllPlayers();
			model.addAttribute("playerlist",playerlist);
			return "players/playerdata";

}
		@RequestMapping({"/player/add"})
		public String addPlayer(@RequestParam("name") String name, Model model){
			String retVal=playerService.addPlayer(name);
			model.addAttribute("res",retVal);
			return "redirect:/playerdata";
		}
		
		
}
