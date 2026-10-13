package kr.ac.kopo.waltdev29.study_springboot.controller;

import kr.ac.kopo.waltdev29.study_springboot.domain.Member3;
import kr.ac.kopo.waltdev29.study_springboot.repository.Member3Repository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//JPA 두번째 예제
@Controller
@RequestMapping("/exam14_02")
public class Chp14_02 {
    @Autowired
    Member3Repository2 repository;
    //    Read(select)
    @GetMapping
    public String viewHomePage(Model model){
        Iterable<Member3> memberList = repository.selectMembers();
        model.addAttribute("memberList", memberList);
        return "chp14_04";
    }
    //    Create를 위한 입력 화면
    @GetMapping("/new")
    public String newInputMember3(Model model){
        Member3 member3 = new Member3();
        model.addAttribute("member", member3);
        return "chp14_05";
    }

    //    Create(insert) 실행
    @PostMapping("/insert")
    public String insertMember3(@ModelAttribute("member") Member3 member3){
        repository.insertMember(member3.getName(), member3.getAge(), member3.getEmail());
        return "redirect:/exam14_02";
    }

    //Update
    @GetMapping("/edit/{id}")
    public String updateInputMethod(@PathVariable Integer id, Model model) {
        Member3 member3 = repository.selectMemberById(id);
        model.addAttribute("member", member3);
        return "chp14_06";
    }

    @PostMapping("/update")
    public String StringMember3(@ModelAttribute("member") Member3 member3) {
        repository.updateMember(member3.getName(), member3.getAge(), member3.getEmail(), member3.getId());
        return "redirect:/exam14_02";
    }

    //Delete
    @GetMapping("/delete/{id}")
    public String deleteMember(@PathVariable Integer id) {
        repository.deleteMember(id);
        return "redirect:/exam14_02";
    }
}
