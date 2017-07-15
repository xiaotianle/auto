package com.tianle.service;

import com.tianle.domain.MenuView;
import com.tianle.domain.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tianle.repository.MenuRepository;

import java.util.*;

/**
 * Created by win7 on 2017/6/25.
 */
@Service
public class MenuService {

    public MenuRepository getMenuRepository() {
        return menuRepository;
    }

    public void setMenuRepository(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Autowired
    private MenuRepository menuRepository;


    public List<MenuView> getMenu()
    {
        List<Menu>  menus = menuRepository.findAll();

        List<MenuView> menuViews = new ArrayList<MenuView>();

        //添加一级菜单
        for (Menu m: menus) {
            if(m.getSupermenu().equals("0"))
            {
                MenuView mv = new MenuView();
                mv.setMenu(m);
                mv.setChildMenu(new ArrayList<Menu>());
                for (Menu m1: menus) {
                    if(mv.getMenu().getMenucode().equals(m1.getSupermenu()))
                    {
                        mv.getChildMenu().add(m1);
                    }
                }
                menuViews.add(mv);
            }
        }

        return menuViews;
    }

}
