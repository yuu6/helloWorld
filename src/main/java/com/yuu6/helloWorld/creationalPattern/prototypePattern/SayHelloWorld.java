package com.yuu6.helloWorld.creationalPattern.prototypePattern;

import com.yuu6.helloWorld.structurlaPattern.decoratePattern.Say;

import java.io.*;

public class SayHelloWorld implements Say,Serializable {
    @Override
    public void say() {
        System.out.println("hello world!");
    }

    public SayHelloWorld deepCopy() throws IOException,ClassNotFoundException{
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (SayHelloWorld)ois.readObject();

    }
}
