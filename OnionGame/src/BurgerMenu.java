import java.util.ArrayList;
import java.util.List;

public class BurgerMenu {
    private List<Burger> burgers;


    public BurgerMenu() {
        burgers = new ArrayList<>();
        initializeBurgers();
    }


    private void initializeBurgers() {
    		    	//      name,     flavor,     size,     price
        burgers.add(new Burger("Classic Cheeseburger", 50, 50, 8));
        burgers.add(new Burger("Supa Spicy Chicken Slider", 100, 20, 15));
        burgers.add(new Burger("Meatlover's Veggie Burger", 10, 40, 10));
        burgers.add(new Burger("BBQ Bacon Burger", 90, 30, 12));
        burgers.add(new Burger("Hunnid Pound Heart Attack Supreme", 50, 100, 30));
    }


    public List<Burger> getBurgers() {
        return burgers;
    }

    }

