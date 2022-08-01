package com.pliniopereira10.biggamesurvey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pliniopereira10.biggamesurvey.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
