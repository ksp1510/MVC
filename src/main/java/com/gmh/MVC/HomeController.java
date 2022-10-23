package com.gmh.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/service")
    public String service() {
        return "service";
    }

    @GetMapping("/product")
    public String product() {
        return "product";
    }

    @GetMapping("/gallery")
    public String gallery() {
        return "gallery";
    }
}
