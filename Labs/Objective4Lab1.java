import java.util.Scanner;

public class Objective4Lab1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String fname = "";
		String lname = "";
		String favouriteAnimal = "";
		String favouriteFood = "";
		String favouriteSong = "";

		System.out.println("What is your first name?");
		fname = keyboard.nextLine();
		System.out.println("What is your last name?");
		lname = keyboard.nextLine();
		System.out.println("What is your favourite animal?");
		favouriteAnimal = keyboard.nextLine();
		System.out.println("What is your favourite food?");
		favouriteFood = keyboard.nextLine();
		System.out.println("What is your favourite song?");
		favouriteSong = keyboard.nextLine();

		System.out.println("My name is " + fname + " " + lname + ".");
		System.out.println("My favourite animal is the " + favouriteAnimal + ".");
		System.out.println("My favourite food is " + favouriteFood + ".");
		System.out.println("My favourite song is " + favouriteSong + ".");
	}
}