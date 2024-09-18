package com.example.demo.entity;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor//có tham số
@NoArgsConstructor//không có tham số
public class Student {
    //Tên không được phép null
    @NotBlank(message = "Name can not be blank!")
    String name;
    @NotBlank(message = "Code can not be blank!")
    //Điều kiện bắt buộc là SE + 6 số nguyên
    String studentCode;
    float score;

}
