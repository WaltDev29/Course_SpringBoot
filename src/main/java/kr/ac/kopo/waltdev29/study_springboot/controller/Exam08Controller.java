package kr.ac.kopo.waltdev29.study_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// 2026.03.31
// @RequestParam 실습

@Controller
@RequestMapping(value = "exam08")
public class Exam08Controller {


    @GetMapping
    public String get_book_by_id(
            Model model,
            @RequestParam("id") String userId,  // Query Parameter (속성 : value, required, defaultValue)
            @RequestParam(value="pwd", defaultValue = "unknown") String userPwd)    // defaultValue 설정하면 자동으로 required = false
    {
        model.addAttribute("userId", userId);
        model.addAttribute("userPwd", userPwd);
        return "view08";
    }
}
