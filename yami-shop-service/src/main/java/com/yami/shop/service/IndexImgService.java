/*
 * Copyright (c) 2018-2999 广州市蓝海创新科技有限公司 All rights reserved.
 *
 * https://www.gz-yami.com/
 *
 * 未经允许，不可做商业用途！
 *
 * 版权所有，侵权必究！
 */

package com.yami.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yami.shop.bean.model.IndexImg;

import java.util.List;

/**
 *
 * @author lgh on 2018/11/26.
 */
public interface IndexImgService extends IService<IndexImg> {

	void deleteIndexImgsByIds(Long[] ids);

    List<IndexImg> listIndexImgs();

    void removeIndexImgCache();
}
