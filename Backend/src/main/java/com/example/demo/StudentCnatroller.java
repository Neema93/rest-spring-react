package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentCnatroller {
  @GetMapping("/student")
  public student getStudent(){
    System.out.println("Hello..");
      return new student("neema", "patel");
  }
      
}
