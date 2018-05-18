package com.glasses.shopglasses.controller;


import com.glasses.shopglasses.pojo.SunGlasses;
import com.glasses.shopglasses.service.SunglassesService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value="/glasses",produces="application/json;charset=UTF-8")
public class SunglassesController {


    @Resource
    private SunglassesService sunglassService;


    @RequestMapping("/hello")
    public String index() {
            return "Hello Spring Boot";
        }

    @RequestMapping("/getsunglassinfo")
    public String getSunGlasses(@RequestParam("sunglassid") Integer sunglassId, Model model) {
        SunGlasses sunglass=sunglassService.getSunGlasses(sunglassId);
        model.addAttribute("sunglass", sunglass);
        System.out.println(sunglass.toString());
        return sunglass.toString();
    }
}

