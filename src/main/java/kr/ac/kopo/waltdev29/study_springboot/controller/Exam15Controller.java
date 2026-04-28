package kr.ac.kopo.waltdev29.study_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

@Controller
@RequestMapping(value="/exam15")
public class Exam15Controller {
    @GetMapping(value = "/form")
    public String requestForm() {
        return "view15";
    }

    @PostMapping(value="/form")
    public String requestFileUploadResult(MultipartHttpServletRequest request, Model model) {
        String name = request.getParameter("name");

        // 전송받은 파일 객체
        MultipartFile file = request.getFile("fileImage");
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
        return "view15_process";
    }
}
