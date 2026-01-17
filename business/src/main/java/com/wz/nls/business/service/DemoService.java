package com.wz.nls.business.service;

import com.wz.nls.business.mapper.DemoMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Resource
      private DemoMapper demoMapper;
    public long count() {
        return demoMapper.countByExample(null);
    }
}
