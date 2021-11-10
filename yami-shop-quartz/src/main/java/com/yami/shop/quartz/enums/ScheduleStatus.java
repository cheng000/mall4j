/*
 * Copyright (c) 2018-2999 广州市蓝海创新科技有限公司 All rights reserved.
 *
 * https://www.gz-yami.com/
 *
 * 未经允许，不可做商业用途！
 *
 * 版权所有，侵权必究！
 */

package com.yami.shop.quartz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ScheduleStatus {

    /**
     * 正常
     */
    NORMAL(0),
    /**
     * 暂停
     */
    PAUSE(1);

    /**
     * 类型
     */
    private final Integer type;
}
