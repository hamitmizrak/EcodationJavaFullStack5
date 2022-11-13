package com.hamitmizrak.collectionsx;

import lombok.Getter;
import lombok.Setter;

public class GenericsDynamics <T> {
    @Getter @Setter
    private T number;

    public GenericsDynamics() {
    }

    public GenericsDynamics(T number) {
        this.number = number;
    }
}

//PSVM
class Main{
    public static void main(String[] args) {
        GenericsDynamics dynamics=new GenericsDynamics();
        // ? ? = sayı , String , virgüllü sayı
        dynamics.setNumber(true);
        System.out.println(dynamics.getNumber());
    }
}
