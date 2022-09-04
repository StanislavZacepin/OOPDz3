import java.util.ArrayList;
import java.util.List;

public class Consumer extends Human{
    ArrayList<Item> wishList = new ArrayList<>();

    public Consumer(String name, double money, int loveIndex) {
        super(name, money, loveIndex);
    }

    @Override
    public void walkInStorage(Consumer consumer) {

    }
}
