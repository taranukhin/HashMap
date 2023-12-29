package HashMap;


import java.util.HashMap;

public class officeToolGetElement {
    public static void main(String[] args) {
        HashMap<String , String> officeTool = new HashMap<>();
        officeTool.put("S234", "Большой степлер");
        officeTool.put("P342", "Черно-белый принтер из коридора");
        officeTool.put("N845", "Острые ножницы");

        //String tool = officeTool.get("N845");
        //System.out.println(tool);

        for (String tool : officeTool.values()){
           // if (tool.equals("Острые ножницы")){
                System.out.println(tool);
           // }
        }
    }
}
