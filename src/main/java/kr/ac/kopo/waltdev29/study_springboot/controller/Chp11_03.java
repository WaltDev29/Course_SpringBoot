package kr.ac.kopo.waltdev29.study_springboot.controller;

import kr.ac.kopo.waltdev29.study_springboot.Exception.UserException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chp11_03")
public class Chp11_03 {
    @GetMapping("exam01")
    public void method01() {
        throw new UserException("User Exception 메시지입니다.");
    }
}
