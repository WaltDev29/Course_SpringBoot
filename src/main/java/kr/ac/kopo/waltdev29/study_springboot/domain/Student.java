package kr.ac.kopo.waltdev29.study_springboot.domain;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Student {
    @NotNull
    @StudentId
    private String studentId;

    @Size(min=4, max=10, message = "4~10 길이의 문자열로 작성해야합니다.")
    private String studentPw;
}
