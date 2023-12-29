package HashMap;
import java.util.HashMap;

public class zooShop {
    public static void main(String[] args) {
        HashMap<String, Double> orders = new HashMap<>();
        orders.put("Иван И.", 4345.5);
        orders.put("Ольга С.", 76564.3);
        orders.put("Александр Т.", 1234.86);
        orders.put("Александр Р.", 23432.87);
        orders.put("Екатерина О.", 1034753.6);
        orders.put("Ярослав В.", 450.0);

        double sum = 0;
        for (Double money : orders.values()){
            sum += money;
        }
        System.out.println("всего было совершено заказов на скмму: " + sum);
    }
}
