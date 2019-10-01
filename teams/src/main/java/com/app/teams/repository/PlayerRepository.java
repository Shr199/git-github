package com.app.teams.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.teams.model.Players;


@Repository
public interface PlayerRepository extends JpaRepository<Players, Integer>{
	
	@Query("select p from Players p where p.name=:name")
	public Players getPlayerByName(@Param("name") String name);
	
	@Query("select p from Players p where p.playerid=:id")
	public Players getPlayerById(@Param("id") int id);

}
