package kr.ac.kopo.waltdev29.study_springboot.repository;

import kr.ac.kopo.waltdev29.study_springboot.domain.Product2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Product2Repository extends JpaRepository<Product2, Integer> {

}
