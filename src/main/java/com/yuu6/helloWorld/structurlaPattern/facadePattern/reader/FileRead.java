package com.yuu6.helloWorld.structurlaPattern.facadePattern.reader;

import java.io.*;

public class FileRead implements Read {

    @Override
    public String read(String path) {
        File file = new File(path);
        char[] res = new char[30];

        assert file.isFile() && file.exists();

        InputStreamReader read = null;// 考虑到编码格式
        try {
            read = new InputStreamReader(new FileInputStream(file));
            read.read(res);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(res);
    }
}
