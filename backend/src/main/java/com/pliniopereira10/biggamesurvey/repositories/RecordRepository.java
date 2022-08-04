package com.pliniopereira10.biggamesurvey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pliniopereira10.biggamesurvey.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

}
