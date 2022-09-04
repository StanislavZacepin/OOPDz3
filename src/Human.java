import java.util.ArrayList;
import java.util.List;

public abstract class Human implements Communication {
    private String name;
    private double money;
    private int loveIndex;

    private List<Item> items = new ArrayList<>();
    public Human(String name, double money, int loveIndex) {
        this.name = name;
        this.money = money;
        this.loveIndex = loveIndex;
    }
    public List<Item> getItems() {
        return items;
    }

    public void setItems(Item item) {
        items.add(item);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
