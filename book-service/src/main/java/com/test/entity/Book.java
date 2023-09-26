package com.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 书 实体类
 *
 * @Author YouZhi
 * @Date 2023 - 09 - 26 - 20:35
 */
@Data
@TableName("DB_BOOK")
public class Book {

    @TableId(value = "bid", type = IdType.AUTO)
    private Integer bid;

    private String title;

    private String desc;

}
