package nl.Kees298;

import java.util.Scanner;
import java.util.ArrayList;

class Classes {

	//empty student in order to access methods in Student class
	Student x = new Student("", 0, "", "", "", "", "");

	//declare List of classes array
	ArrayList<String> classes = new ArrayList<>();


	String input;

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
		System.out.println(x.names);

		//create a student object
		Scanner StudentInput = new Scanner(System.in);
		input = StudentInput.nextLine();

		if (x.names.contains(input)) {
			int i = x.names.indexOf(input);
			Student newStudent = new Student(x.names.get(i), x.ages.get(i), x.phoneNumbers.get(i),
					x.emails.get(i), x.addresses.get(i), x.cities.get(i), x.studentNumbers.get(i));
			System.out.println(input + " is aangemaakt. Aan welke klas wil je deze persoon toevoegen? ");
		}
	}
}

