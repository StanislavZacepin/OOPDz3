import java.util.List;

public interface Communication {

    default double costOfItem(Item item) {
        return item.getCost();
    }

    default void isItemsInStorage(Seller seller, List<Item> wishListOfConsumer) {
        for (Item item : wishListOfConsumer) {
            if (!seller.getItems().contains(item)) {
                System.out.println("У нас нет " + item.getNameOfItem());
            }
        }
    }

    //Дописать метод
    default double totalCost(List<Item> basketAmount) {
        double summ = 0;
        for (Item item : basketAmount) {
            summ += item.getCost();
        }
        return summ;
    }

    default void areYouPoor(Consumer consumer) {
        if (totalCost(consumer.wishList) > consumer.getMoney()) {
            System.out.println("Ты нищеброд");
        } else {
            walkInStorage(consumer);
        }
    }


    //У Покупателя и Продавца реализовать свои вариации метода "пойти на склад"
    void walkInStorage(Consumer consumer);
}
