package dev.project.atm.sql;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
abstract public class DatabaseInformation {

    //RDBMS connection
    private String url;
    private String user;
    private String password;
    private String forNameData;

    //parametresiz constructor
    public DatabaseInformation() {
        //MYSQL
        this.url="jdbc:mysql://localhost:3306/atm_database?createDatabaseIfNotExist=true&autoReconnect=true&useSSL=false";
        this.user="root";
        this.password="root";
        this.forNameData="com.mysql.cj.jdbc.Driver";

        //POSTGRESQL
        /*this.url="jdbc:postgresql://localhost:5432/atm_database";
        this.user="postgres";
        this.password="root";
        this.forNameData="org.postgresql.Driver";*/

        //H2DB
        /*this.url="jdbc:h2:file:./memory_persist/employee_database";
        this.user="root";
        this.password="root";
        this.forNameData="org.h2.Driver";*/
    }

    //parametreli constructor
    public DatabaseInformation(String url, String user, String password, String forNameData) {
        this.url = url;
        this.user = user;
        this.password = password;
        this.forNameData = forNameData;
    }
}
