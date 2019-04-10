package com.yuu6.helloWorld.structurlaPattern.facadePattern;

public class Main {
    public static void main(String[] args) {
        // 本机文件路径，需要更改
        String path = "StructurlaPattern/facadePattern/helloWorld.txt";
        PrintFaced printFaced = new HelloWorldPrintFaced();
        printFaced.printFromFile(path);
    }
}
