package com.pliniopereira10.biggamesurvey.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.pliniopereira10.biggamesurvey.entities.enums.Platform;

@Entity
@Table(name = "tb_game")
public class Game implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
 	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private Platform platform;
	
	// um game está associado há um gênero
	@ManyToOne
	@JoinColumn(name = "genre_id")
	private Genre genre;
	
	// um game está associado há vários registros
	@OneToMany(mappedBy = "game")
	private List<Record> listRecords = new ArrayList<>();
	
	public Game() {
		
	}

	public Game(Long id, String title, Platform platform, Genre genre) {
		this.id = id;
		this.title = title;
		this.platform = platform;
		this.genre = genre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public List<Record> getListRecords() {
		return listRecords;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}

	
	
	
}