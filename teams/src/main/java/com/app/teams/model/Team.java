package com.app.teams.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


	@Entity
	@Table(name="team")
	public class Team {
		
		@Id
		@Column(name="teamid")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int teamid;
		@Column(name="teamname")
		private String teamname;
		@ManyToOne
		@JoinColumn(name="userid")
		private Users users;
		
		public int getTeamid() {
			return teamid;
		}
		public void setTeamid(int teamid) {
			this.teamid = teamid;
		}
		public String getTeamname() {
			return teamname;
		}
		public void setTeamname(String teamname) {
			this.teamname = teamname;
		}
		public Users getUsers() {
			return users;
		}
		public void setUsers(Users users) {
			this.users = users;
		}
		
		
		

}
