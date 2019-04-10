package com.yuu6.helloWorld.behavioralPattern.InterpreterPattern;

/**
 * 抽象的表达式接口
 */
public abstract class Experssion {
    private int currentIndex = 0;

    public void interpret(String expresion) {
        String[] strs = expresion.split(" ");
        while (currentIndex < strs.length) {
            String keyWord = strs[currentIndex++];
            int nums = Integer.parseInt(strs[currentIndex++]);
            String context = strs[currentIndex++];
            execute(keyWord, nums, context);
        }
    }

    public abstract void execute(String keyWord, int nums, String context);
}
