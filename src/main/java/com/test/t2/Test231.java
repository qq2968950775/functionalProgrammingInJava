package com.test.t2;

import com.test.interfaceDao.BinaryOperator;

/**
 * 复合函数
 */
public class Test231 {
    public static void main(String[] args) {

        //编写一个函数对整数求和
        BinaryOperator add = x->y->x+y;
        BinaryOperator mult = x->y->x-y;

        Function2<Integer,Function2<Integer,Integer>> add2 = x -> y -> x+y;
    }

}
