package com.alilbaba.domain.craftman.metrics;

import com.alilbaba.domain.craftman.user.UserProfile;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public abstract class SubMetric extends Metric{
    protected SubMetricType subMetricType;
    protected MainMetric parent;
    @Getter
    protected List<MetricItem> metricItems = new ArrayList<>();
    public SubMetric(){}
    public void setParent(MainMetric parent){
        this.parent = parent;
        this.metricOwner = parent.metricOwner;
        parent.addSubMetric(this);
    }
    public void addMetricItem(MetricItem metricItem){
        metricItems.add(metricItem);
    }
    @Override
    public String getName(){
        return subMetricType.getMetricSubTypeName();
    }
    @Override
    public String getCode(){
        return subMetricType.getMetricSubTypeCode();
    }
    @Override
    public double calculateScore(){
        double subMetricScore = 0;
        for (MetricItem metricItem:metricItems){
            subMetricScore = subMetricScore+metricItem.calculateScore();
        }
        return subMetricScore;
    }
    @Override
    public UserProfile getMetricOwner(){
        return parent.metricOwner;
    }

}
