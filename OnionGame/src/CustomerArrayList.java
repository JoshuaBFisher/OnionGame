import java.util.ArrayList;
import java.util.List;

public class CustomerArrayList {
    private List<Customer> customers;

  
    public CustomerArrayList() {
        customers = new ArrayList<>();
        initializeCustomers();
    }


    private void initializeCustomers() {
    		    	//             name,     aggressiveness, hunger, pickiness(reverse), allergy,
        customers.add(new Customer("Big Brenda",        40,  100, 10,  0));
        customers.add(new Customer("Karen",             100, 80,  50,  0));
        customers.add(new Customer("Skinny Pete",       50,  20,  20,  0));
        customers.add(new Customer("lil Timmy",         60,  60,  70,  0));
        customers.add(new Customer("Connoisseur Craig", 80,  50,  60,  0));
        customers.add(new Customer("Rival Rick",        100,  30,  40,  0));
        customers.add(new Customer("Todd",              50,  10,  30,  0));
    }


    public List<Customer> getCustomer() {
        return customers;
    }

    }

