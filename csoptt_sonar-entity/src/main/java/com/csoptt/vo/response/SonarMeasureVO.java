package com.csoptt.vo.response;

import com.csoptt.entity.MeasureComponent;

import java.util.List;

/**
 * Sonar单项目扫描结果展示
 *
 * @author qishao
 * @date 2018-12-20
 */
public class SonarMeasureVO {

    /**
     * 一次扫描的展示结果
     */
    private MeasureComponent component;

    /**
     * periods
     */
    private List periods;

    /**
     * Gets the value of component.
     *
     * @return the value of component
     */
    public MeasureComponent getComponent() {
        return component;
    }

    /**
     * Sets the component.
     * <p>
     * <p>You can use getComponent() to get the value of component</p>
     *
     * @param component component
     */
    public void setComponent(MeasureComponent component) {
        this.component = component;
    }

    /**
     * Gets the value of periods.
     *
     * @return the value of periods
     */
    public List getPeriods() {
        return periods;
    }

    /**
     * Sets the periods.
     * <p>
     * <p>You can use getPeriods() to get the value of periods</p>
     *
     * @param periods periods
     */
    public void setPeriods(List periods) {
        this.periods = periods;
    }
}
