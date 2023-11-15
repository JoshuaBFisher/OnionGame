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
        customers.add(new Customer("Big Brenda",        40,  100, 80,  0));
        customers.add(new Customer("Karen",             100, 80,  60,  0));
        customers.add(new Customer("Skinny Pete",       50,  20,  75,  0));
        customers.add(new Customer("lil Timmy",         60,  60,  50,  0));
        customers.add(new Customer("Connoisseur Craig", 80,  50,  50,  0));
        customers.add(new Customer("Rival Rick",        100,  30,  85,  0));
        customers.add(new Customer("Tutorial Todd",     50,  10,  95,  0));
    }


    public List<Customer> getCustomer() {
        return customers;
    }

    }

