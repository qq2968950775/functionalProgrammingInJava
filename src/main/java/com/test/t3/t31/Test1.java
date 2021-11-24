package com.test.t3.t31;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    static Pattern emailPattern =
            Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$");

    public static void main(String[] args) {
        Matcher matcher = emailPattern.matcher("java has regex has java has pretty good100370523@qq.com");
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
