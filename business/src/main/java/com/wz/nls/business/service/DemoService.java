package com.wz.nls.business.service;

import com.wz.nls.business.domain.Demo;
import com.wz.nls.business.domain.DemoExample;
import com.wz.nls.business.mapper.DemoMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    @Resource
    private DemoMapper demoMapper;
    public long count() {
        return demoMapper.countByExample(null);
    }

    public List<Demo> query(String mobile) {
        DemoExample example = new DemoExample();
        example.setOrderByClause("id desc");
        DemoExample.Criteria criteria = example.createCriteria();
        if (mobile != null) {
            criteria.andMobileNameEqualTo(mobile);
        }
        return demoMapper.selectByExample(example);
    }
}
