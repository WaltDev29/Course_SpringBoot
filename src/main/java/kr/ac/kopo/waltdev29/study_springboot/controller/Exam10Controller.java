package kr.ac.kopo.waltdev29.study_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

// 2026.03.31
// @MatrixVariable 실습

@Controller
@RequestMapping("/exam10")
public class Exam10Controller {
    @GetMapping("/{id}")
    public String requestMethod(
            Model model,
            @PathVariable("id") String userId,
            @MatrixVariable("passwd") String userPwd    // 세미콜론으로 파라미터 구분 http://localhost:8080/exam10/waltdev29;passwd=1234
            )
    {
        model.addAttribute("id", userId);
        model.addAttribute("pwd", userPwd);
        return "view10";
    }
}
