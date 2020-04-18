package com.astrogazer.astrogazer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {
    @RequestMapping("/")//просто для примера
    public String start(Model model)
    {
        return "index.html";
    }
}
