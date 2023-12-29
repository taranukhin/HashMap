package HashMap;
import java.util.HashMap;
public class containskeyValue {
    public static void main(String[] args) {
        HashMap<String,String> starescapitals = new HashMap<>();
        starescapitals.put("Russia", "Moscow");
        starescapitals.put("France", "Paris");
        starescapitals.put("Italy", "Rom");

        System.out.println(starescapitals.containsKey("Italy"));
        System.out.println(starescapitals.containsKey("Germany"));

        System.out.println(starescapitals.containsValue("Paris"));
        System.out.println(starescapitals.containsValue("Pekin"));
    }
}
