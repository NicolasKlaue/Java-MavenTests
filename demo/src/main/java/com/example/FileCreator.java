package com.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONObject;

public class FileCreator {
 private String projectRoot = System.getProperty("user.dir");
 public FileCreator(){}
 public Boolean Create( JSONObject JsonFile){
          String path = projectRoot + "/result.json";
          String name = "/result";
          while (new File(path).exists()) {
           int i = 1;
           path = projectRoot + name + "(" + i +")"+".json";
           i = i+1;
          }
    try {
        FileWriter file = new FileWriter(path);
        file.write(JsonFile.toString(2));
        file.close();
        return true;
    } catch (IOException e) {
        e.printStackTrace();
        return false;
    }

 }
}
