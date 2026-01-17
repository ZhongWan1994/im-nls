package com.wz.nls.business.service;

import com.wz.nls.business.mapper.cust.DemoMapperCust;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Resource
    private DemoMapperCust demoMapperCust;

    public int count() {
        return demoMapperCust.count();
    }
}
