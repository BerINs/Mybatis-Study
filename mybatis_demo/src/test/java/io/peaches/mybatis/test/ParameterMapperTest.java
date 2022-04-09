package io.peaches.mybatis.test;

import io.peaches.mybatis.mapper.ParameterMapper;
import io.peaches.mybatis.pojo.User;
import io.peaches.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ParameterMapperTest {

    @Test
    public void testParameterMapper() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);

        User result = mapper.getUserByUsername("admin");
        System.out.println(result);
    }
}
