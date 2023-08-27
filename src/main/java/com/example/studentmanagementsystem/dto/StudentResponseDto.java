package com.example.studentmanagementsystem.dto;

import com.example.studentmanagementsystem.enums.Gender;
import com.example.studentmanagementsystem.enums.Status;
import com.example.studentmanagementsystem.model.Address;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentResponseDto {
    private int studentId;
    private String name;
    private String email;
    private Gender gender;
    private int age;
    private Status status;

    private String password;

    private Address address;

}
