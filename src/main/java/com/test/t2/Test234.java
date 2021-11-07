package com.test.t2;

import com.test.interfaceDao.Function3;

/**
 * 复合函数 使用lambda
 */
public class Test234<T,U,V>  {
    public static void main(String[] args) {


        Function2<Integer, Integer> function2 = x -> x*3;

        Function2<Integer, Integer> square = x -> x*x;
        //重写了apply方法
        Function3<Function3<Integer,Integer>,Function3<Integer,Function3<Integer,Integer>>> compose
                = x-> y-> z-> x.apply(y.apply(z));
        //Function3<Integer,Integer> tripe = x -> x*3;


    }
    //返回的参数用于复合函数 f== uvFunction3 g== tuFunction3 z == t
    static <T,U,V> Function3<Function3<T,U>,Function3<Function3<V,T>,Function3<V,U>>> highCompose(){
        return f -> g -> x ->f.apply(g.apply(x));
        //return (Function3<T,U> f)->(Function3<V,T> g)->(U x) -> f.apply(g.apply(x));
    }
}
