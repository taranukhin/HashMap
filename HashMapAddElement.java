package HashMap;
import java.util.HashMap;

public class HashMapAddElement {
    public static void main(String[] args) {
        HashMap<String, String> officetool = new HashMap<>();
        officetool.put("S234", "Большой степлер");
        officetool.put("P342", "Черно-белый принтер из коридора");
        officetool.put("N845", "Острые ножницы");
        System.out.println(officetool);
        officetool.put("N845", "Scanner");
        System.out.println(officetool);

    }
}
