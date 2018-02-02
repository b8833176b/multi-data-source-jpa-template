package com.gyw.mysql.service;

import com.gyw.domain.s.entity.SrmMenu;
import com.gyw.domain.s.repository.SrmUserInfoRepository;
import com.gyw.mysql.entity.User;
import com.gyw.mysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by guoyouwei on 2018/1/31.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SrmUserInfoRepository srmUserInfoRepository;

    @Override
    public List<User> getUserList() {
        return  userRepository.findAll();
    }

    @Override
    public List<SrmMenu> getUserList2() {
        return srmUserInfoRepository.findAll();
    }


}
