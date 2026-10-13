package kr.ac.kopo.waltdev29.study_springboot.repository;

import kr.ac.kopo.waltdev29.study_springboot.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
