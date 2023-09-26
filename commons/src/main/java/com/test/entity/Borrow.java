package com.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 书籍借阅 实体类
 *
 * @Author YouZhi
 * @Date 2023 - 09 - 26 - 22:44
 */
@Data
@TableName("DB_BORROW")
public class Borrow {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer uid;

    private Integer bid;

}
