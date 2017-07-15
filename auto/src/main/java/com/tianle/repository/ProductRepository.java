package com.tianle.repository;

import com.tianle.domain.Order;
import com.tianle.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * Created by win7 on 2017/4/27.
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {


    //通过用户名查询
    //注意：方法命名严格要求,必须为findBy属性名首字母大写
    public List<Order> findByProductName(String username);

}
