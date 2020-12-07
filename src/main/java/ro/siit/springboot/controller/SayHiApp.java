package ro.siit.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.siit.springboot.model.Hi;

@Controller
@RequestMapping("/sayHiApp")
public class SayHiApp {
    @GetMapping()
    public String renderForm (Model model){
        model.addAttribute("keyOfAttribute", Integer.valueOf(2));

        return "formPage";
    }

    @GetMapping("/sayHi/{name}")
    public String renderSalutation (@PathVariable String name, Model model){
        Hi salut = new Hi(name);

        model.addAttribute("salut", salut);

        return "salut";
    }
}
