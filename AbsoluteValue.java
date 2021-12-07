package com.codingChallenge;

public class AbsoluteValue {
	// defined method with two numbers.
public static int diffrence(int number1, int number2) {
	// used if statement to compare two numbers 
	if(number1>=number2) {
		return number1-number2;
	}else 
		return number2-number1;

}
public static void main(String[] args) {
	diffrence(2,3);
	System.out.println("Absolute Value of |number1-number2| is " + diffrence(4,3));
}
}
