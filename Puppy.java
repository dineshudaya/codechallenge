package com.codingChallenge;

public class Puppy {
	//Defined instant variables
String name;
int age;
/*
 * defined construction and asign value to Puppy class
 */
public Puppy(String name,int age) {
	this.name=name;
	this.age= age;
}
//Defined method 
void bark() {
	System.out.println("bow! bow!");
}
public static void main(String []args) {
/*
 * 	create object from class Puppy
 */
	Puppy tom = new Puppy("Tommy",11);
	
	System.out.println(tom.name+" is "+tom.age+" months old .");
	tom.bark();
}
}
