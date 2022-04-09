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
//        int result = mapper.insertUser();
//        int result = mapper.updateUser();
//        int result = mapper.deleteUser();
//        User result = mapper.getUserById();
        List<User> result = mapper.getAllUser();


//        System.out.println("result: " + result);
        result.forEach(System.out::println);

    }

}
