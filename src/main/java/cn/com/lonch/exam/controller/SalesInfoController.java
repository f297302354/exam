package cn.com.lonch.exam.controller;

import cn.com.lonch.exam.entity.ResponseBean;
import cn.com.lonch.exam.service.SalesInfoService;
import cn.com.lonch.exam.utils.Log;

/**
 * 销售信息功能接口
 * @author fei.chang
 *
 * 具体代码中没有添加任何依赖，实现逻辑全部基于伪代码实现
 * 例如MVC层可以基于springMVC组件，@RestContoller @RequestMapper定义相关接口访问地址
 */
public class SalesInfoController {

    /**
     * 注入相关日志组件
     */
    private Log log;

    /**
     * 注入，交给SpringIOC容器管理
     */
    private SalesInfoService salesInfoService;

    /**
     * 新增一条分配记录
     * 以下参数设计肯定会有其他的接口暴露出了相关下面的参数，只需客户端依照参数传递就行
     * @param userId        用户id
     * @param productId     产品id
     * @param areasId       区域id
     * @param terminalId    终端id
     * @return              返回接口可以提前封装统一返回bean对象，对象中返回相关操作码、操作提示、具体业务结果，
     *                      例如：{"code":"0000","msg":"操作成功","result":{}}
     */
    public String saveSalesInfo(int userId, int productId, int areasId, int terminalId) {
        log.info("可以把业务参数打印到具体日志中，此方法可以做成AOP切面，如果有切面可以省略次步骤");
        ResponseBean result = new ResponseBean("9999", "操作失败");
        try {
            boolean valid = validSalesParam(userId, productId, areasId, terminalId);
            if (valid) {
                result = salesInfoService.saveSalesInfo(userId, productId, areasId, terminalId);
            }
        } catch (Exception e) {
            /**
             * 打印日志以供线上排查或者提前预警
             */
            log.info("错误日志");
        } finally {

        }
        return "把结果转换json返回";
    }

    /**
     * 根据用户的id查询用户的销售信息
     * @param userId 用户主键
     * @return
     */
    public String querySalesInfo(int userId) {
        ResponseBean result = new ResponseBean("9999", "操作失败");
        try {
            result = salesInfoService.querySalesInfo(userId);
        } catch (Exception e) {
            /**
             * 打印日志以供线上排查或者提前预警
             */
            log.info("错误日志");
        } finally {

        }
        return "把结果转换json返回";
    }

    private boolean validSalesParam(int userId, int productId, int areasId, int terminalId) {
        return true;
    }

}
