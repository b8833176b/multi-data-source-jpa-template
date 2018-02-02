package com.gyw.mysql.repository;

import com.gyw.mysql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by guoyouwei on 2018/1/31.
 */
public interface UserRepository extends JpaRepository<User, Long> {



}
