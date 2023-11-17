import java.util.*;  
import java.util.Random;
public class Game {
    private static BurgerMenu burgerMenu;
    private static CustomerArrayList customerList;
    private static Player player;
    private static String currentCustomerName;
    private static String currentBurgerName;
    private static int currentCustomerID;
    private static int onionAmount;
    private static int onionNoticeAmount;
    private static int dollars;
    private static int currentBurgerPrice;
    //private static double onionMultiplier;
    private static Random random = new Random();
    
    public static void main(String[] args) {
        initializeGame();
        gameLoop();
        payday(player);
    }

    private static void initializeGame() {
		System.out.println("Hello, what is your name?");
		burgerMenu = new BurgerMenu();
        customerList = new CustomerArrayList();
        player = new Player("player", 0, 3, 0);
        //onionMultiplier = 1.0;
        dollars = 0;
		
		Scanner sc= new Scanner(System.in);
		String name= sc.next();
		
		System.out.println("Welcome "+name+"! You are the prowd owner of Fatty's Burgers,");
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
    }
    private static void gameLoop() {
        while (true) {
            newCustomer(); 
            //howManyOnions(customerList, burgerMenu);
            //noticeOnions(player);
            updatePlayerStats(player);
            removeCustomer();
            if (customerList.getCustomer().isEmpty()) {
                break;
            }
            if (player.getReputation() <= 0) {
                System.out.println("Fatty's has received too many bad reviews and has been shut down.");
                break;
            }
        }
        
    }
    private static void newCustomer() {
        int randomCustomerIndex = random.nextInt(customerList.getCustomer().size());
        Customer customer = customerList.getCustomer().get(randomCustomerIndex);
        currentCustomerName = customer.getName();
        currentCustomerID = randomCustomerIndex;

        //int hungerLevel = customer.getHunger();
        //int burgerSizeRange = hungerLevel / 10;
        int randomBurgerIndex = random.nextInt(burgerMenu.getBurgers().size());
        //int burgerChoice = burgerMenu.getBurgers().get(random.nextInt(burgerSizeRange)).getSize();
        Burger burger = burgerMenu.getBurgers().get(randomBurgerIndex);
        currentBurgerName = burger.getName();
        currentBurgerPrice = burger.getPrice();
        System.out.println("A new customer has arrived!");
        System.out.println(currentCustomerName + " has ordered a " + currentBurgerName + " for " +currentBurgerPrice+ " dollars.");
        howManyOnions(customer, burger, player);
    }
    private static void updatePlayerStats(Player player) {
        dollars += currentBurgerPrice;
        
    }
		//boolean workShift = true;
		//while (workShift)
		//{
			
		//}

//newCustomer();
//howManyOnions();
//payday();
//onionMultiplier();


    private static void removeCustomer() {
        customerList.getCustomer().remove(currentCustomerID);
    }

	public static void confrontation(Player player, BurgerMenu burger) {
	    //Random randomDialogue = new Random();
	    //int randomDialogueInt1 = randomDialogue.nextInt(3);
	    //if (randomDialogueInt1 == 0){
	    //    System.out.println("Hey buddy ol' pal, there appears to be onions in my burger!!!");
	    //}
	    {
	        System.out.println("ERM, WHAT THE ONIONS!!!");
	        System.out.println("I. SAID. NO. ONIONS!!!");
	    }
	    //if (randomDialogueInt1 == 2){
	    //    System.out.println("Excuse me dude, There seems to be ONIONS ON MY BURGER!!!");
	    //}
	    System.out.println("Refund my burger or I will ruin you!!!");
	    System.out.println("...");
	    System.out.println("will you (1) refund the burger, or (2) lose reputation");
	    Scanner sc= new Scanner(System.in);
	    int choich= sc.nextInt(); 
	    if (choich == 1)
	    {
	        System.out.println("you chose to refund the burger and make no money, oh well...");
	        //System.out.println("-" +"burgercost"+ "$");
	    }
	    else 
	    {
	        player.setReputation(player.getReputation() - 1);
	        System.out.println("You chose to stand your ground, but at what cost?");
	        System.out.println("ouch, you just recieved a bad review...");
	        
	        
	        	
	        	System.out.println(player.getReputation() + " more of those and Fatty's is going to pay dearly...");
	        }
	        
	    }
	

	
	public static void howManyOnions(Customer customer, Burger burger, Player player) {
	    System.out.println("How many onions would you like to sneak onto " + currentCustomerName + "'s "+currentBurgerName+"? (0-10)");
	    Scanner sc = new Scanner(System.in);
	    onionAmount = sc.nextInt();

	    onionNoticeAmount = onionAmount * 10;
//System.out.println("onion notice amount : "+ onionNoticeAmount);
//System.out.println("flavor: " + burger.getFlavor());
//System.out.println("customer pickiness: " +customer.getPickiness());
System.out.println("OK, " + onionAmount + " onion slices going in, let's hope for the best...");
System.out.println("...");
	    if (onionNoticeAmount > (burger.getFlavor() - customer.getPickiness())) {
	        noticeOnions(player, customer);
	    }
	    else
	    {
	    	System.out.println("Well done! The customer didn't notice the onions!");
	    	System.out.println("You successfully snuck " +onionAmount+ " onion slices on the " +currentBurgerPrice+ " dollar " + currentBurgerName);
	    	player.setOnions(player.getOnions() + onionAmount);
	    }
	    
	    //noticeOnions(player);
	}
	        
	    

	

	public static void onionMultiplier() {
		// access player.getMoney
		// add player.getMoney + 
		
	}

    private static void payday(Player player) {
        System.out.println("Congratulations! You made it through opening day!");
        System.out.println("You made a grand total of " + dollars + " dollars from burgers.");
        System.out.println("Plus the multiplier from "+player.getOnions()+" onion slices gives you a grand total of...");
        int total = ((player.getOnions()/10 * dollars) + dollars);
		System.out.println(total +"$!");
		
	}


	public static void noticeOnions(Player player, Customer customer) {
        Random peaceChance = new Random();
        
        // Generate a random number between 1 and 100
        int randomNumber = peaceChance.nextInt(100) + 1;
        
        //System.out.println("Random number between 1 and 100: " + randomNumber + "customer agg"+ customer.getAggressiveness());
		if (randomNumber < customer.getAggressiveness())
		{
			confrontation(player, burgerMenu);
		}
		else {
			System.out.println(currentCustomerName+" noticed the onions, but didn't care! Woohoo!");
			player.setOnions(player.getOnions() + onionAmount);
		}
	}



	public static void TutorialTodd() {
		
		System.out.println("Tutorial Todd:");
	}
	
	public static boolean workShift() {
		return true;
	}

}
