package com.example;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String projectRoot = System.getProperty("user.dir");
        System.out.println("Hello world!");
        JSONCreator creator = new JSONCreator();
    //System.out.println(creator.Create());
        String path = projectRoot + "/result.json";
    try {
        FileWriter file = new FileWriter(path);
        file.write(creator.Create());
        file.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}