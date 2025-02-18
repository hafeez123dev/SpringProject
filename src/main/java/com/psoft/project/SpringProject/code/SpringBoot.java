package com.psoft.project.SpringProject.code;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SpringBoot {
	
		@GetMapping("/spring")
		public static String name()
		{
			
			return "SpringBoot project-1" ;
		}
		@GetMapping("/springboot")
		public static String springboot()
		{
			
			return "SpringBoot 3rd method" ;
		}
		
		

}
