package com.hamitmizrak.oop;

//field
//Access Modifier (erişim belirleyiciler)
//             Some-Package Other-Package  Class SubSclass
// public    :      +            +           +      +
// protected :      +            -/+         +      +
// private   :      -            -           +      -
// -         :      +            -           +      -
//1 tane public vardır.
public class StudentDto {

    //field
    private long id;
    private String username;
    private String surname;

    //constructor: kurucu method
    //new ile
    //return kullanılmaz.
    //Overloading yapabiliriz.
    //parametresiz constructor
    public StudentDto() {
        id = 0;
        username = "adınız";
        surname = "soyadınız";
    }

    //Alt+Ins
    //parametreli constructor
    //this: işaretleme sağlar.
    //this: global variable
    public StudentDto(long id, String username, String surname) {
        this.id = id;
        this.username = username;
        this.surname = surname;
    }

    public StudentDto(String username, String surname) {
        this.username = username;
        this.surname = surname;
    }

    //toString
    //Alt+Ins
    @Override
    public String toString() {
        return "StudentDto{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    //Method
    public void fullName() {
        System.out.println(username + " " + this.surname);
    }

    //Getter and setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
