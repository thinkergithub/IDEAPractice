package com.hisen.designpattern.simplefactory;

/**
 * 计算器 - 利用简单工厂模式实现
 * Created by hisen on 17-4-16.
 */
public class CalculatorMain {

  public static void main(String[] args) {
    Opreation opreation;
    opreation = OpreationSimpleFactory.createOperate("+");
    opreation.setNumberA(10);
    opreation.setNumberB(1);
    double result = opreation.getResult();
    System.out.println(result);
  }
}
