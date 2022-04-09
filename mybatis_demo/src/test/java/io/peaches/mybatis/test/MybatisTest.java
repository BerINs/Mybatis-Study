package io.peaches.mybatis.test;


import io.peaches.mybatis.mapper.UserMapper;
import io.peaches.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    @Test
    public void testMybatis() throws IOException {
        // 加载核心配置
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 获取sqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        // 获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 获取mapper接口对象
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
