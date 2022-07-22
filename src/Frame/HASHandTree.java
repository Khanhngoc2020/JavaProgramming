package Frame;

import java.util.HashMap;
import java.util.TreeMap;

public class HASHandTree {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<String,Integer>();
        students.put("Khanh Ngoc", 19);
        students.put("Khanh Ngoc", 18);
        System.out.println(students.get("Khanh Ngoc"));
        System.out.println(students.get("Khanh Ngoc"));
        System.out.println(students);

        TreeMap<Integer, String> info = new TreeMap<Integer, String>();
        info.put(26, "Tuan Dinh");
        System.out.println(info.get(26));
        info.put(26, "Ngoc Tuan");
        System.out.println(info.get(26));
        System.out.println(info);
    }
}
