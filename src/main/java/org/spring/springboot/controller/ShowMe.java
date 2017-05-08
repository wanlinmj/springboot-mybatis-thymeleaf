package org.spring.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kangwl_pc on 2017/4/23.
 */
@Controller
@RequestMapping("/show")
public class ShowMe {

    @RequestMapping(value="first_page" , method = RequestMethod.GET)
    public String firstPage(String name,Model model){

        System.out.println("  === springboot mybatis 你好呀！ ===  " + name);
        model.addAttribute("name",name);
        return "firstPage";
    }

}
