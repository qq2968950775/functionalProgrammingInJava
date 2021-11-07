package com.test.interfaceDao;

import com.test.t2.Function2;

/**
 * 多态函数
 */
public interface Function3<T,U> {
    Function3<T,Function3<T,T>> apply(Function3<T,Function3<T,T>>  arg);

    <T,U,V> Function3<Function3<T,U>,Function3<Function3<V,T>,Function3<V,U>>> compose();
}
