package tutorials.collectionsx;

import java.util.*;

public class MapTutorials {
    public static void main(String[] args) {
        Map<String,String> mapList=new LinkedHashMap<>();
        UUID uuid=UUID.randomUUID();
        mapList.put("1","istanbul");
        mapList.put("2","ankara");
        mapList.put("3","izmir");
        mapList.put("4","malatya");
        mapList.put("5","elazığ");

        for (String key:mapList.keySet()) {
            System.out.print(key+" ");
        }
        System.out.println("\n*******************************");

        for (String value:mapList.values()) {
            System.out.print(value+" ");
        }

        System.out.println("\n*******************************");

        for (String key:mapList.keySet()) {
            System.out.print(key+":"+mapList.get(key)+" ");
        }
    }
}
