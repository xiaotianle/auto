package com.tianle.controller;

import com.tianle.domain.Result;
import com.tianle.domain.Menu;
import com.tianle.domain.MenuView;
import com.tianle.domain.User;
import com.tianle.service.MenuService;
import com.tianle.utils.ResultUtil;
import com.tianle.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;


import javax.validation.Valid;
import java.util.List;

/**
 * Created by win7 on 2017/6/25.
 */
@Controller
public class MenuController {


    public MenuService getMenuService() {
        return menuService;
    }

    public void setMenuService(MenuService menuService) {
        this.menuService = menuService;
    }

    @Autowired
    private MenuService menuService;


    public MenuRepository getMenuRepository() {
        return menuRepository;
    }

    public void setMenuRepository(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Autowired
    private MenuRepository menuRepository;

    @PostMapping(value = "/menus")
    @ResponseBody
    public Result<Menu> menuAdd(Menu menu, BindingResult bindingResult)
    {

        System.out.println("menu.getMenuname()"+menu.getMenuname());
        if (bindingResult.hasErrors())
        {
            return ResultUtil.error(0,bindingResult.getFieldError().getDefaultMessage());

        }
        return ResultUtil.success(menuRepository.save(menu));
    }

    @GetMapping(value = "/menus")
    public String menu()
    {

       return "menu";
    }

    @RequestMapping(value ="/home")
    public String home(Model model)
    {

        List<MenuView> menuViews = menuService.getMenu();
        model.addAttribute("menuViews", menuViews);
        return "home";
    }

    @RequestMapping(value ="/home/{path}")
    public String home(@PathVariable("path") String path, Model model)
    {

        return "home";
    }

}
