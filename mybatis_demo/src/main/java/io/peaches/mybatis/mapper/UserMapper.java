package io.peaches.mybatis.mapper;

import io.peaches.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {


    /**
     * 添加用户信息
     */
    int insertUser(User user);


    /**
     * 更新用户信息
     */
    int updateUser();

    /**
     * 删除用户信息
     */
    int deleteUser();

    /**
     * 查询用户信息
     */
    User getUserById();

    /**
     * 查询所有用户
     */
    List<User> getAllUser();
}
