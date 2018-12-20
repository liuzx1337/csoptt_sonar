package com.csoptt.custom.controller;

import com.csoptt.custom.service.SonarService;
import com.csoptt.utils.base.controller.BaseController;
import com.csoptt.utils.http.ResponseMessage;
import com.csoptt.utils.http.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sonar模块Controller
 * 主要提供查询Sonar Api结果以及部分操作的功能
 *
 * @author qishao
 * @date 2018-12-20
 */
@RestController
@RequestMapping("/csoppt_sonar")
@Api(description = "|Sonar模块|")
public class SonarController extends BaseController {

    /**
     * 业务逻辑层
     */
    @Autowired
    private SonarService sonarService;
    
    /**
     * |Sonar模块|查询常见指标字段
     * @return 
     * @author liuzixi
     * date 2018-12-20
     */
    @GetMapping("/metricList")
    @ApiOperation(value = "|Sonar模块|查询常见指标字段")
    public ResponseMessage metricList() {
        
        return Result.success();
    }
}
