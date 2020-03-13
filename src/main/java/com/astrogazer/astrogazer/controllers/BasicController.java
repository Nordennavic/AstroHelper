package com.astrogazer.astrogazer.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//в отличае от просто контроллера возвращает не view
public class BasicController {

    @RequestMapping("/example")//просто для примера
    public String example(Model model)
    {
        return "Hello world!";
    }

}
