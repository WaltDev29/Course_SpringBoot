package kr.ac.kopo.waltdev29.study_springboot.controller;

import kr.ac.kopo.waltdev29.study_springboot.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/member")
public class Exam12Controller {
    @GetMapping
    public String requestMethod() {
        return "view12";
    }

    @PostMapping
//    @ResponseBody   // HTMl이 아닌 데이터를 반환하고 싶을 때 사용
    public String postMethod(
            @ModelAttribute Member member, // 어노테이션 생략가능
            Model model
    ) {
        model.addAttribute("member", member);
        return "view12_page";
    }
}
