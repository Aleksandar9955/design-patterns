package com.sun.java;

public class CoachFactory {
	
   public Coach getGroup(String groupType){
      if(groupType == null){
         return null;
      }		
      if(groupType.equalsIgnoreCase("TrainingGuy")){
         return new TrainingGuy();
         
      } else if(groupType.equalsIgnoreCase("Viewers")){
         return new Viewers();
         
      } 
      
      return null;
   }
}