package nl.Kees298;

import java.util.Scanner;

class StudentChoice {

	Student newStudent = new Student();
	int choice;
	Scanner input = new Scanner(System.in);

	void Menu() {
		for (; ; ) {

			System.out.print("""
										
					Wat wil je doen?
					1. Een student toevoegen.
					2. Een student verwijderen.
					3. De lijst studenten tonen.
					0. Naar het hoofdmenu.
										
											
					""");
			choice = input.nextInt();

			if (choice == 0) {
				break; // should go to main menu (Students_2), but directs to Mentor menu instead.
			}

			switch (choice) {
				case 1:
					newStudent.addPerson();
					break;
				case 2:
					newStudent.removePerson();
					break;
				case 3:
					newStudent.showLists();
					break;
			}
		}
	}
}



