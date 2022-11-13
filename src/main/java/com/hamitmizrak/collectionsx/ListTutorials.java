package com.hamitmizrak.collectionsx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTutorials {
    public static void main(String[] args) {
        List<String> listem=new ArrayList<>();
        listem.add("istanbul");
        listem.add("istanbul");
        listem.add("ankara");
        listem.add("izmir");
        listem.add("malatya");
        listem.add("elazığ");
        /*System.out.println(listem.get(0));
        System.out.println(listem.size());
        listem.remove(0);
        System.out.println(listem.get(0));*/
        //listem.clear();
        for (int i = 0; i < listem.size(); i++) {
            System.out.print(listem.get(i)+" ");
        }
        System.out.println("\n**************************");
        for (String temp: listem) {
            System.out.print(temp+" ");
        }

        System.out.println("\n**************************");
        Iterator iterator=listem.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println("\n**************************");
        //4.YOL
        listem.stream().forEach(System.out::println);
        System.out.println("\n**************************");

        listem.forEach(System.out::println);
        System.out.println("\n**************************");

        listem.forEach((temp)-> System.out.print(temp+" "));
        System.out.println("\n**************************");
    }
}
