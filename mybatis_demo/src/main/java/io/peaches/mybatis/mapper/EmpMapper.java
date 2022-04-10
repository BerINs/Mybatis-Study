package io.peaches.mybatis.mapper;

import io.peaches.mybatis.pojo.Emp;

import java.util.List;

public interface EmpMapper {

    /**
     * 查询所有员工名
     */
    List<Emp> getAllEmp();
}
