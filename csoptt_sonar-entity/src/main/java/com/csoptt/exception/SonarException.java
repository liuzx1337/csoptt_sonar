package com.csoptt.exception;

import com.csoptt.utils.exception.BaseException;

/**
 * Sonar模块异常类
 *
 * @author liuzixi
 * @date 2018-12-20
 */
public class SonarException extends BaseException {
    public SonarException() {
    }

    public SonarException(String message) {
        super(message);
    }

    public SonarException(String errCode, String message) {
        super(errCode, message);
    }
}
