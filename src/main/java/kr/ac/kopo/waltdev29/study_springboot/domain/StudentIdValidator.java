package kr.ac.kopo.waltdev29.study_springboot.domain;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.annotation.Annotation;

public class StudentIdValidator implements ConstraintValidator<StudentId, String> {

    @Override
    public void initialize(StudentId constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return !s.equalsIgnoreCase("admin");
    }
}
