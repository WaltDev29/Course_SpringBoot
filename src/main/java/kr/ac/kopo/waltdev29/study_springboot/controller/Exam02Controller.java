package kr.ac.kopo.waltdev29.study_springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exam02Controller {
    @RequestMapping(value = "/exam02", method= RequestMethod.GET)
    public String requestMethod() {
        return "<h1>@RestController 실습</h1>";
    }
}
