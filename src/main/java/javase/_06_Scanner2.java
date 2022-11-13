package javase;

import java.util.Scanner;

public class _06_Scanner2 {

    public static void main(String[] args) {
        //consolden klavyeden veri almak
        Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen bir sayı");
        int value=klavye.nextInt();
        System.out.println(value*value);
    }
}
