package com.alilbaba.domain.craftman.metrics;

import com.alilbaba.domain.craftman.user.UserProfile;

public class MetricItem implements Measurable {
    private SubMetric subMetric;
    private UserProfile metricOwner;
    public void setSubMetric(SubMetric subMetric){
        this.subMetric = subMetric;
        this.metricOwner = subMetric.getMetricOwner();

    }
    @Override
    public double calculateScore() {
        return 0;
    }
}
