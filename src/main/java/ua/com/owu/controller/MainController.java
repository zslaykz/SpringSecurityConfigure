package ua.com.owu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.enterprise.inject.Model;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model){
        return "index";
    }

    @PostMapping("/save")
    public String save(){
        return "redirect:/";
    }

    @GetMapping("/adm")
    public String adm(){
        return "admin";
    }

    @GetMapping("/logim")
    public String login(){
        return "login";
    }
}
