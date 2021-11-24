package com.test.t2;

import com.test.interfaceDao.Function5;
import com.test.interfaceDao.Function6;
import com.test.interfaceDao.Function7;

/**
 * 双参柯里化函数
 */
public class Test237_2<T, U, V> {
    double taxRate = 0.09;

    public static <A, B, C> Function7<B, C> partialA(A a, Function7<A, Function7<B, C>> f) {
        return f.apply(a);
    }



}
