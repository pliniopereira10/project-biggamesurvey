package com.pliniopereira10.biggamesurvey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pliniopereira10.biggamesurvey.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
