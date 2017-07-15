package com.tianle.controller;

import com.tianle.domain.ProductType;
import com.tianle.domain.User;
import com.tianle.repository.ProductTypeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by win7 on 2017/6/24.
 */
@RestController
public class ProductTypeController {

    private final static Logger logger = LoggerFactory.getLogger(ProductTypeController.class);

    @Autowired
    private ProductTypeRepository productTypeRepository;

    @PostMapping(value = "/productTypes")
    public String addProductType(ProductType productType,Model model)
    {
        productTypeRepository.save(productType);
        model.addAttribute("productType",productType);
        return "producttypedetail";
    }


}
