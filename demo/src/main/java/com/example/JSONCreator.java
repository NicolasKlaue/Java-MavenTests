package com.example;

import org.json.JSONObject;

public class JSONCreator {
 public JSONCreator() {

 }

 public JSONObject Create() {

  JSONObject Root = new JSONObject();
  Root.put("Name", "Nico");
  Root.put("Age", 22);
  JSONObject adress = new JSONObject();
  adress.put("ZipCode", 28231);
  adress.put("City", "Madrid");
  Root.put("adress", adress);
  String[] Departments = { "Dept 1", "Dept 2", "Dept 3" };
  Root.put("Deptarments", Departments);
  return Root;
 }
}
