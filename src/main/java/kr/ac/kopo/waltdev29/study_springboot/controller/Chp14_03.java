package kr.ac.kopo.waltdev29.study_springboot.controller;

import kr.ac.kopo.waltdev29.study_springboot.domain.Detail;
import kr.ac.kopo.waltdev29.study_springboot.domain.Product2;
import kr.ac.kopo.waltdev29.study_springboot.repository.DetailRepository;
import kr.ac.kopo.waltdev29.study_springboot.repository.Product2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam14_03")
public class Chp14_03 {
    @Autowired
    private Product2Repository product2Repository;

    @Autowired
    private DetailRepository detailRepository;

    @GetMapping
    public String requestInsert(Model model) {
        Product2 product2 = new Product2();
        product2.setName("iPhone Duo");
        product2.setPrice(3000000);

        Detail detail = new Detail();
        detail.setDescription("폴더블");
        detail.setWeight(300);
        detail.setWidth(124.5f);
        detail.setHeight(132.7f);

        product2.setDetail(detail);

        product2Repository.save(product2);

        Iterable<Product2> product2List = product2Repository.findAll();
        Iterable<Detail> detailList = detailRepository.findAll();

        model.addAttribute("product2List", product2List);
        model.addAttribute("detailList", detailList);

        return "chp14_07";
    }

    @GetMapping("/delete/{id}")
    public String requestDelete(@PathVariable Integer id) {
        product2Repository.deleteById(id);
        return "redirect:/exam14_03";
    }
}
