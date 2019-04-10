package com.yuu6.helloWorld.creationalPattern.singletonPattern;

public class HelloWorld {
    private volatile static HelloWorld instance = null;

    private HelloWorld() {}

    public static HelloWorld getInstance() {
        if (instance == null) {
            synchronized (HelloWorld.class) {
                if (instance == null) {
                    instance = new HelloWorld();
                }
            }
        }
        return instance;
    }

    public void sayHello(){
        System.out.println("hello world!");
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = HelloWorld.getInstance();
        helloWorld.sayHello();
    }
}
