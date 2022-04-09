package io.peaches.mybatis.mapper;

import io.peaches.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {


    /**
     * 根据用户名查询
     */
    User getUserByUsername(String username);

    /**
     * 登录查询
     */
    User loginCheck(String name, String password);

    /**
     * map查询
     */

    Map<String, Object> getUserByIdMap(@Param("id") Integer id);

    // List<Map<String, Object>> getAllUserMap();

    @MapKey("id")
    Map<String, Object> getAllUserMap();
}
