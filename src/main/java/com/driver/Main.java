package com.driver;

public class Main {
  RWOnly var = new RWOnly();
  System.out.println(var.name);
  var.name = "Hemanth";
  var.setter("Hemanth");
  System.out.println(var.getter());
  
}
