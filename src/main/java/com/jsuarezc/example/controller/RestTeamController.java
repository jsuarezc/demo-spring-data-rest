package com.jsuarezc.example.controller;


import java.util.List;

import com.jsuarezc.example.domain.Team;
import com.jsuarezc.example.exception.ServiceException;
import com.jsuarezc.example.service.TeamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@RestController
public class RestTeamController {
	
	@Autowired
	private TeamService teamService;

	@GetMapping("/teams/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Team getTeam(@PathVariable Long id) throws ServiceException{
		return teamService.getTeam(id);
	}
	
	@GetMapping("/teams")
	@ResponseStatus(HttpStatus.OK)
	public List<Team> getAllTeam() throws ServiceException{
		return teamService.getAllTeam();
	}
	
	@PostMapping(value = "/teams", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public Team saveTeam(@RequestBody Team team) throws ServiceException{
		return teamService.saveTeam(team);
	}
	
	@PutMapping(value = "/teams/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public Team putTeam(@PathVariable Long id, @RequestBody Team team) throws ServiceException{
		return teamService.putTeam(id, team);
	}
	
	@PatchMapping(value = "/teams/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public Team patchTeam(@PathVariable Long id, @RequestBody Team team) throws ServiceException {
		//TODO: implementar un metodo con una actualizacion parcial
		return teamService.patchTeam(id, team);
	}
	
	@DeleteMapping("/teams/{id}")
	@ResponseStatus(HttpStatus.OK)
	public boolean deleteTeam(@PathVariable Long id) throws ServiceException{
		return teamService.deleteTeam(id);
	}
}
