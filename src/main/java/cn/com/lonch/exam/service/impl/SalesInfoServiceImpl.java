package cn.com.lonch.exam.service.impl;

import cn.com.lonch.exam.entity.ResponseBean;
import cn.com.lonch.exam.service.SalesInfoService;

/**
 * 分配关系数据实现
 * @author fei.chang
 */
public class SalesInfoServiceImpl implements SalesInfoService {

    /**
     * 新增记录
     * @param userId        用户id
     * @param productId     产品id
     * @param areasId       区域id
     * @param terminalId    终端id
     * @return
     */
    public ResponseBean saveSalesInfo(int userId, int productId, int areasId, int terminalId) {

        /**
         * 1.根据对应的id去查询对应的缓存（可以redis），如果缓存未命中就查询库（可以同步跟新缓存），因为涉及都是单表并且是主键的聚簇索引查询，
         * 所以效率极高
         * 2.取出对应的数据封装成统一的SalesInfo对象
         * 3.单表插入数据
         * 4.返回操作结果
         * 备注：具体上面的步骤就是操作思想，因为代表并不复杂也为了不操作，故把思路写出来，代码省略吧？？？
         */
        return null;
    }

    /**
     * 根据用户id查询分配关系，单表查询
     * @param userId
     * @return
     */
    public ResponseBean querySalesInfo(int userId) {
        // 单表查询逻辑，很简单，也可以提前预热到缓存中
        return null;
    }

}
