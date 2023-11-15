import java.util.*;  
public class Game {
	 
	public static void main(String[] args) {
		
		System.out.println("Hello, what is your name?");
		//userinput name here
		System.out.println("Welcome! You are the prowd owner of Fatty's Burgers,");
		System.out.println("a newly opened small business that sells quality burgers!");
		System.out.println("But...");
		System.out.println("You have a special ability.");
		System.out.println("For every slice of onion that you sneak on a customer's burger,");
		System.out.println("you get a massive cash multiplier at the end of the day!");
		System.out.println("But...");
		System.out.println("Every single customer will ask for no onions!!!");
		System.out.println("...");
		System.out.println("Your mission, is to have a great opening day by keeping your reputation above ground,");
		System.out.println("And make as much money as possible (onions are crucial)");
		System.out.println("...");
		System.out.println("The doors are open! here comes your first customer!");
		TutorialTodd();
noticeOnions();
newCustomer();
howManyOnions();
payday();
onionMultiplier();
	}

	private static void howManyOnions() {
		System.out.println("How many Onions would you like to sneak onto");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();  
	}

	private static void onionMultiplier() {
		// TODO Auto-generated method stub
		
	}

	private static void payday() {
		// TODO Auto-generated method stub
		
	}

	private static void newCustomer() {
		// TODO Auto-generated method stub
		
	}

	private static void noticeOnions() {
		// TODO Auto-generated method stub
		
	}



	private static void TutorialTodd() {
		
		System.out.println("");
	}

}
