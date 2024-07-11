package nl.Kees298;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	//declare variables to be stored in arrays.
	ArrayList<String> names = new ArrayList<>();
	ArrayList<Integer> ages = new ArrayList<>();
	ArrayList<Long> phoneNumbers = new ArrayList<>();
	ArrayList<String> emails = new ArrayList<>();
	ArrayList<String> addresses = new ArrayList<>();
	ArrayList<String> cities = new ArrayList<>();
	ArrayList<Long> studentNumbers = new ArrayList<>();

	// add person
	void addPerson() {
		//add names
		System.out.print("Geef de naam van de student die je toe wilt voegen: ");
		Scanner nameInput = new Scanner(System.in);
		names.add(nameInput.nextLine());
		System.out.println(names);

		//add ages
		System.out.print("Geef de leeftijd van de student die je toe wilt voegen: ");
		Scanner ageInput = new Scanner(System.in);
		ages.add(ageInput.nextInt());
		System.out.println(ages);

		//add phone numbers line 32 incorrect? p41 of book.
		System.out.println("Geef het telefoonnummer van de student die je toe wilt voegen");
		//System.out.print("(Je mag underscores toevoegen voor leesbaarheid): ");
		Scanner phoneInput = new Scanner(System.in);
		phoneNumbers.add(phoneInput.nextLong());
		System.out.println(phoneNumbers);

		//add e-mails
		System.out.print("Geef de e-mail van de student die je toe wilt voegen: ");
		Scanner mailInput = new Scanner(System.in);
		emails.add(mailInput.nextLine());
		System.out.println(emails);

		//add addresses
		System.out.print("Geef het adres van de student die je toe wilt voegen: ");
		Scanner addressInput = new Scanner(System.in);
		addresses.add(addressInput.nextLine());
		System.out.println(addresses);

		//add cities
		System.out.print("Geef de woonplaats van de student die je toe wilt voegen: ");
		Scanner cityInput = new Scanner(System.in);
		cities.add(cityInput.nextLine());
		System.out.println(cities);

		//add student numbers
		System.out.println("Geef het nummer van de student die je toe wilt voegen");
		//System.out.print("(Je mag underscores toevoegen voor leesbaarheid): ");
		Scanner stNumberInput = new Scanner(System.in);
		studentNumbers.add(stNumberInput.nextLong());
		System.out.println(studentNumbers);



	}
}



/*
void ageList() {
	int i = ListLength();
	System.out.println("Geef de leeftijden van de studenten");
	Scanner ageInput = new Scanner(System.in);

	do {
		ages.add(ageInput.nextInt());
	} while (ages.size()<i);
	System.out.println(ages);


 */
