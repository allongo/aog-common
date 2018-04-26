package com.aog.controller;

import com.aog.core.ret.RetResult;
import com.aog.core.ret.RetResponse;
import com.aog.core.utils.ApplicationUtils;
import com.aog.model.UmiVideo;
import com.aog.service.UmiVideoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: UmiVideoController类
* @author mingle
* @date 2018/04/26 16:10
*/
@RestController
@RequestMapping("/umiVideo")
public class UmiVideoController {
    @Resource
    private UmiVideoService umiVideoService;

    @PostMapping("/insert")
    public RetResult<Integer> insert(UmiVideo umiVideo) throws Exception{
//    umiVideo.setId(ApplicationUtils.getUUID());
        Integer state = umiVideoService.insert(umiVideo);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/deleteById")
    public RetResult<Integer> deleteById(@RequestParam String id) throws Exception {
        Integer state = umiVideoService.deleteById(id);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/update")
    public RetResult<Integer> update(UmiVideo umiVideo) throws Exception {
        Integer state = umiVideoService.update(umiVideo);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/selectById")
    public RetResult<UmiVideo> selectById(@RequestParam String id) throws Exception {
        UmiVideo umiVideo = umiVideoService.selectById(id);
        return RetResponse.makeOKRsp(umiVideo);
    }

    /**
    * @Description: 分页查询
    * @param page 页码
    * @param size 每页条数
    * @Reutrn RetResult<PageInfo<UmiVideo>>
    */
    @PostMapping("/list")
    public RetResult<PageInfo<UmiVideo>> list(@RequestParam(defaultValue = "0") Integer page,
    @RequestParam(defaultValue = "0") Integer size) throws Exception {
        PageHelper.startPage(page, size);
        List<UmiVideo> list = umiVideoService.selectAll();
        PageInfo<UmiVideo> pageInfo = new PageInfo<UmiVideo>(list);
        return RetResponse.makeOKRsp(pageInfo);
    }
}