package com.main.projectrnsk.controllers;

import com.main.projectrnsk.models.Admonition;
import com.main.projectrnsk.models.Users;
import com.main.projectrnsk.service.AdmonitionService;
import com.main.projectrnsk.service.UsersService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private UsersService usersService;

    @Autowired
    private AdmonitionService admonitionService;

    @GetMapping("/")
    public String index(@NotNull Model model){
//        List<Users> users = usersService.getAllUsers();
//        model.addAttribute("users",users);
        List<Admonition> admonitions = admonitionService.getAllAdmonition();
        model.addAttribute("admonitions",admonitions);
        return "index.html";
    }

    @GetMapping("/index")
    public String index2(){
        return "startPage";
    }
}
