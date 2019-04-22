package com.baizhi.service.impl;

import com.baizhi.dao.EmpDAO;
import com.baizhi.entiry.Emp;
import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpDAO empDAO;
    /**
     * 查询所有的业务
     * @return 返回查询所有员工列表
     */
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Emp> selectAll() {
        return empDAO.findAll();
    }
}
