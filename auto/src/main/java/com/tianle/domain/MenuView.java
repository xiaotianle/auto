package com.tianle.domain;

import java.util.List;
/**
 * Created by win7 on 2017/6/25.
 */
public class MenuView {

    private Menu menu;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }


    public List<Menu> getChildMenu() {
        return childMenu;
    }

    public void setChildMenu(List<Menu> childMenu) {
        this.childMenu = childMenu;
    }

    private List<Menu> childMenu;


}
