package kr.ac.kopo.waltdev29.study_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/exam13")
public class Exam13Controller {
    @GetMapping
    public String showPage() {return "view13";}

    @ModelAttribute // 함수 자체에 ModelAttribute 어노테이션 설정 가능
    public void setTitle(Model model) {
        model.addAttribute("title", "@ModelAttribute 예제");
    }

    @ModelAttribute("color")    // attribute 지정도 가능
    public List<String> color() {
        return Arrays.asList("red", "green", "blue");
    }
}
