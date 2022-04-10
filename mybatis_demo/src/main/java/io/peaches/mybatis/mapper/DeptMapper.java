package io.peaches.mybatis.mapper;

import io.peaches.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    /**
     * 分步查询2
     */
    Dept getEmpAndDeptTwo(@Param("did") Integer did);
}
