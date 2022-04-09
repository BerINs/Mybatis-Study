package io.peaches.mybatis.mapper;

public interface UserMapper {


    /**
     * 添加用户信息
     */
    int insertUser();


    /**
     * 更新用户信息
     */
    int updateUser();

    /**
     * 删除用户信息
     */
    int deleteUser();
}
