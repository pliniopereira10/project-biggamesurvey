package com.pliniopereira10.biggamesurvey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pliniopereira10.biggamesurvey.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
