package com.pliniopereira10.biggamesurvey.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pliniopereira10.biggamesurvey.dto.RecordDTO;
import com.pliniopereira10.biggamesurvey.dto.RecordInsertDTO;
import com.pliniopereira10.biggamesurvey.entities.Game;
import com.pliniopereira10.biggamesurvey.entities.Record;
import com.pliniopereira10.biggamesurvey.repositories.GameRepository;
import com.pliniopereira10.biggamesurvey.repositories.RecordRepository;

@Service
public class RecordService {
	
	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly=true)
	public RecordDTO insert(RecordInsertDTO dto){
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getReferenceById(dto.getGameId());
		entity.setGame(game);
		
		entity = repository.save(entity);
		
		return new RecordDTO(entity);
	}
	
	@Transactional(readOnly=true)
	public Page<RecordDTO> findByMoment(Instant minDate, Instant maxDate, PageRequest pageRequest) {
		return repository.findByMoments(minDate, maxDate, pageRequest).map(x -> new RecordDTO(x));
	}
	
}
