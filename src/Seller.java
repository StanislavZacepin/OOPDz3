import java.util.*;

public class Seller extends Human {


    public Seller(String name, double money, int loveIndex) {
        super(name, money, loveIndex);
    }


    @Override
    public void walkInStorage(Consumer сonsumer) {
        if (this.getItems().size() > сonsumer.getItems().size()) {
            Stack<Item> shop = new Stack<>();
            for (Item item : сonsumer.getItems()) {
                shop.push(item);
            }
            for (int i = this.getItems().size() - 1; i >= 0; i--) {
                if (shop.size() != 0 && shop.contains(this.getItems().get(i))) {

                    double money = getMoney() + this.getItems().get(i).getCost();
                    setMoney(money);

                    money = сonsumer.getMoney() - this.getItems().get(i).getCost();
                    сonsumer.setMoney(money);
                    this.getItems().remove(i);
                    shop.pop();
                }
            }
            сonsumer.getItems().clear();
            System.out.println("Сделка прошла");
        } else {
            System.out.println("Такого количество нету. Отредактируйте карзину");
        }
    }
}


