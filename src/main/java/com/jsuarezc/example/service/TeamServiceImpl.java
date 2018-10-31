package com.jsuarezc.example.service;

import com.jsuarezc.example.domain.Team;
import com.jsuarezc.example.exception.ServiceException;
import com.jsuarezc.example.repository.TeamRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public Team getTeam(Long id) throws ServiceException {
        return teamRepository.findOne(id);
    }

    public List<Team> getAllTeam() throws ServiceException{
        return teamRepository.findAll();
    }

    public Team saveTeam(Team team) throws ServiceException{
        return teamRepository.save(team);
    }

    public Team putTeam(Long id, Team team) throws ServiceException{
        team.setId(id);
        return teamRepository.save(team);
    }

    public Team patchTeam(Long id, Team team) throws ServiceException{
        team.setId(id);
        //montar el patch a mano
        return teamRepository.save(team);
    }

	public boolean deleteTeam(Long id) throws ServiceException {
		try {
			teamRepository.delete(id);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

}
