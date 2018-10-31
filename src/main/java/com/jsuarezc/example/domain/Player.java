package com.jsuarezc.example.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;

@XmlRootElement
@Entity
public class Player implements Serializable {

	private static final long serialVersionUID = 5524597996639268743L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_PLAYER")
	@SequenceGenerator(name = "SEQ_PLAYER", sequenceName = "SEQ_ID_PLAYER")
	private Long id;
	private String name;
	private String position;
	
	public Player() {
	}
	
	public Player(String name, String position) {
		this();
		this.name = name;
		this.position = position;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
