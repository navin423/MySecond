package com.example.demo.HelloWorld;

public class HelloWorld {

	public String message;
	 
	public HelloWorld(String message) {
		this.message=message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorld [message=" + message + "]";
	}
	
	
}
