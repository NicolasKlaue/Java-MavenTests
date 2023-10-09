package com.example;


import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        JSONCreator creator = new JSONCreator();
        JSONObject Root = creator.Create();
        System.out.println(Root.toString(2));
        FileCreator File = new FileCreator();
        File.Create(Root);
    }
}