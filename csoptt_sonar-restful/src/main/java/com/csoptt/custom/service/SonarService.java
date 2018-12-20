package com.csoptt.custom.service;

import com.alibaba.fastjson.JSONObject;
import com.csoptt.exception.SonarException;
import com.csoptt.properties.sonar.SonarServerProperties;
import com.csoptt.utils.common.CollectionUtils;
import com.csoptt.utils.http.HttpUtils;
import com.csoptt.utils.http.ResponseMessage;
import com.csoptt.vo.request.SonarMeasureReqVO;
import com.csoptt.vo.response.SonarMeasureVO;
import com.csoptt.vo.response.SonarMetricVO;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Sonar模块Service
 *
 * @author liuzixi
 * @date 2018-12-20
 */
@Service
public class SonarService {

    /**
     * Log4j
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(SonarService.class);

    /**
     * Sonar获取指标
     */
    private static final String MEASURE_COMPONENT_CONTEXT = "/api/measures/component";

    /**
     * sonar配置项
     */
    @Autowired
    private SonarServerProperties sonarServerProperties;
    
    /**
     * 查询常见指标字段
     * @return
     * @author liuzixi
     * date 2018-12-20
     */
    public List<SonarMetricVO> metricList() {
        List<SonarMetricVO> sonarMetricVOList = new ArrayList<>();
        return sonarMetricVOList;
    }

    /**
     * 查询某一项目的Sonar扫描结果
     *
     * 建立Http请求，获得结果
     *
     * @param sonarMeasureReqVO
     * @return
     * @author liuzixi
     * date 2018-12-20
     */
    public SonarMeasureVO querySonarMeasure(SonarMeasureReqVO sonarMeasureReqVO) {
        // 校验入参
        String component = sonarMeasureReqVO.getComponent();
        String componentId = sonarMeasureReqVO.getComponentId();
        if (StringUtils.isBlank(component) && StringUtils.isBlank(componentId)) {
            throw new SonarException("未选择工程.");
        }
        boolean componentFlag = StringUtils.isBlank(component) && StringUtils.isNotBlank(componentId);

        if (CollectionUtils.isEmpty(sonarMeasureReqVO.getMetricKeys())) {
            throw new SonarException("未选择度量标准.");
        }
        String metricKeys = String.join(",", sonarMeasureReqVO.getMetricKeys());

        // 链接
        String url = getSonarUrl() + MEASURE_COMPONENT_CONTEXT;
        // 参数
        Map<String, String> paramMap = new HashMap<>();
        if (componentFlag) {
            paramMap.put("componentId", componentId);
        } else {
            paramMap.put("component", component);
        }
        paramMap.put("metricKeys", metricKeys);

        ResponseMessage sonarResp = HttpUtils.get(url, paramMap,
                sonarServerProperties.getUsername(), sonarServerProperties.getPassword());
        LOGGER.info(sonarResp.getMessage());
        if (!StringUtils.equals("0", sonarResp.getCode())) {
            throw new SonarException("获取Sonar Api失败.");
        }
        // 判断是否返回正确信息
        String json = sonarResp.getData().toString();
        try {
            return JSONObject.parseObject(json, SonarMeasureVO.class);
        } catch (Exception e) {
            LOGGER.error("未返回正确信息", e);
            // 如果无法解析，字符串本身包含错误信息
            throw new SonarException(json);
        }
    }

    /**
     * 获取sonar链接
     * @return
     * @author liuzixi
     * date 2018-12-20
     */
    private String getSonarUrl() {
        String host = sonarServerProperties.getHost();
        int port = sonarServerProperties.getPort();
        return "http://" + host + ":" + port;
    }
}
