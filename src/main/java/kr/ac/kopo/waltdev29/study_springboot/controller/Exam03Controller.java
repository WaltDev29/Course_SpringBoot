package kr.ac.kopo.waltdev29.study_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/exam03", method= RequestMethod.GET)     // url prefix 같은 느낌
public class Exam03Controller {
    @RequestMapping
    public String requestMethod() {
        return "view03";
    }

    @RequestMapping(value="/exam03_1", method=RequestMethod.GET)  // exam03/exam04로 접속해야 함.
    public String requestMetho2() {
        return "view03_1";

    }
}
