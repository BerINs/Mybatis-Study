package io.peaches.mybatis.mapper;

import io.peaches.mybatis.pojo.User;

public interface ParameterMapper {


    /**
     * 根据用户名查询
     */
    User getUserByUsername(String username);

}
