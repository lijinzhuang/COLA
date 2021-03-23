package com.alilbaba.domain.craftman.metrics;

import sun.applet.Main;

import java.util.ArrayList;
import java.util.List;

public abstract class MainMetric extends Metric {
    protected MainMetricType metricType;
    protected List<SubMetric> subMetrics = new ArrayList<>();
    public MainMetric(){}
    public void addSubMetric(SubMetric subMetric){
        subMetrics.add(subMetric);
    }
    @Override
    public String getName(){
        return metricType.getMetricName();
    }
    @Override
    public String getCode(){
        return metricType.getMetricCode();
    }
    @Override
    public double calculateScore(){
        double mainMetricScore = 0;
        for (Metric metric:subMetrics){
            mainMetricScore=mainMetricScore+metric.calculateScore()*metric.getWeight();
        }
        return mainMetricScore;
    }
}
