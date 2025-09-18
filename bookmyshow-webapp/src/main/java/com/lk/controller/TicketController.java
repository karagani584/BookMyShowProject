package com.lk.controller;

import com.lk.dto.LoginRequestDto;
import com.lk.dto.LoginResponseDto;
import com.lk.dto.SignupUserRequestDto;
import com.lk.dto.SignupUserResponseDto;
import com.lk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class TicketController {

    @Autowired
    private UserService userService;

    // Home page
    @GetMapping
    public String index() {
        return "index";
    }

    // Show signup form
    @GetMapping("/signup")
    public String showSignupForm(Model model) {
        model.addAttribute("signupRequest", new SignupUserRequestDto());
        return "signup";
    }

    // Handle signup
    @PostMapping("/signup")
    public String signup(@ModelAttribute("signupRequest") SignupUserRequestDto signupRequest,
                         Model model) {
        SignupUserResponseDto response = userService.signup(signupRequest);
        model.addAttribute("resp", response);

        if (response.isSuccess()) {
            return "signupSuccess";
        } else {
            return "error";
        }
    }

    // Show login form
    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("loginRequest", new LoginRequestDto());
        return "login";
    }

    // Handle login
    @PostMapping("/login")
    public String login(@ModelAttribute("loginRequest") LoginRequestDto loginRequest,
                        Model model) {
        LoginResponseDto response = userService.login(loginRequest);
        model.addAttribute("resp", response);

        if (response.isSuccess()) {
            return "loginResult";
        } else {
            return "error";
        }
    }
}
