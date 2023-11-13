
public class Player {
    private String name;
    private int money;
    private int reputation;
    private int onions;
 
    public Player() {
    }

    public Player(String name, int money, int reputation, int onions) {
        this.name = name;
        this.money = money;
        this.reputation = reputation;
        this.onions = onions;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }
    public int getOnions() {
        return onions;
    }

    public void setOnions(int onions) {
        this.onions = onions;
    }

    }


