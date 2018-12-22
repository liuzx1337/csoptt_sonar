package com.csoptt.vo.request;

import java.util.List;

/**
 * 查询
 *
 * @author qishao
 * @date 2018-12-20
 */
public class SonarMeasureReqVO {

    /**
     * Sonar扫描配置的工程
     * 对应Sonar扫描前，properties文件中sonar.projectKey一栏
     */
    private String component;

    /**
     * 扫描工程后生成的id
     * 如果有id，可代替component属性使用
     */
    private String componentId;

    /**
     * 需要获取的Sonar度量标准项
     */
    private List<String> metricKeys;

    /**
     * Gets the value of component.
     *
     * @return the value of component
     */
    public String getComponent() {
        return component;
    }

    /**
     * Sets the component.
     * <p>
     * <p>You can use getComponent() to get the value of component</p>
     *
     * @param component component
     */
    public void setComponent(String component) {
        this.component = component;
    }

    /**
     * Gets the value of componentId.
     *
     * @return the value of componentId
     */
    public String getComponentId() {
        return componentId;
    }

    /**
     * Sets the componentId.
     * <p>
     * <p>You can use getComponentId() to get the value of componentId</p>
     *
     * @param componentId componentId
     */
    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    /**
     * Gets the value of metricKeys.
     *
     * @return the value of metricKeys
     */
    public List<String> getMetricKeys() {
        return metricKeys;
    }

    /**
     * Sets the metricKeys.
     * <p>
     * <p>You can use getMetricKeys() to get the value of metricKeys</p>
     *
     * @param metricKeys metricKeys
     */
    public void setMetricKeys(List<String> metricKeys) {
        this.metricKeys = metricKeys;
    }
}
