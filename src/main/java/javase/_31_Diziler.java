package javase;

import java.util.Arrays;

//Diziler: eleman sayısı bellidir.
//Diziler saymaya sıfırdan başlar
public class _31_Diziler {
    public static void main(String[] args) {
        int[] array = new int[6];
        array[0] = 1;
        array[2] = 6;
        array[3] = 4;
        array[4] = 3;
        array[5] = 5;

        System.out.println(array[4]);
        System.out.println(array[array.length - 1]);
        System.out.println("\n***********************************");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n***********************************");

        //Arrays
        Arrays.sort(array);
        for (int temp : array) {
            System.out.print(temp + " ");
        }

        System.out.println("\n***********************************");
        int[] clone= array.clone();
        for (int temp : clone) {
            System.out.print(temp + " ");
        }

        System.out.println("\n***********************************");
        //Karşılaştırma
        if(Arrays.equals(array,clone)){
            System.out.println("İki dizi birbirine eşit");
        }else
            System.out.println("İki dizi birbirine eşit değil");
    }
}
