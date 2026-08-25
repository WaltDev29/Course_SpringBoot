package kr.ac.kopo.waltdev29.study_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chp13_01")
public class Chp13_01 {
    @GetMapping("/exam01")
    public String showForm() {
        return "chp13_01_form";
    }

//    @RequestBody는 input 태그의 name과 사용자가 입력한 값을 사용해서 key-value로 구성된 JSON 형식의 Rest 문자열을 만듦.
    @PostMapping
    public String submit(@RequestBody String param, Model model) {
        model.addAttribute("data1", "@RequestBoyd로 정보 받기");
        model.addAttribute("data2", param);

        return "chp13_01_result";
    }

}
