package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retriveAllCourses() {
		return Arrays.asList(new Course(1, "Learn AWS", "in28mins"), new Course(2, "Learn DevOps", "in28mins"),
				new Course(3, "Learn SpringBoot", "in28mins"));
	}
	
	@RequestMapping("/myself")
	public List<MySelf> myData() {
		return Arrays.asList(new MySelf("Shubham", "Singh", "Rathore"),
				new MySelf("RajPal", "Singh", "Rathore"),
				new MySelf("Meera", null, "Rathore"),
				new MySelf("Mohini", "Shubham", "Rathore"));
	}
}
