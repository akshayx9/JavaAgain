package Collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Java", 100);
        map.put(".net", 10);
        map.put("php", 500);
        System.out.println(map.keySet());
        System.out.println(map.values());

        Set<Entry<String, Integer>> entry = map.entrySet();
        Iterator<Entry<String, Integer>> itr = entry.iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Integer> ent = (Map.Entry<String, Integer>) itr.next();
            System.out.println(ent.getKey() + "---" + ent.getValue());
        }
    }
}
