package io.peaches.mybatis.mapper;

import io.peaches.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {

    /**
     * 查询所有员工名
     */
    List<Emp> getAllEmp();

    /**
     * 查询员工以及员工所对应的部门
     */
    Emp getEmpAndDept(@Param("eid") Integer eid);

    /**
     * 分步查询1
     */
    Emp getEmpAndDeptOne(@Param("eid") Integer eid);
}
