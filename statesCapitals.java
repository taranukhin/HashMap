package HashMap;
import java.util.HashMap;

public class statesCapitals {
    public static void main(String[] args) {
        HashMap<String, String> statesCapitals = new HashMap<>();
        statesCapitals.put("Canada", "Toronto");
        statesCapitals.put("Irak", "Bagdat");
        statesCapitals.put("Austia", "Vena");
        System.out.println(statesCapitals);
        statesCapitals.put("Canada", "Ottava");
        System.out.println(statesCapitals);
    }
}
