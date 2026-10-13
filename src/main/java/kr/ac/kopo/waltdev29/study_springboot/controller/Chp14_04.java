package kr.ac.kopo.waltdev29.study_springboot.controller;

import kr.ac.kopo.waltdev29.study_springboot.domain.Player;
import kr.ac.kopo.waltdev29.study_springboot.domain.Team;
import kr.ac.kopo.waltdev29.study_springboot.repository.PlayerRepository;
import kr.ac.kopo.waltdev29.study_springboot.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam14_04")
public class Chp14_04{
    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    TeamRepository teamRepository;

    @GetMapping
    public String requestInsert(Model model) {
        Team team = new Team();
        team.setName("아르니온");

        Player player1 = new Player();
        player1.setName("김호석");
        player1.setTeam(team);

        Player player2 = new Player();
        player2.setName("안은호");
        player2.setTeam(team);

        teamRepository.save(team);
        playerRepository.save(player1);
        playerRepository.save(player2);

        Iterable<Team> teamList = teamRepository.findAll();
        Iterable<Player> playerList = playerRepository.findAll();

        model.addAttribute("teamList", teamList);
        model.addAttribute("playerList", playerList);

        return "chp14_08";
    }
}
