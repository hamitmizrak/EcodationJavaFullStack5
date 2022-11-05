package com.hamitmizrak.javase;

import javax.swing.*;

public class _07_PopupUserData {

    public static void main(String[] args) {
        //consolden klavyeden veri almak
        /*Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen birşeyler yazınız");
        String value=klavye.nextLine();
        System.out.println(value.length());
        System.out.println(value.toLowerCase());
        System.out.println(value.toUpperCase());*/
        String value= JOptionPane.showInputDialog("Lütfen birşeyler yazınız");
        System.out.println(value.length());
        System.out.println(value.toLowerCase());
        System.out.println(value.toUpperCase());
    }
}
