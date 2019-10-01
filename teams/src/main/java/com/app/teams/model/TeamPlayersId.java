package com.app.teams.model;

import java.io.Serializable;

import javax.persistence.Embeddable;


public class TeamPlayersId implements Serializable {
	
	private int teamid;
	private int playerid;
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public int getPlayerid() {
		return playerid;
	}
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}
	

}
