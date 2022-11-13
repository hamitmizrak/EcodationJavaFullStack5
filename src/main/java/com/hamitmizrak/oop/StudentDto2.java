package com.hamitmizrak.oop;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDto2 {
    private long id;
    private String username;
    private String surname;

    //Method
    public void fullName() {
        System.out.println(username + " " + this.surname);
    }
}
