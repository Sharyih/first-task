package pl.edu.vistula.first_task.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello vistula, this is my first controller";
    }

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="world") String name,
            Model model) {

        model.addAttribute("name", name);
        return "greeting";
    }
}