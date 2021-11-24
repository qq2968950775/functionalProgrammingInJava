package com.test.t2;

import com.test.interfaceDao.Function3;

/**
 * 复合函数 使用匿名函数
 */
public class Test235<T,U,V>  {
    public static void main(String[] args) {
    Function2<Double,Double> d = Math::sin;
    //Double cos = Function3.compose(d,Math::sin).apply(2.0);

    //double cos2 = Function3.<Double,Double,Double>highCompose().apply(d).apply(Math::sin).apply(2.0);

    }
    //返回的参数用于复合函数 f== uvFunction3 g== tuFunction3 z == t
    static <T,U,V> Function3<Function3<T,U>,Function3<Function3<V,T>,Function3<V,U>>> highCompose(){
        return f -> g -> x ->f.apply(g.apply(x));
        //return (Function3<T,U> f)->(Function3<V,T> g)->(U x) -> f.apply(g.apply(x));
    }
}
