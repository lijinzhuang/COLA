package com.alilbaba.domain.craftman.metrics;

import java.io.Serializable;

public interface Measurable extends Serializable {
    /**
     * 计算分数
     * @return
     */
    public double calculateScore();
}
