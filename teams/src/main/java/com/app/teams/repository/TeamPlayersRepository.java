package com.app.teams.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.teams.model.Players;
import com.app.teams.model.Teamplayers;
import com.app.teams.model.Users;

@Repository
public interface TeamPlayersRepository  extends JpaRepository<Teamplayers, Integer>{
	@Query("select u from Teamplayers u where u.teamid=:id")
	public List<Teamplayers> getTeamplayers(@Param("id") int id);
}
