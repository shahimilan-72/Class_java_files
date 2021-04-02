package Day17;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<Integer, String> studentMap1 = new HashMap<>();
        studentMap1.put(100, "ram sharma");
        studentMap1.put(110, "shyam sharma");
        studentMap1.put(120, "Hari sharma");
        studentMap1.put(140, "Krishna sharma");
        System.out.println(studentMap1);
        for (Map.Entry<Integer, String> student : studentMap1.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }
        System.out.println("====================================");
        Map<Integer, String> studentMap2 = new LinkedHashMap<>();
        studentMap2.put(100, "ram sharma");
        studentMap2.put(110, "shyam sharma");
        studentMap2.put(120, "Hari sharma");
        studentMap2.put(140, "Krishna sharma");
        System.out.println(studentMap2);
        for(Map.Entry<Integer,String> student : studentMap2.entrySet()){
            System.out.println(student.getKey() + " " + student.getValue());
        }
        System.out.println("====================================");
        Map<Integer, String> studentMap3 = new TreeMap<>();
        studentMap3.put(100, "ram sharma");
        studentMap3.put(110, "shyam sharma");
        studentMap3.put(120, "Hari sharma");
        studentMap3.put(140, "Krishna sharma");
        System.out.println(studentMap2);
        for(Map.Entry<Integer,String> student : studentMap3.entrySet()){
            System.out.println(student.getKey() + " " + student.getValue());
        }
    }
}

