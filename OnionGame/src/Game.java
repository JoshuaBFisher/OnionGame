import java.util.*;  
import java.util.Random;
public class Game {
	 
	public static void main(String[] args) {
		
		Burger activeBurger = new Burger("",0,0,0);
		Player player = new Player("player",0,3,0);
		System.out.println("Hello, what is your name?");
		
		//Scanner sc= new Scanner(System.in);
		//String name= sc.next();
		
		System.out.println("Welcome "+"name"+"! You are the prowd owner of Fatty's Burgers,");
		System.out.println("a newly opened small business that sells quality burgers!");
		System.out.println("But...");
		System.out.println("You have a special ability.");
		System.out.println("For every slice of onion that you sneak on a customer's burger,");
		System.out.println("you get a massive cash multiplier at the end of the day!");
		System.out.println("But...");
		System.out.println("Every single customer will ask for no onions!!!");
		System.out.println("...");
		System.out.println("Your mission, is to have a great opening day");
		System.out.println("by keeping your reputation above ground,");
		System.out.println("And make as much money as possible (onions are crucial)");
		System.out.println("...");
		System.out.println("The doors are open! here comes your first customer!");
		//TutorialTodd();
		//boolean workShift = true;
		//while (workShift)
		//{
			
		//}
//noticeOnions();
//newCustomer();
//howManyOnions();
//payday();
//onionMultiplier();
confrontation();
	}

	public static void confrontation() {
		Random randomDialogue = new Random();
		int randomDialogue_int1 = randomDialogue.nextInt(3);
		if (randomDialogue_int1 == 0){
			System.out.println("Hey buddy ol' pal, there appears to be onions in my burger!!!");
		}
		if (randomDialogue_int1 == 1){
			System.out.println("ERM, WHAT THE ONIONS!!!");
		}
		if (randomDialogue_int1 == 2){
			System.out.println("Excuse me dude, There seems to be ONIONS ON MY BURGER!!!");
		}
		System.out.println("Refund my burger or I will ruin you!!!");
		System.out.println("...");
		System.out.println("will you (1) refund the burger -$$$, or (2) lose reputation");
		Scanner sc= new Scanner(System.in);
		int choich= sc.nextInt(); 
		if (choich == 1)
		{
			System.out.println("you chose to refund the burger, oh well...");
		}
		else
		{
			for (Player player = new Player();;) {
			player.setReputation(player.getReputation() - 1);
			
			System.out.println("ouch, you just recieved a bad review,..");
			System.out.println(player.getReputation() + " more of those and Fatty's is going to close");
		}//this repeats forever
		}
	}

	public static void howManyOnions() {
		System.out.println("How many onions would you like to sneak onto" +karens + fattyburger+  "?");
		Scanner sc= new Scanner(System.in);
		int onionAmount= sc.nextInt();  
		System.out.println("OK, " + onionAmount + " onion slices going in, let's hope for the best...");
	}

	public static void onionMultiplier() {
		// TODO Auto-generated method stub
		
	}

	public static void payday() {
		System.out.println("Congratulatons! you made it through opening day!");
		System.out.println("You made a grand total of"+dollars+"dollars from burgers, ");
		System.out.println("Plus the onion multiplier gives you a grand total of...");
		System.out.println(total+"$!");
		
	}

	public static void newCustomer() {
		// TODO Auto-generated method stub
		
	}

	public static void noticeOnions() {
		// TODO Auto-generated method stub
		
	}



	public static void TutorialTodd() {
		
		System.out.println("Tutorial Todd:");
	}
	
	public static boolean workShift() {
		return true;
	}

}
