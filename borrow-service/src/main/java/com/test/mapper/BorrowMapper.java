package com.test.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.entity.Borrow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 书籍借阅 mapper类
 *
 * @Author YouZhi
 * @Date 2023 - 09 - 26 - 22:48
 */
@Mapper
public interface BorrowMapper extends BaseMapper<Borrow> {

    /**
     * 查询详情信息by uid
     * @param uid
     * @return
     */
    @Select("select * from DB_BORROW where uid = #{uid}")
    List<Borrow> getBorrowsByUid(int uid);

    /**
     * 查询详情信息by bid
     * @param bid
     * @return
     */
    @Select("select * from DB_BORROW where bid = #{bid}")
    List<Borrow> getBorrowsByBid(int bid);

    /**
     * 查询详情信息by uid bid
     * @param uid
     * @param bid
     * @return
     */
    @Select("select * from DB_BORROW where bid = #{bid} and uid = #{uid}")
    Borrow getBorrow(int uid, int bid);
}
