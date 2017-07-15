package com.tianle.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by win7 on 2017/6/25.
 */
@Entity
public class Menu {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenucode() {
        return menucode;
    }

    public void setMenucode(String menucode) {
        this.menucode = menucode;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getSupermenu() {
        return supermenu;
    }

    public void setSupermenu(String supermenu) {
        this.supermenu = supermenu;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Id
    @GeneratedValue
    private Integer id;

    private String menucode;

    private String menuname;

    private String supermenu;

    private String url;
}
