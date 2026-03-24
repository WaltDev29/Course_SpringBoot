package kr.ac.kopo.waltdev29.study_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class Exam04Controller {
    @RequestMapping(value="/exam04_1", method= RequestMethod.GET)
    public String requestMethod() {
        return "view04_1";
    }

    @RequestMapping(value="/exam04_2", method= RequestMethod.GET)
    public String requestMetho2() {
        return "view04_2";
    }
}
