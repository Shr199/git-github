package com.app.teams.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name="players")
	public class Players {
		
		@Id
		@Column(name="player_id")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int playerid;
		@Column(name="name")
		private String name;
		
		public int getPlayerid() {
			return playerid;
		}
		public void setPlayerid(int playerid) {
			this.playerid = playerid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		

}
