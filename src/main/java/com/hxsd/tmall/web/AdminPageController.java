package com.hxsd.tmall.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: tmall
 * @Date: 2019-10-28 10:37
 * @Author: jinhs
 * @Description:
 */
@Controller
public class AdminPageController {
    @GetMapping(value="/admin")
    public String admin(){
        return "redirect:admin_category_list";
    }
    @GetMapping(value="/admin_category_list")
    public String listCategory(){
        return "admin/listCategory";
    }
}
