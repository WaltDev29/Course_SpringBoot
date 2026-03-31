package kr.ac.kopo.waltdev29.study_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//2026.03.31
// MultiValueMap

@Controller
@RequestMapping("/exam11")
public class Exam11Controller {
    @GetMapping("/{id1}/user/{id2}")
    public String requesMethod(
            Model model,
            @MatrixVariable(pathVar = "id1") MultiValueMap <String, String> var1,   // pathVar를 사용해 파라미터 위치를 지정
            @MatrixVariable(pathVar = "id2") MultiValueMap <String, String> var2    // Map 객체로 파라미터 받음
            )
    // http://localhost:8080/exam11/a;name=walter,ho;age=10,20/user/b;passwd=1234,qwer
    // var1 = {name=[walter, ho], age=[10, 20]}
    // var2 = {passwd=[1234, qwer]}
    {
        model.addAttribute("var1", var1);
        model.addAttribute("var2", var2);
        return "view11";
    }
}
