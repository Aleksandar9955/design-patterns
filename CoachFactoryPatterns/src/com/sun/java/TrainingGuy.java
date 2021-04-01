package com.sun.java;

public class TrainingGuy implements Coach{
  @Override
  public void lay_down(){
    System.out.println("TrainingGuy lays down");
  }
  @Override
  public void get_up(){
    System.out.println("TrainingGuy gets up");
  };
}