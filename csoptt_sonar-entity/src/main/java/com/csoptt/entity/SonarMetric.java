package com.csoptt.entity;

/**
 * Sonar度量标准
 *
 * @author liuzixi
 * @date 2018-12-20
 */
public class SonarMetric {

    /**
     * 标准的key，用于api获取相关数值
     */
    private String name;

    /**
     * 度量标准名称，用于页面显示
     */
    private String label;

    /**
     * 数据类型
     */
    private String valType;

    /**
     * Gets the value of name.
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * <p>
     * <p>You can use getName() to get the value of name</p>
     *
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the value of label.
     *
     * @return the value of label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the label.
     * <p>
     * <p>You can use getLabel() to get the value of label</p>
     *
     * @param label label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Gets the value of valType.
     *
     * @return the value of valType
     */
    public String getValType() {
        return valType;
    }

    /**
     * Sets the valType.
     * <p>
     * <p>You can use getValType() to get the value of valType</p>
     *
     * @param valType valType
     */
    public void setValType(String valType) {
        this.valType = valType;
    }
}
