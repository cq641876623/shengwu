package com.ramo.shengwu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class WebController {
    @GetMapping("index")
    public String index(){
        return "/index";
    }

    @GetMapping("view")
    public String view(){return "/view";}
    @GetMapping("view1")
    public String view1(){return "/view1";}

    @GetMapping("indextwo")
    public String mindle(){return "/mindle";}

}
