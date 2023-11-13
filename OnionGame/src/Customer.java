
public class Customer {
    private String name;
    private int aggressiveness;
    private int hunger;
    private int pickiness;
    private int allergy;
 
    public Customer() {
    }

    public Customer(String name, int aggressiveness, int hunger, int pickiness, int allergy) {
        this.name = name;
        this.aggressiveness = aggressiveness;
        this.hunger = hunger;
        this.pickiness = pickiness;
        this.allergy = allergy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAggressiveness() {
        return aggressiveness;
    }

    public void setAggressiveness(int aggressiveness) {
        this.aggressiveness = aggressiveness;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getPickiness() {
        return pickiness;
    }

    public void setPickiness(int pickiness) {
        this.pickiness = pickiness;
    }

    public int getAllergy() {
        return allergy;
    }

    public void setAllergy(int allergy) {
        this.allergy = allergy;
    }
    }

