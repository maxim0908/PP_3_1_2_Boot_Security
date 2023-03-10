package ru.kata.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class LoginController {
    @GetMapping("/login")
    public String showLoginForm(Model model) {
        return "login";
    }
    @PostMapping("/login")
    public String processLogin() {
        return "redirect:/";
    }
}




