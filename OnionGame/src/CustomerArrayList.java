import java.util.ArrayList;
import java.util.List;

public class CustomerArrayList {
    private List<Customer> customers;

 
    public CustomerArrayList() {
        customers = new ArrayList<>();
        initializeCustomers();
    }


    private void initializeCustomers() {
    		    	//             name,     aggressiveness, hunger, pickiness, allergy,
        customers.add(new Customer("Big Brenda",        30,  100, 0,   0));
        customers.add(new Customer("Karen",             100, 40,  80,  0));
        customers.add(new Customer("Skinny Pete",       40,  20,  50,  0));
        customers.add(new Customer("lil Timmy",         20,  30,  100, 40));
        customers.add(new Customer("Connoisseur Craig", 50,  50,  100, 20));
        customers.add(new Customer("Sickly Sam",        10,  10,  10,  80));
        customers.add(new Customer("Tutorial Todd",     10,  10,  10,  0));
    }


    public List<Customer> getCustomer() {
        return customers;
    }

    }

