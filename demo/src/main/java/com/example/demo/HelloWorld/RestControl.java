package com.example.demo.HelloWorld;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


//@RestController(value="/rest")
@RestController
public class RestControl {
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello world";
	}
	
	@GetMapping("/helloworld")
	public HelloWorld hello() {
		return new HelloWorld("HelloWorld");
	}
	
	@GetMapping(path = "/helloworld/{name}")
	public HelloWorld hello(@PathVariable String name) {
		return new HelloWorld(String.format("HelloWorld , %s", name));
	}
	
}
