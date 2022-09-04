public class Main {
    public static void main(String[] args) {


        //Human seller = new Seller("Валя",150,3); Нельзя залесть в список
        Seller seller = new Seller("Валя",150,3);
       // Human consumer = new Consumer("Петя", 150, 3); Нельзя залесть в список
        Consumer consumer = new Consumer("Петя", 200, 3);
        Consumer consumer2 = new Consumer("Гога", 10, 3);
        Consumer consumer3 = new Consumer("Тоша", 100000000, 3);

        Item water = new Item("Water",3.99, Category.Water);
        Item food = new Item("Food",10, Category.Food);
        Item hygiene = new Item("Hygiene",5.99, Category.Hygiene);


       // Заполнения Магазина

        addList(20,seller,water);
        addList(20,seller,food);
        addList(20,seller,hygiene);

//  Заполнения Корзины покупателя

        addList(3,consumer,water);
        addList(2,consumer,food);
        addList(5,consumer,hygiene);

        addList(3,consumer2,water);
        addList(2,consumer2,food);
        addList(5,consumer2,hygiene);

        addList(18,consumer3,water);
        addList(18,consumer3,food);
        addList(18,consumer3,hygiene);

        action(seller,consumer);
        action(seller,consumer2);
        action(seller,consumer3);



    }
    public static void action(Seller seller, Consumer consumer){
        boolean flag = seller.isItemsInStorage(seller,consumer.getItems());
        if(flag){
            seller.areYouPoor(consumer);
        }
    }
    public static void addList(int count, Human human, Item item){
        for (int i = 0; i < count; i++) {
            human.setItems(item);
        }
    }
}
