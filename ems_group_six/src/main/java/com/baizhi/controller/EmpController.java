package com.baizhi.controller;

import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {
    @Resource
    private EmpService empService;
    @RequestMapping("/selectAllEmp")
    public String selectAllEmp(Model model){
        List<Emp> emps = empService.selectAll();
        model.addAttribute("emps",emps);
        return "emplist";
    }
}
