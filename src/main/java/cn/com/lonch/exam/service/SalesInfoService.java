package cn.com.lonch.exam.service;

import cn.com.lonch.exam.entity.ResponseBean;

/**
 * 分配关系数据接口
 * @author fei.chang
 */
public interface SalesInfoService {

    /**
     * 新增分配数据
     * @param userId        用户id
     * @param productId     产品id
     * @param areasId       区域id
     * @param terminalId    终端id
     * @return
     */
    public ResponseBean saveSalesInfo(int userId, int productId, int areasId, int terminalId);

    /**
     * 根据用户id查询分配关系，单表查询
     * @param userId
     * @return
     */
    ResponseBean querySalesInfo(int userId);
}
