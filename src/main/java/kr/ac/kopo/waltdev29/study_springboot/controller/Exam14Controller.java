package kr.ac.kopo.waltdev29.study_springboot.controller;

import kr.ac.kopo.waltdev29.study_springboot.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/exam14")
public class Exam14Controller {
    @GetMapping
    public String requestMethod() {
        return "view14";
    }

    @PostMapping
    public String postMethod(
            @ModelAttribute Member member, // 어노테이션 생략가능
            Model model
    ) {
        model.addAttribute("member", member);
        return "view14_page";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
//        binder.setAllowedFields("id", "city", "hobby", "greetings");    // 해당 속성만 바인딩
        binder.setDisallowedFields("passwd", "gender"); // 해당 속성 이외의 속성만 바인딩
    }
}
