package com.plugins;

public class Subtract implements iPluginStructure {

    private OperatorDataDirector director;
    private OperatorData opData;

    public Subtract() {

        this.director = new OperatorDataDirector();
        this.setOperatorBuilder();
        this.director.constructOperatorData();
        this.opData = this.director.getOperatorData();
    }

    private void setOperatorBuilder(){
        this.director.setOperatorBuilder(new SubtractOperatorDataBuilder());
    }

    public String getSign() {
        return this.opData.sign();
    }

    public String getOperatorName() {
        return this.opData.name();
    }

    public int getOperatorPrecedence() {
        return this.opData.precedence();
    }

    public int getOperatorParamNumber(){
        return this.opData.opParamNumber();
    }

    public double compute(double a, double b) {
        return a - b;
    }
}