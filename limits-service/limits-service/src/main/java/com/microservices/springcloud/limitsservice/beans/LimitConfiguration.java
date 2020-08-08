package com.microservices.springcloud.limitsservice.beans;

public class LimitConfiguration {

    private Integer minimum;
    private Integer maximum;

    protected LimitConfiguration(){

    }
    public LimitConfiguration(Integer minimum, Integer maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public Integer getMinimum() {
        return minimum;
    }

    public Integer getMaximum() {
        return maximum;
    }
}
