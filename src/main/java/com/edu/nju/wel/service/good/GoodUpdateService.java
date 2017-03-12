package com.edu.nju.wel.service.good;

import com.edu.nju.wel.model.Good;

/**
 * Created by zs on 2017/3/12.
 */
public interface GoodUpdateService {
    /**
     * 新增商品信息
     * @param good
     */
    public void insertGood(Good good);

    /**
     * 删除商品
     * @param goodId
     */
    public void deleteGood(int goodId);

    /**
     * 更新商品
     * @param good
     */
    public void updateGood(Good good);
}
