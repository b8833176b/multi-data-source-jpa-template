package com.gyw.mysql.service;

import com.gyw.domain.s.entity.SrmMenu;
import com.gyw.mysql.entity.User;

import java.util.List;

/**
 * Created by guoyouwei on 2018/1/31.
 */
public interface UserService {

    List<User> getUserList();

    List<SrmMenu> getUserList2();

}
