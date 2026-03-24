package kr.ac.kopo.waltdev29.study_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "exam06")
public class Exam06Controller {
    @GetMapping(value="/1")
    public String exam06func(Model model) {
        model.addAttribute("title", "Model 유형 연습");
        model.addAttribute("data1", "Model.addAttribute");
        model.addAttribute("data2", "문자열 또는 객체참조값 전달 가능");
        return "view06";
    }
}
