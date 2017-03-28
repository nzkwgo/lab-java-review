package edu.info448.review;

import java.util.*;

/**
 * A basic class for running and testing the Dog class
 */
public class Tester {

	public static void main(String[] args){
		Dog dog = new Dog();
		dog.bark();
		dog.walk();
		Dog[] pups = Dog.createPuppies(3);
		System.out.println(Arrays.toString(pups));

		Husky harry = new Husky("Husky");
		harry.bark();
		harry.pullSled();
		// Dog v1 = new Husky();
		// Husky v2 = new Dog();
		// Huggable v2 = new Husky();
		// Huggable v3 = new TeddyBear();
		// Husky v4 = new TeddyBear();

		//Animal mal = new Animal();

		GiftBox<Husky> huskyGift = new GiftBox<Husky>(harry);
	}
}