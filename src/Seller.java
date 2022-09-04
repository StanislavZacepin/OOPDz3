import java.util.ArrayList;
import java.util.List;

public class Seller extends Human {
    private List<Item> items = new ArrayList<>();

    public Seller(String name, double money, int loveIndex) {
        super(name, money, loveIndex);
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public void walkInStorage(Consumer сonsumer) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) == сonsumer.wishList.get(i)) {
                double money = getMoney() + items.get(i).getCost();
                setMoney(money);
                items.remove(i);

                money = сonsumer.getMoney() - items.get(i).getCost();
                сonsumer.setMoney(money);
                сonsumer.wishList.remove(i);
            }

        }

    }
}
