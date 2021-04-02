package Day17;
import org.w3c.dom.ls.LSOutput;

import java.util.Map;
import java.util.HashMap;

public class MapDemo1 {
    public static void main (String [] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(100, "ram sharma");
        studentMap.put(110, "shyam sharma");
        studentMap.put(120, "Hari sharma");
        studentMap.put(140, "Krishna sharma");
        System.out.println(studentMap);
        System.out.println(studentMap.get(100));
        System.out.println(studentMap.containsValue("Hari sharma"));
        System.out.println(studentMap.size());
        studentMap.clear();
        System.out.println(studentMap.isEmpty());
    }
}
