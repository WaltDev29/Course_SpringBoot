package kr.ac.kopo.waltdev29.study_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

// @RequestParam을 사용하여 파일 받기

@Controller
@RequestMapping(value="/exam16")
public class Exam16Controller {
    @GetMapping(value = "/form")
    public String requestForm() {
        return "view16";
    }

    @PostMapping(value="/form")
    public String requestFileUploadResult(@RequestParam("name") String name, @RequestParam("fileImage") MultipartFile file, Model model) {
        String fileName = Objects.requireNonNull(file).getOriginalFilename();

        // 저장할 파일 객체
        File saveFile = new File("D:\\course\\springboot_upload\\" + name + "_" + fileName);

        // 파일 저장
        try {
            file.transferTo(saveFile);
            model.addAttribute("originFileName", fileName);
            model.addAttribute("saveFileName", saveFile.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        model.addAttribute("title", "MultipartHttpServletRequest 예제");
        return "view16_process";
    }
}
