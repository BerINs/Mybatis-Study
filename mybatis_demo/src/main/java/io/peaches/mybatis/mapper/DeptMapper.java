package io.peaches.mybatis.mapper;

import io.peaches.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptMapper {

    /**
     * 分步查询2
     */
    Dept getEmpAndDeptTwo(@Param("did") Integer did);

    /**
     * 根据部门查询职员
     */
    // Dept getDeptAndEmp(@Param("did") Integer did);
}
