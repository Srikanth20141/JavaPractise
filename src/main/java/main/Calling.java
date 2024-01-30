package main;

import method_overloading.Calculation;
import method_overriding.Animal;
import method_overriding.Cat;
import method_overriding.Dog;

public class Calling {

	public static void main(String[] args) {
		
		Calculation calculation = new Calculation();
		System.out.println(calculation.add(2, 3));
		System.out.println(calculation.add(2, 3, 5));
		System.out.println(calculation.add(2.2, 3.2));
		
		Animal dog = new Dog();
		dog.makesound();
		Animal cat = new Cat();
		cat.makesound();
	}

}
