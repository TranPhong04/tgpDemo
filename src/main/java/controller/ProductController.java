package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.ProductService;

@Controller
public class ProductController {
@GetMapping("/show")
    public String showProduct(Model model){
     model.addAttribute("products", ProductService.products);
    return "index";


    }



}
