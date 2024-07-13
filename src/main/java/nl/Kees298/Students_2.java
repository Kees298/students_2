package nl.Kees298;

import java.util.Scanner;

class Students_2 {

	public static void main(String[] args) {
		int choice;
		Scanner input = new Scanner(System.in);
		MentorChoice mentorMenu = new MentorChoice();

		for (; ; ) {

			System.out.print("""
										
					Wat wil je doen?
					1. Iets met mentoren.
					2. Iets met studenten.
					3. Iets met klassen.
					0. Programma stoppen.
										
					""");
			choice = input.nextInt();

			if (choice == 0) {
				break;
			}

			switch (choice) {
				case 1:
					mentorMenu.Menu();
			}

			//Student newMentor = new Student();
			//Mentor test2 = new Mentor();
			//newMentor.addPerson();
			//test2.addPerson();
			//test2.removePerson();

		}
	}
}