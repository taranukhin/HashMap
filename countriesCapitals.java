package HashMap;
import java.util.HashMap;

public class countriesCapitals {
    public static void main(String[] args) {
        HashMap<String, String> countriesCapitals = new HashMap<>();
        countriesCapitals.put("Франция", "Париж");
        countriesCapitals.put("Аргентина", "Буэнос-Айрос");
        countriesCapitals.put("Росиия", "Москва");
        countriesCapitals.put("Америка", "Вашингтон");
        countriesCapitals.put("Япония", "Токио");
        countriesCapitals.put("Норвегия", "Осло");

        System.out.println("Столица Аргентины: " + countriesCapitals.get("Аргентина"));
        System.out.println("Столица Норвегии: " + countriesCapitals.get("Норвегия"));

    }
}
