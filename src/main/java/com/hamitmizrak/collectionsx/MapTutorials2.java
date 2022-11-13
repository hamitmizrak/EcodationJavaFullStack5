package com.hamitmizrak.collectionsx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

public class MapTutorials2 {
    public static void main(String[] args) {
        Map<String,String> mapList=new LinkedHashMap<>();

        for (int i = 0; i < 5; i++) {
            UUID uuid=UUID.randomUUID();
            mapList.put(uuid.toString(),"isim"+i);
        }

        for (String key:mapList.keySet()) {
            System.out.println(key+":"+mapList.get(key)+" ");
        }
    }
}
