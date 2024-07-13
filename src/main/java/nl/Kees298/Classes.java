package nl.Kees298;

import java.util.Scanner;
import java.util.ArrayList;

class Classes {

	//declare List of classes array
	ArrayList<String> classes = new ArrayList<>();

	void addClass() {
		//add a new class to the array.
		System.out.print("Hoe heet de nieuwe klas? ");
		Scanner classInput = new Scanner(System.in);
		classes.add(classInput.nextLine());
		System.out.println(classes);
	}

	void joinStudent() {
		//let a student join one of the classes.
		System.out.println("Welke student wil je toevoegen? ");
		System.out.println("Dit zijn de studenten: ");

		//print the list of students
		System.out.println();

	}
}
