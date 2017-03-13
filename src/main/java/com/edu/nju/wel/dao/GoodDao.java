package com.edu.nju.wel.dao;

import com.edu.nju.wel.model.Good;

import java.util.List;


/**
 * Created by zs on 2017/3/12.
 */
public interface GoodDao {
    /**
     * 添加商品
     * @param good
     */
    public int addGood(Good good);

    /**
     * 删除商品
     * @param goodId
     */
    public int deleteGood(int goodId);

    /**
     * 根据商品id获取商品信息
     * @param goodId
     * @return
     */
    public Good getGood(int goodId);

    /**
     * 获取商品列表
     * @return
     */
    public List<Good> getGood();

    /**
     * 更新商品
     * @param good
     */
    public int updateGood(Good good);
}
