package com.jsuarezc.example.service;

import com.jsuarezc.example.domain.Team;
import com.jsuarezc.example.exception.ServiceException;

import java.util.List;

public interface TeamService {

    public Team getTeam(Long id) throws ServiceException;
    public List<Team> getAllTeam() throws ServiceException;
    public Team saveTeam(Team team) throws ServiceException;
    public Team putTeam(Long id, Team team) throws ServiceException;
    public Team patchTeam(Long id, Team team) throws ServiceException;
    public boolean deleteTeam(Long id) throws ServiceException;

}
