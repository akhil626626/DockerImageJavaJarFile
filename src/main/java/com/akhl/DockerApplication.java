package com.akhl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/home")
public class DockerApplication {
	 @GetMapping("/info/{name}")
	public String displyMsg(@PathVariable (value = "name") String name){

		 return "Hello welcome  to my page " + name ;

	}

	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}

}
