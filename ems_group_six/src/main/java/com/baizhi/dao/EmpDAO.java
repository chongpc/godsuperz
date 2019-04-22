package com.baizhi.dao;

import com.baizhi.entiry.Emp;

import java.util.List;

public interface EmpDAO {
    /**
     * 查询所有dao
     */
    List<Emp> findAll();
}
