package com.sun.java;



public class CoachFactoryPattern {

		public static void main(String args[]) {
			    CoachFactory CoachFactory = new CoachFactory(); 
			    Coach c  = CoachFactory.getGroup("TrainingGuy");
			    Viewers v = new Viewers();
			    c.lay_down();
			    v.lay_down();
			    c.get_up();
			    v.get_up();
			  } 
	
}
