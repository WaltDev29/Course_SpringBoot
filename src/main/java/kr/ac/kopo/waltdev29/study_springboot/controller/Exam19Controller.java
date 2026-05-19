package kr.ac.kopo.waltdev29.study_springboot.controller;

import jakarta.validation.Valid;
import kr.ac.kopo.waltdev29.study_springboot.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/exam19")
public class Exam19Controller {
    @GetMapping
    public String requestForm(Model model) {
        model.addAttribute("student", new Student());
        return "view19";
    }

    @PostMapping
    public String submitForm(@Valid @ModelAttribute Student student, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "view19";

        return "view19_result";
    }
}
