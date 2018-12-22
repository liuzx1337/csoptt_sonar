package com.csoptt.entity;

import java.util.List;

/**
 * 扫描结果
 *
 * @author qishao
 * @date 2018-12-20
 */
public class MeasureComponent {

    /**
     * 扫描id
     */
    private String id;

    /**
     * Sonar扫描配置的工程key
     * 对应Sonar扫描前，properties文件中sonar.projectKey一栏
     */
    private String key;

    /**
     * Sonar扫描配置的工程name
     * 对应Sonar扫描前，properties文件中sonar.projectName一栏
     */
    private String name;

    /**
     * 质量检测器代号
     */
    private String qualifier;

    /**
     * 扫描标准项键值对
     */
    private List<Metric> measures;

    /**
     * Gets the value of id.
     *
     * @return the value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id.
     * <p>
     * <p>You can use getId() to get the value of id</p>
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the value of key.
     *
     * @return the value of key
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key.
     * <p>
     * <p>You can use getKey() to get the value of key</p>
     *
     * @param key key
     */
    public void setKey(String key) {
        this.key = key;
    }

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
     * Gets the value of qualifier.
     *
     * @return the value of qualifier
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * Sets the qualifier.
     * <p>
     * <p>You can use getQualifier() to get the value of qualifier</p>
     *
     * @param qualifier qualifier
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /**
     * Gets the value of measures.
     *
     * @return the value of measures
     */
    public List<Metric> getMeasures() {
        return measures;
    }

    /**
     * Sets the measures.
     * <p>
     * <p>You can use getMeasures() to get the value of measures</p>
     *
     * @param measures measures
     */
    public void setMeasures(List<Metric> measures) {
        this.measures = measures;
    }
}
