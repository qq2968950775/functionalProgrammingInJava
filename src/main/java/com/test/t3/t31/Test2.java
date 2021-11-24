package com.test.t3.t31;

import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
    static Pattern emailPattern =
            Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$");

    static Function<String, Result<String>> emailChecker = s -> {
        boolean matches = emailPattern.matcher(s).matches();
        boolean matches1 = matches;
        return matches1;
    };
    public static void main(String[] args) {

    }
}
