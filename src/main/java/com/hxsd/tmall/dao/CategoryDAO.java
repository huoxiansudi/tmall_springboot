package com.hxsd.tmall.dao;

import com.hxsd.tmall.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: tmall
 * @Date: 2019-10-28 10:32
 * @Author: jinhs
 * @Description:
 */
public interface CategoryDAO extends JpaRepository<Category,Integer> {
}
