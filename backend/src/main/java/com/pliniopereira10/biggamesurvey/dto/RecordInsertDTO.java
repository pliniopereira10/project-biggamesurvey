package com.pliniopereira10.biggamesurvey.dto;

public class RecordInsertDTO {
	
	private String name;
	private Integer age;
	private Long gameId;
	
	public RecordInsertDTO() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getGameId() {
		return gameId;
	}

	public void setGameId(Long gameId) {
		this.gameId = gameId;
	}
	
	
}
