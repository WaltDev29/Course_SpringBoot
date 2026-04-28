package kr.ac.kopo.waltdev29.study_springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // "/images/ 로 시작하는 요청이 들어오면 file:/~upload/ 하위의 리소스를 반환
        registry.addResourceHandler("/images/**")
                .addResourceLocations("file:///D:/course/springboot_upload/");
    }
}