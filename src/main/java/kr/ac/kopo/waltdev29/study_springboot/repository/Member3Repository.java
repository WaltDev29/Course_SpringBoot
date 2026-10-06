package kr.ac.kopo.waltdev29.study_springboot.repository;

import kr.ac.kopo.waltdev29.study_springboot.domain.Member3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Member3Repository extends JpaRepository<Member3, Integer> {

}
