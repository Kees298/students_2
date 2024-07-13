package nl.Kees298;

import java.util.Scanner;

class MentorChoice {

	Mentor newMentor = new Mentor();
	int choice;
	Scanner input = new Scanner(System.in);

	void Menu() {
		for (; ; ) {

			System.out.print("""
										
					Wat wil je doen?
					1. Een mentor toevoegen.
					2. Een mentor verwijderen.
					3. De lijst mentoren tonen.
					0. Naar het hoofdmenu.
										
											
					""");
			choice = input.nextInt();

			if (choice == 0) {
				break;
			}

			switch (choice) {
				case 1:
					newMentor.addPerson();
					break;
				case 2:
					newMentor.removePerson();
					break;
				case 3:
					newMentor.showLists();
					break;
			}
		}
	}
}





