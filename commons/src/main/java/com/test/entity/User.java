package com.test.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户实体类
 *
 * @Author YouZhi
 * @Date 2023 - 09 - 26 - 19:56
 */
@Data
@TableName("DB_USER")
public class User {

    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    private String name;

    private Integer age;

    private String sex;

}
