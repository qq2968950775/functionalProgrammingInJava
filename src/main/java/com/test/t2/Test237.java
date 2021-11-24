package com.test.t2;

import com.test.interfaceDao.Function3;
import com.test.interfaceDao.Function5;

/**
 * 复合函数 使用匿名函数
 */
public class Test237<T, U, V> {
    double taxRate = 0.09;

    public static void main(String[] args) {

    }


    private void aMethod() {
        //使用元组作为函数的参数
        //
        //Function3<Double, Double> addTax = price -> price + price * taxRate;

    }

    private void aMethod2() {
        //Java允许使用元组(taxRate, price)标记唯一位置
        Function5<Double, Double, Double> addtax = (taxRate, price) -> price + price * taxRate;
        double priceIncludingTax = addtax.apply(0.1, 12.0);
    }
}
