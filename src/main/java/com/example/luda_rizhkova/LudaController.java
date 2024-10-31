package com.example.luda_rizhkova;

import org.springframework.stereotype.Controller;

@Controller
public class LudaController {
    public String homePage(){
        return "index.html";
    }
}
