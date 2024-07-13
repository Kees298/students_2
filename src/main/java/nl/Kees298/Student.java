package nl.Kees298;

import java.util.ArrayList;
import java.util.Scanner;

class Student {

	//declare variables to be stored in arrays.
	ArrayList<String> names = new ArrayList<>();
	ArrayList<Integer> ages = new ArrayList<>();
	ArrayList<String> phoneNumbers = new ArrayList<>();
	ArrayList<String> emails = new ArrayList<>();
	ArrayList<String> addresses = new ArrayList<>();
	ArrayList<String> cities = new ArrayList<>();
	ArrayList<String> studentNumbers = new ArrayList<>();

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

		//add phone numbers
		System.out.print("Geef het telefoonnummer van de student die je toe wilt voegen: ");
		Scanner phoneInput = new Scanner(System.in);
		phoneNumbers.add(phoneInput.nextLine());
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
		System.out.print("Geef het nummer van de student die je toe wilt voegen: ");
		Scanner stNumberInput = new Scanner(System.in);
		studentNumbers.add(stNumberInput.nextLine());
		System.out.println(studentNumbers);

	}
}


