package com.app.teams.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.teams.model.Users;



@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{
	
	@Query("select u from Users u where u.id=:id")
	public Users getUserById(@Param("id") int id);

}


	



