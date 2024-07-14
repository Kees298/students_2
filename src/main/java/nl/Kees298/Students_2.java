package nl.Kees298;

/*
The switch in main directs to 3 sub-switches:
-a switch in Studentchoice which directs you to the 3 methods in the Class "Student" (or back to main menu)
-a switch in Mentorchoice which directs you to the 3 methods in the Class "Student" (or back to main menu)
-a switch in Classchoice (not yet built)

 */


import java.util.Scanner;

class Students_2 {

	public static void main(String[] args) {
		int choice;
		Scanner input = new Scanner(System.in);
		MentorChoice mentorMenu = new MentorChoice();
		StudentChoice studentMenu = new StudentChoice();

		for (; ; ) {

			System.out.print("""
										
					Wat wil je doen?
					1. Iets met studenten.
					2. Iets met mentoren.
					3. Iets met klassen.
					0. Programma stoppen.
										
					""");

			choice = input.nextInt();

			switch (choice) {
				case 1:
					studentMenu.Menu();
				case 2:
					mentorMenu.Menu();
			}

			if (choice == 0) {
				break;
			}

			//Student newMentor = new Student();
			//Mentor test2 = new Mentor();
			//newMentor.addPerson();
			//test2.addPerson();
			//test2.removePerson();

		}
	}
}