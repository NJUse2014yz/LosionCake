package com.edu.nju.wel.dao.good;

import com.edu.nju.wel.model.Good;


/**
 * Created by zs on 2017/3/12.
 */
public interface GoodDao {
    /**
     * 添加商品
     * @param good
     */
    public void addGood(Good good);

    /**
     * 删除商品
     * @param goodId
     */
    public void deleteGood(int goodId);

    /**
     * 根据商品id获取商品信息
     * @param goodId
     * @return
     */
    public Good getGood(int goodId);

    /**
     * 更新商品
     * @param good
     */
    public void updateGood(Good good);
}
