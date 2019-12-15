package com;

public class Operator {

   private char opSign;
   private String opName;
   private int opPrecedence;
   private int opParamNumber;
   private Object opFunction;

    Operator(char sign, String name, int precedence, int param, Object func){
        this.setOperatorSign(sign);
        this.setOperatorName(name);
        this.setOperatorPrecedence(precedence);
        this.setOperatorFunction(func);
        this.setOperatorParamNumber(param);
    }

    private void setOperatorSign(char sign){
        this.opSign = sign;
    }

    private void setOperatorName(String name){
        this.opName = name;
    }

    private void setOperatorPrecedence(int precedence){
        this.opPrecedence = precedence;
    }

    private void setOperatorFunction(Object func){
        this.opFunction = func;
    }

    private void setOperatorParamNumber(int param){
        this.opParamNumber = param;
    }

    public char getOperatorSign(){
        return this.opSign;
    }

    public String getOperatorName(){
        return this.opName;
    }

    public int getOperatorPrecedence(){
        return this.opPrecedence;
    }

    public int getOpParamNumber(){
        return this.opParamNumber;
    }

    public Object getOperatorFunction(){
        return this.opFunction;
    }

}
