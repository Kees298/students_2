package nl.Kees298;

import java.util.Scanner;

class Students_2 {

	public static void main(String[] args) {
		int choice;
		Scanner input = new Scanner(System.in);
		MentorChoice subMenu = new MentorChoice();

		for (; ; ) {

			System.out.print("""
										
					Wat wil je doen?
					1. Iets met mentoren.
					0. Programma stoppen.
										
					""");
			choice = input.nextInt();

			if (choice == 0) {
				break;
			}

			switch (choice) {
				case 1:
					subMenu.Menu();
			}

			//Student newMentor = new Student();
			//Mentor test2 = new Mentor();
			//newMentor.addPerson();
			//test2.addPerson();
			//test2.removePerson();

		}
	}
}