package kr.ac.kopo.waltdev29.study_springboot.controller;

import kr.ac.kopo.waltdev29.study_springboot.Exception.UserException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chp11_02")
public class Chp11_02 {
    @GetMapping("exam01")
    public void method01() {
        throw new UserException("User Exception 메시지입니다.");
    }

    @ExceptionHandler(UserException.class)
    public String exceptionMethod(UserException ex, Model model) {
        model.addAttribute("data1", ex.getMessage());
        model.addAttribute("data2", ex);
        return "chp11_02";
    }

}
