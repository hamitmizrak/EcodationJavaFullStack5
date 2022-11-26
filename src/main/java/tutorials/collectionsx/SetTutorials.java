package tutorials.collectionsx;

import java.util.*;

public class SetTutorials {
    public static void main(String[] args) {
        //hashSet > LinkedHashSet >TreeSet
        Set<String> listem=new TreeSet<>();
        listem.add("istanbul");
        listem.add("istanbul");
        listem.add("ankara");
        listem.add("izmir");
        listem.add("malatya");
        listem.add("elazığ");


        listem.forEach((temp)-> System.out.print(temp+" "));

    }
}
