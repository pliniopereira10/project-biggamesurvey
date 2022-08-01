package com.pliniopereira10.biggamesurvey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pliniopereira10.biggamesurvey.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
