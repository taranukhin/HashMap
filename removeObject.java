package HashMap;
import java.util.HashMap;

public class removeObject {
    public static void main(String[] args) {
        HashMap<String, String> officeTool = new HashMap<>();
        officeTool.put("S234", "Большой степлер");
        officeTool.put("P342", "Черно-белый принтер из коридора");
        officeTool.put("N845", "Острые ножницы");

        //officeTool.remove("P342");
        officeTool.clear();
        System.out.println(officeTool.get("P342"));
        System.out.println(officeTool);
    }
}
