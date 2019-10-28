package com.hxsd.tmall.service;

import com.hxsd.tmall.dao.CategoryDAO;
import com.hxsd.tmall.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: tmall
 * @Date: 2019-10-28 10:34
 * @Author: jinhs
 * @Description:
 */
@Service
public class CategoryService {
    @Autowired
    CategoryDAO categoryDAO;

    public List<Category> list() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return categoryDAO.findAll(sort);
    }
}
