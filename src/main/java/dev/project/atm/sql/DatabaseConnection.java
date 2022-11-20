package dev.project.atm.sql;

import dev.project.atm.exceptions.HamitMizrakException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection extends DatabaseInformation {

    // for RDBMS
    private String url = getUrl();
    private String user = getUser();
    private String password = getPassword();
    private String forNameData = getForNameData();
    private java.sql.Connection connection;

    //Connection Singleton Design Pattern (Instance)
    private static DatabaseConnection instance;

    //Connection Singleton Design Pattern (Constructor Parametresiz)
    private DatabaseConnection() throws HamitMizrakException {
        try {
            Class.forName(this.forNameData);
            System.out.println("Driver Başrıyla yüklendi");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Bağlantı başarılı");
        } catch (Exception e) {
            e.printStackTrace();
            throw new HamitMizrakException(" SQl Failed: " + e);
        }
    }

    //Connection Singleton Design Pattern (DatabaseConnection)
    public static DatabaseConnection getInstance() throws HamitMizrakException {
        try {
            if (instance == null || instance.connection.isClosed())
                instance = new DatabaseConnection();
        } catch (Exception e) {
            e.printStackTrace();
            throw new HamitMizrakException(" SQl Failed: " + e);
        }
        return instance;
    }

    //GETTER AND SETTER
    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    /*public static void main(String[] args) throws HamitMizrakException {
        DatabaseConnection databaseConnection=new DatabaseConnection();
    }*/
}
