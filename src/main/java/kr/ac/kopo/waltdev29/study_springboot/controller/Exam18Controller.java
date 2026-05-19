package kr.ac.kopo.waltdev29.study_springboot.controller;

import jakarta.validation.Valid;
import kr.ac.kopo.waltdev29.study_springboot.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/exam18")
public class Exam18Controller {
    @GetMapping
    public String requestForm(Model model) {
        model.addAttribute("product", new Product());
        return "view18";
    }

    @PostMapping
    public String submitForm(@Valid @ModelAttribute Product product, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "view18";

        return "view18_result";
    }
}
