package com.hxsd.tmall.web;

import com.hxsd.tmall.pojo.Category;
import com.hxsd.tmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: tmall
 * @Date: 2019-10-28 10:38
 * @Author: jinhs
 * @Description:
 */
@RestController
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> list() throws Exception {
        return categoryService.list();
    }
}
