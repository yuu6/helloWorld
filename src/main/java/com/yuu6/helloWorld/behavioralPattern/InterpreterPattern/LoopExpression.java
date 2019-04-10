package com.yuu6.helloWorld.behavioralPattern.InterpreterPattern;

/**
 * LOOP 关键字的实现
 */
public class LoopExpression extends Experssion {
    @Override
    public void execute(String keyWord, int nums, String context) {
        if ("LOOP".equals(keyWord)) {
            for (int i = 0; i < nums; i++) {
                System.out.println(context);
            }
        }
    }
}
