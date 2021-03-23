package com.alilbaba.domain.craftman.metrics;

import com.alilbaba.domain.craftman.user.UserProfile;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Metric
 * 指标
 */
@Data
public abstract class Metric implements Measurable  {
    private double score;
    @Getter
    @Setter
    protected UserProfile metricOwner;
    abstract public String getName();
    abstract public String getCode();
    abstract public double getWeight();
    @Override
    public double calculateScore() {
        return 0;
    }
    @Override
    public String toString(){
        return this.getName()+" "+this.score;
    }
}
