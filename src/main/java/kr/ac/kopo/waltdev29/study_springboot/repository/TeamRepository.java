package kr.ac.kopo.waltdev29.study_springboot.repository;

import kr.ac.kopo.waltdev29.study_springboot.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {
}
