package com.example.chuckjok.controllers;

import com.example.chuckjok.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokServiceController
{
    private final JokService jokService;

    public JokServiceController(JokService jokService)
    {
        this.jokService = jokService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {

        model.addAttribute("joke", jokService.getJoke());

        return "index";
    }
}
