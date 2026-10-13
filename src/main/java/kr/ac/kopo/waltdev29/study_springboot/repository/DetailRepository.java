package kr.ac.kopo.waltdev29.study_springboot.repository;

import kr.ac.kopo.waltdev29.study_springboot.domain.Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailRepository extends JpaRepository<Detail, Integer> {
    
}
