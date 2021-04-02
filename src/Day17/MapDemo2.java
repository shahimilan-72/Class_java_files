package Day17;
import java.util.Map;
import java.util.HashMap;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(100, "ram sharma");
        studentMap.put(110, "shyam sharma");
        studentMap.put(120, "Hari sharma");
        studentMap.put(140, "Krishna sharma");
        System.out.println(studentMap);
        for(Map.Entry<Integer,String> student : studentMap.entrySet()){
            System.out.println(student.getKey() + " " + student.getValue());
        }

    }
}