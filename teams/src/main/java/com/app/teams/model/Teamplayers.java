package com.app.teams.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

 

	@Entity
	@Table(name="teamplayers")
	@IdClass(TeamPlayersId.class)
	public class Teamplayers {
		
		@Id
		@Column(name="teamid")
		private int teamid;
		@Id
		@Column(name="playerid")
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
