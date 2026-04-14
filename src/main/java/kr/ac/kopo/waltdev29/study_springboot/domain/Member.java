package kr.ac.kopo.waltdev29.study_springboot.domain;

import lombok.Data;

import java.util.List;

@Data   // getter,setter 자동 생성
public class Member {
    // Form 태그 내의 input들의 name 속성
    private String id;
    private String passwd;
    private String city;
    private String gender;
    private List<String> hobby;
    private String greetings;
}
