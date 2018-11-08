package com.sreeram.joke.jokeapp.controllers;

import com.sreeram.joke.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    @Autowired
    JokeService jokeService;

    @RequestMapping({"/",""})
    public String showJokes(Model model){
        model.addAttribute("joke",jokeService.getJokes());
        return "chucknorris";
    }
}
