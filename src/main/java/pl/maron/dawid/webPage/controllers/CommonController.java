package pl.maron.dawid.webPage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommonController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(){
        return "main";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(){
        return "about";
    }
    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contact() {
        return "contact";
    }

}
