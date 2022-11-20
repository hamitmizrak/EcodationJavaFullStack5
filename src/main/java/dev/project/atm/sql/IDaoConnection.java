package dev.project.atm.sql;

import dev.project.atm.exceptions.HamitMizrakException;

import java.sql.Connection;
import java.util.ArrayList;

//generics interface
public interface IDaoConnection <T> {
    //CRUD
    public void create(T t);
    public ArrayList<T> list();
    public void update(T t);
    public void delete(T t);

    // Java 8 gelen default
    default java.sql.Connection getInterfaceConnection() throws HamitMizrakException {
        return DatabaseConnection.getInstance().getConnection();
    }
}
