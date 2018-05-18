package com.glasses.shopglasses.controller;

import com.glasses.shopglasses.pojo.EyeGlasses;
import com.glasses.shopglasses.service.EyeglassesService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;


@RestController
@RequestMapping(value="/glasses",produces="application/json;charset=UTF-8")
public class EyeGlassesController {

        @Resource
        private EyeglassesService eyeglassService;

        @RequestMapping("/geteyeglassinfo")
        public String getSunGlasses(@RequestParam("eyeglassid") Integer eyeglassId, Model model) {
            EyeGlasses eyeglass=eyeglassService.geteyeGlasses(eyeglassId);
            model.addAttribute("eyeglass", eyeglass);
            System.out.println(eyeglass.toString());
            return eyeglass.toString();
        }
    }


