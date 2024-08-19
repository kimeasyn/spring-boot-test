package me.xfactor.springboottest.controller;

import lombok.RequiredArgsConstructor;
import me.xfactor.springboottest.dto.AddUserRequest;
import me.xfactor.springboottest.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class UserApiContorller {

    private final UserService userService;

    @PostMapping("/user")
    public String signup(AddUserRequest request) {
        userService.save(request);
        return "redirect:/login";
    }
}
