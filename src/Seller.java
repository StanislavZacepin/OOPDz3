import java.util.ArrayList;
import java.util.List;

public class Seller extends Human {


    public Seller(String name, double money, int loveIndex) {
        super(name, money, loveIndex);
    }



    @Override
    public void walkInStorage(Consumer сonsumer) {
        for (int i = 0; i < super.getItems().size(); i++) {
            if (super.getItems().get(i) == сonsumer.wishList.get(i)) {
                double money = getMoney() + super.getItems().get(i).getCost();
                setMoney(money);
                super.getItems().remove(i);

                money = сonsumer.getMoney() - super.getItems().get(i).getCost();
                сonsumer.setMoney(money);
                сonsumer.wishList.remove(i);
            }

        }

    }
}
