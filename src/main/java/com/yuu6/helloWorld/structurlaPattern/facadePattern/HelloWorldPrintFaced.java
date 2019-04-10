package com.yuu6.helloWorld.structurlaPattern.facadePattern;

import com.yuu6.helloWorld.structurlaPattern.facadePattern.print.Print;
import com.yuu6.helloWorld.structurlaPattern.facadePattern.print.StandradPrint;
import com.yuu6.helloWorld.structurlaPattern.facadePattern.reader.FileRead;
import com.yuu6.helloWorld.structurlaPattern.facadePattern.reader.Read;

public class HelloWorldPrintFaced implements PrintFaced{

    private Read read;
    private Print print;

    public HelloWorldPrintFaced(){
        read = new FileRead();
        print = new StandradPrint();
    }


    @Override
    public void printFromFile(String path) {
        String str = read.read(path);
        print.print(str);
    }
}
