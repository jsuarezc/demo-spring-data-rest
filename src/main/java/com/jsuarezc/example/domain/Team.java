package com.jsuarezc.example.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Team implements Serializable {

	private static final long serialVersionUID = -217554018216420493L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_TEAM")
	@SequenceGenerator(name = "SEQ_TEAM", sequenceName = "SEQ_ID_TEAM")
	private Long id;
	private String name;
	private String location;
	
	@OneToMany(cascade=CascadeType.ALL) 
	@JoinColumn(name="teamId")
	private Set<Player> players;
	
	public Team() {
	}
	
	public Team(String name, String location, Set<Player> players) {
		this();
		this.name = name;
		this.location = location;
		this.players = players;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Set<Player> getPlayers() {
		return players;
	}
	public void setPlayers(Set<Player> players) {
		this.players = players;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
