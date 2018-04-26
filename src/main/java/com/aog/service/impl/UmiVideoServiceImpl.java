package com.aog.service.impl;

import com.aog.dao.UmiVideoMapper;
import com.aog.model.UmiVideo;
import com.aog.service.UmiVideoService;
import com.aog.core.universal.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* @Description: UmiVideoService接口实现类
* @author mingle
* @date 2018/04/26 16:10
*/
@Service
public class UmiVideoServiceImpl extends AbstractService<UmiVideo> implements UmiVideoService {

    @Resource
    private UmiVideoMapper umiVideoMapper;

}