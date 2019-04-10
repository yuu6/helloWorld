package com.yuu6.helloWorld.behavioralPattern.strategyPattern;

public class ReverseStringWithStringBuilder implements ReverseStringUtil {
    @Override
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
