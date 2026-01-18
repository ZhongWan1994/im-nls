package com.wz.nls.business.controller;

import com.wz.nls.business.req.DemoQueryReq;
import com.wz.nls.business.resp.CommonResp;
import com.wz.nls.business.resp.DemoQueryResp;
import com.wz.nls.business.service.DemoService;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Resource
    private DemoService demoService;

    @GetMapping("/count")
    public CommonResp<Long> count() {
        return new CommonResp<>(demoService.count());
    }

    @GetMapping("/query")
    public CommonResp<List<DemoQueryResp>> query(@Valid DemoQueryReq req) {
        return new CommonResp<>(demoService.query(req));
    }
}
