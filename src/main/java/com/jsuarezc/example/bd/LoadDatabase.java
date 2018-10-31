package com.jsuarezc.example.bd;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jsuarezc.example.domain.Player;
import com.jsuarezc.example.domain.Team;
import com.jsuarezc.example.repository.TeamRepository;

@Configuration
public class LoadDatabase {

	@Bean
	CommandLineRunner initDatabase(TeamRepository teamRepository) {
		return args -> {
			Set<Player> players = new HashSet<>();
			players.add(new Player("Neymar", "Segundo mejor jugador del mundo"));
			players.add(new Player("Messi", "Dios"));
			Team team = new Team("FCB Barcelona", "Barcelona", players);
			teamRepository.save(team);
			
			players = new HashSet<>();
			players.add(new Player("Ronaldo", "Que 'inyusticia'"));
			players.add(new Player("Zidanne", "creacion"));
			team = new Team("Real madrid", "Madrid", players);
			teamRepository.save(team);
			
			players = new HashSet<>();
			players.add(new Player("Diego Costa", "Delantero"));
			players.add(new Player("Filipe Luis", "Defensa"));
			team = new Team("Atletico de Madrid", "Madrid", players);
			
			teamRepository.save(team);
		};
	}
	
}
