package com.itiknow.bootstrap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @RequestMapping("/date")
    public String index(@RequestParam("date")String date,@RequestParam("datePicker")String datePicker){

        System.out.println("date:"+date);
        System.out.println("datePicker:"+datePicker);
        return "index";
    }
}
