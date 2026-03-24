package kr.ac.kopo.waltdev29.study_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/exam07")
public class Exam07Controller {
    @GetMapping(value = "/1")
    public ModelAndView exam07func() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("title", "Exam 07 ModelAndView");
        mav.addObject("data", "ModelAndView 실습");
        mav.setViewName("view07");
        return mav;
    }
}
