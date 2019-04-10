package com.yuu6.helloWorld.behavioralPattern.strategyPattern;

public class ReverseStringWithCharArray implements ReverseStringUtil {
    @Override
    public String reverse(String str) {
        char[] array = str.toCharArray();
        String reverse = "";
        for (int i = array.length - 1; i >= 0; i--) {
            reverse += array[i];
        }
        return reverse;
    }
}
