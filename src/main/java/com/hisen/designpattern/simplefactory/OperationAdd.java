package com.hisen.designpattern.simplefactory;

/**
 * 业务类：加法
 * Created by hisen on 17-4-16.
 */
public class OperationAdd extends Opreation {

  public double getResult() {
    double result = 0;
    result = getNumberA() + getNumberB();
    return result;
  }
}