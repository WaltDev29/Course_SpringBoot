package kr.ac.kopo.waltdev29.study_springboot.Exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(basePackages={"kr.ac.kopo.waltdev29"})
public class GlobalException{
    @ExceptionHandler(RuntimeException.class)
    public String exceptionMethod(Exception ex, Model model) {
        model.addAttribute("data1", "Global Exception 메시지입니다.");
        model.addAttribute("data2", ex);
        return "chp11_03";
    }
}
