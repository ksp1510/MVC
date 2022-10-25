package com.gmh.MVC;

import com.gmh.MVC.model.Query;
import com.gmh.MVC.model.Search;
import com.gmh.MVC.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("products", homeService.getProducts());
        model.addAttribute("search", new Search());
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("search", new Search());
        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("search", new Search());
        model.addAttribute("query", new Query());
        return "contact";
    }

    @GetMapping("/service")
    public String service(Model model) {
        model.addAttribute("search", new Search());
        return "service";
    }

    @GetMapping("/product")
    public String product(Model model) {
        model.addAttribute("search", new Search());
        model.addAttribute("products", homeService.getProducts());
        return "product";
    }

    @PostMapping("/product")
    public String searchProduct(Model model, @ModelAttribute Search query) {
        String name = query.getProductName();
        model.addAttribute("products", homeService.searchProducts(name));
        return "product";
    }

    @PostMapping("/contact1")
    public String query(Model model, @ModelAttribute Query query) {
        System.out.println("Home controller");
        String name = query.getName();
        System.out.println(name);
        String email = query.getEmail();
        System.out.println(email);
        String sub = query.getSubject();
        System.out.println(sub);
        String msg = query.getMsg();
        System.out.println(msg);
        model.addAttribute("query", homeService.getQuery(name, email, sub, msg));
        return "contact1";
    }

    @GetMapping("/gallery")
    public String gallery(Model model) {
        model.addAttribute("search", new Search());
        return "gallery";
    }
}
