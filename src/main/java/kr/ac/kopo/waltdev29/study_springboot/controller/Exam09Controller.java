package kr.ac.kopo.waltdev29.study_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

// 2026.03.31
// @PathVariable 실습

@Controller
@RequestMapping(value = "/exam09")
public class Exam09Controller {
    @GetMapping(value="/{name}/{birth}")
    public String requestMethod(
            Model model,
            @PathVariable("name") String name,
            @PathVariable("birth") int birth
            )
    {
        model.addAttribute("name", name);

        // 출생연도를 받아 나이 계산하여 반환하기
        int curYear = LocalDate.now().getYear();
        int age = curYear - birth + 1;
        model.addAttribute("age", age);

        return "view09";
    }
}
