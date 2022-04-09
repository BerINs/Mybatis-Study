package io.peaches.mybatis.test;

import io.peaches.mybatis.mapper.ParameterMapper;
import io.peaches.mybatis.pojo.User;
import io.peaches.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class ParameterMapperTest {

    @Test
    public void testParameterMapper() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);

        // User result = mapper.loginCheck("admin", "admin");
        // System.out.println(result);

        System.out.println(mapper.getAllUserMap());

    }
}
