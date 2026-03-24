package kr.ac.kopo.waltdev29.study_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/exam05")  // url_Prefix 처럼 사용
public class Exam05Controller {
    @GetMapping(value = "/1")   // GetMapping 어노테이션 사용
    public String requestMethod1(Model model) {
        String text = "1번 GetMapping";
        model.addAttribute("text", text);
        return "view05";
    }

    @GetMapping(value = "/2")
    public String requestMethod2(Model model) {
        String text = "2번 GetMapping";
        model.addAttribute("text", text);
        return "view05";
    }
}
