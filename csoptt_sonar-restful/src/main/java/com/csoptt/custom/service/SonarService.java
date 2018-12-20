package com.csoptt.custom.service;

import com.csoptt.entity.SonarMetric;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Sonar模块Service
 *
 * @author liuzixi
 * @date 2018-12-20
 */
@Service
public class SonarService {
    
    /**
     * 查询常见指标字段
     * @return 
     * @author liuzixi
     * date 2018-12-20
     */
    public List<SonarMetric> metricList() {
        List<SonarMetric> sonarMetricList = new ArrayList<>();
        return sonarMetricList;
    }
}
