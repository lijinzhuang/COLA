package com.alilbaba.domain.craftman.metrics.weight;

public abstract class Weight {
    public static double WEIGHT_PERCENTAGE=100;
    public abstract double getAppQualityWeight();
    public abstract double getTechInfluenceWeight();
    public abstract double getTechContributionWeight();
    public abstract double getDevQualityWeight();
    public double getUnanimousWeight(){
        return 100/WEIGHT_PERCENTAGE;
    }
}
