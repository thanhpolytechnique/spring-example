package org.ttu.hello_word;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String  helloWord() {
		return "welcome to Thanh's world";
	}

	@GetMapping("/{name}")
	public String helloWord(@PathVariable String name) {
		return "Hi " + name + ", your app deployed successfully";
	}

}
