package kr.ac.kopo.waltdev29.study_springboot.domain;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class ImageFile {
    private String name;
    private MultipartFile fileImage;
}
