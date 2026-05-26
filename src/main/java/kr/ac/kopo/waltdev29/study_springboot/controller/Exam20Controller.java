package kr.ac.kopo.waltdev29.study_springboot.controller;

import jakarta.validation.Valid;
import kr.ac.kopo.waltdev29.study_springboot.domain.Person;
import kr.ac.kopo.waltdev29.study_springboot.domain.PersonValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/exam20")
public class Exam20Controller {
    @Autowired
    private PersonValidator personValidator;

    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("person", new Person());
        return "view20";
    }

    @PostMapping
    public String submit(@Valid @ModelAttribute Person person, BindingResult bindingResult) {
    if (bindingResult.hasErrors())
        return "view20";

    return "view20_result";
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(personValidator);
    }
}
