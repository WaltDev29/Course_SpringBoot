package kr.ac.kopo.waltdev29.study_springboot.controller;

import kr.ac.kopo.waltdev29.study_springboot.Exception.UserException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("chp11_01")
public class Chp11_01 {
    @GetMapping("/exam01")
    @ResponseStatus(value= HttpStatus.BAD_REQUEST, reason="URI 요청이 잘못되었습니다.")
    public void method01() {
        System.out.println(new IllegalArgumentException("요청에 실패했습니다.").getMessage());
    }

    @GetMapping("/exam02")
    public void method02() throws Exception {
        throw new Exception(new UserException("User Exception 메시지입니다."));
    }
}
