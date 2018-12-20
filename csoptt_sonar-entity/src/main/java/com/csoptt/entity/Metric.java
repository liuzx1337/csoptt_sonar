package com.csoptt.entity;

/**
 * 度量标准键值对
 *
 * @author liuzixi
 * @date 2018-12-20
 */
public class Metric {

    /**
     * 标准项
     */
    private String metric;

    /**
     * 标准项的值
     */
    private String value;

    /**
     * Gets the value of metric.
     *
     * @return the value of metric
     */
    public String getMetric() {
        return metric;
    }

    /**
     * Sets the metric.
     * <p>
     * <p>You can use getMetric() to get the value of metric</p>
     *
     * @param metric metric
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * Gets the value of value.
     *
     * @return the value of value
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value.
     * <p>
     * <p>You can use getValue() to get the value of value</p>
     *
     * @param value value
     */
    public void setValue(String value) {
        this.value = value;
    }
}
