package com.e.bmi;

public class BMI {
    private float height, weight;

    public BMI(float height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    public BMI() {
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }



    public float bmiCalculate(){
        float bmi;
        float meter = meterConverter();
        bmi = weight/(meter * meter);
        return bmi;
    }

    public float meterConverter(){
        float meter;
        meter = height/100;
        return meter;
    }
}
