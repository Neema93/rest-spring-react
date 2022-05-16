package com.example.demo;

import java.util.ArrayList;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StudentCnatroller {
  @GetMapping("/student")
  public student getStudent(){
    System.out.println("Hello..");
      return new student("neema", "patel");
  }
  
	@GetMapping("/students")
	public List<student> getStudents(){		
		List <student> students = new ArrayList<>();
		students.add(new student("Ramesh", "Fadatare"));
		students.add(new student("Tony", "Cena"));
		students.add(new student("Sanjay", "Jadhav"));
		students.add(new student("Ram", "Jadhav"));
		students.add(new student("Umesh", "Fadatare"));
		return students;
	}
}
      

