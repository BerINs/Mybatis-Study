package io.peaches.mybatis.test;


import io.peaches.mybatis.mapper.UserMapper;
import io.peaches.mybatis.pojo.User;
import io.peaches.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    @Test
    public void testMybatis() {

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "小红", "admin", 18, "女", "xh@qq.com");
       int result = mapper.insertUser(user);
//        int result = mapper.updateUser();
//        int result = mapper.deleteUser();
//        User result = mapper.getUserById();
//         List<User> result = mapper.getAllUser();




       System.out.println(user);
//         result.forEach(System.out::println);

    }

}
