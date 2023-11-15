
public class Burger {
    private String name;
    private int flavor;
    private int size;
    private int price;
  
    public Burger() {
    }

    public Burger(String name, int flavor, int size, int price) {
        this.name = name;
        this.flavor = flavor;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlavor() {
        return flavor;
    }

    public void setFlavor(int flavor) {
        this.flavor = flavor;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
}
        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
    

    }
}
