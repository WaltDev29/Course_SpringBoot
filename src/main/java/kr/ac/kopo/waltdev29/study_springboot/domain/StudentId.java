package kr.ac.kopo.waltdev29.study_springboot.domain;

import jakarta.validation.Constraint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = StudentIdValidator.class)
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface StudentId {
    String message() default "중복된 아이디입니다.";
    Class<?>[] groups() default {};
    Class<?>[] payload() default {};
}
