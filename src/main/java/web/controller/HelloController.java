package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("Let's try to know about cars...");
		messages.add("Add to the end of your Url '/cars?count=2' or '/cars?count=3' or '/cars'");
		model.addAttribute("messages", messages);
		return "index";
	}
}