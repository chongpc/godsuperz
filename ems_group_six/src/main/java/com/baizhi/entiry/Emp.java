package com.baizhi.entiry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author superz
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Emp {
    /**
     * 员工id
     */
    private String id;
    /**
     * 员工姓名
     */
    private String name;
    /**
     * 员工性别 true : 男 ， false : 女
     */
    private Boolean gender;
    /**
     * 员工年龄
     */
    private Integer age;
    /**
     * 员工生日
     */
    private Date bir;
    /**
     * 员工工资
     */
    private Double salary;
}
