package com.logbug.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * t_order
 * @author 
 */
@Data
public class TOrder implements Serializable {
    /**
     * 订单流水ID
     */
    private Long orderId;

    /**
     * 用户流水ID
     */
    private Long userId;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}