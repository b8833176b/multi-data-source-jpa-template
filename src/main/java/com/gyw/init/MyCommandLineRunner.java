package com.gyw.init;

import com.gyw.mysql.entity.User;
import com.gyw.mysql.model.SrmUser;
import com.gyw.mysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by guoyouwei on 2018/1/31.
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Autowired
    @Qualifier("primaryJdbcTemplate")
    protected JdbcTemplate jdbcTemplate1;

    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    protected JdbcTemplate jdbcTemplate2;

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("==========springboot启动完毕，开始回调：===========");
        System.out.println("使用jpa方式查询 主数据源：");
        userService.getUserList().forEach(
                userInfo -> {
                    System.out.println("name:"+userInfo.getName());
                    System.out.println("password:"+userInfo.getPassword());
                }
        );
        System.out.println("使用jpa方式查询 第二数据源：");
        userService.getUserList2().forEach( System.out::println);

        System.out.println("使用jdbcTemplate1 查询数据：");
        String sql = "SELECT ID" +
                ",NAME" +
                ",PASSWORD " +
                "FROM user";
        //"FROM CES_RMK_OUTBOX WHERE ID IN (1902933)";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        List<User> users =  jdbcTemplate1.query(sql, rowMapper);
        users.forEach(System.out::println);


        System.out.println("使用jdbcTemplate2 查询数据：");
        String sql2 = "SELECT BUKRS" +
                ",USER_ID" +
                ",USER_NM" +
                ",PASSWD " +
        "FROM SRM_ADMIN_USER";
        RowMapper<SrmUser> rowMapper2 = new BeanPropertyRowMapper<>(SrmUser.class);
        List<SrmUser> srmUsers =  jdbcTemplate2.query(sql2, rowMapper2);
        srmUsers.forEach(System.out::println);

    }
}
