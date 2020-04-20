package us.jessup.chuckquotes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import us.jessup.chuckquotes.service.ChuckJokeService;

@Controller
public class JokeController {
    private final ChuckJokeService jokeService;

    public JokeController(ChuckJokeService jokeService) {this.jokeService = jokeService;}

    @RequestMapping("/")
    public String getJoke(Model model) {

        String chuckJoke = jokeService.getJoke();
        model.addAttribute("joke", chuckJoke);

        return "chucknorris";

    }
}
