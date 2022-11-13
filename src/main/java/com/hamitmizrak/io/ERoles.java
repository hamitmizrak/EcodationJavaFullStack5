package com.hamitmizrak.io;

//975
public enum ERoles {

    ADMIN(1, "admin"), WRITER(2, "writer"), USER(3, "user");

    //final
    //1-) interface verirsek => bütün implementlerin gelmemesini sağlar
    //2-) değişkende verirsek => sabit yapar
    //3-) metot'a verirsek => Override edemeyiz
    //4-) class'a verirsek => extends edemeyiz

    // değişkende final verirsek ne olur ?
    // 1-bizi parametreli constructra zorlar
    // 2-Setter metodunu yazmamızı engeller
    private final int key;
    private final String value;

    // constructor private verirsek ne olur ?
    // ERoles  instance(new) oluşturamazsınız.
    private ERoles(int key, String value) {
        this.key = key;
        this.value = value;
    }
    //getter setter
    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    // interface bütün verileri implement etmek istemiyorsak ne yapabiliriz ?
    // interface bütün implementlerin gelmemesi icin => public final interface{}
}
