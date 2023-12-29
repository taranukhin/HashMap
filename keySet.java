package HashMap;
import java.util.HashMap;
public class keySet {
    public static void main(String[] args) {
        HashMap<String, String> officeTool = new HashMap<>();
        officeTool.put("S234", "Большой степлер");
        officeTool.put("P342", "Черно-белый принтер из коридора");
        officeTool.put("N845", "Острые ножницы");

        for (String inventory : officeTool.keySet()){
            System.out.println(inventory);
        }
    }
}
