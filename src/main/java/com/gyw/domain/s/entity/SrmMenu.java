package com.gyw.domain.s.entity;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by guoyouwei on 2018/2/1.
 */
@Entity
@Table(name="SRM_ADMIN_MENU")
@Component
public class SrmMenu {

    @Id
    private Long menuSeq;

    private String menuNm;

    private String menuUrl;

    public Long getMenuSeq() {
        return menuSeq;
    }

    public void setMenuSeq(Long menuSeq) {
        this.menuSeq = menuSeq;
    }

    public String getMenuNm() {
        return menuNm;
    }

    public void setMenuNm(String menuNm) {
        this.menuNm = menuNm;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    @Override
    public String toString() {
        return "SrmMenu{" +
                "menuSeq=" + menuSeq +
                ", menuNm='" + menuNm + '\'' +
                ", menuUrl='" + menuUrl + '\'' +
                '}';
    }
}
