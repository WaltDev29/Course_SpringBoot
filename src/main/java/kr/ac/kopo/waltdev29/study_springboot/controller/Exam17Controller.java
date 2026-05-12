package kr.ac.kopo.waltdev29.study_springboot.controller;

import kr.ac.kopo.waltdev29.study_springboot.domain.ImageFile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

// @RequestParam을 사용하여 파일 받기

@Controller
@RequestMapping(value="/exam17")
public class Exam17Controller {
    @GetMapping(value = "/form")
    public String requestForm() {
        return "view17";
    }

    @PostMapping(value="/form")
    public String requestFileUploadResult(
            @ModelAttribute ImageFile file,
            Model model) {
        String name = file.getName();
        MultipartFile image = file.getFileImage();
        String fileName = image.getOriginalFilename();

        // 저장할 파일 객체
        File saveFile = new File("D:\\course\\springboot_upload\\" + name + "_" + fileName);
        // 파일 저장
        try {
            image.transferTo(saveFile);
            model.addAttribute("originFileName", fileName);
            model.addAttribute("saveFileName", saveFile.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        model.addAttribute("title", "MultipartHttpServletRequest 예제");
        return "view17_process";
    }
}
