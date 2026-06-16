package kr.ac.kopo.waltdev29.study_springboot.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.Objects;

@Controller
@RequestMapping("/exam21")
public class Exam21Controller {
    @GetMapping("exam01")
    public String requestMethod1() {
        return "view21";
    }

    @GetMapping("/home/main")
    public String requestMethod2(Model model) {
        model.addAttribute("viewName", "homePage.html");
        return "homePage";
    }

    @GetMapping("/member/main")
    public String requestMethod3(Model model) {
        model.addAttribute("viewName", "mamberPage.html");
        return "memberPage";
    }

    @GetMapping("/manager/main")
    public String requestMethod4(Model model) {
        model.addAttribute("viewName", "managerPage.html");
        return "managerPage";
    }

    @GetMapping("/admin/main")
    public String requestMethod5(Model model) {
        model.addAttribute("viewName", "adminPage.html");
        return "adminPage";
    }

    @GetMapping("/exam02")
    public String requestMethod6() {
        return "redirect:/exam21/member/user";
    }

    @GetMapping("/member/user")
    public String requestMethod7(Authentication authentication, Model model) {
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String userName = Objects.requireNonNull(userDetails).getUsername();
        String password = userDetails.getPassword();
        model.addAttribute("userName", userName);
        model.addAttribute("password", password);
        model.addAttribute("uri", "/member/user");
        Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
        for (GrantedAuthority item: authorities) {
            model.addAttribute("role", item + " ");
        }

        return "view22";
    }

    @GetMapping("/exam03")
    public String requestMethod8() {
        return "view23";
    }

    @GetMapping("/manager/tag")
    public String requestMethod9() {
        return "view23";
    }

}
