package atm.sql;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
abstract public class DatabaseInformation {

    //for database connection
    private String url;
    private String user;
    private String password;

    //for mysql Driver Class
    private String forNameData;

    //parametresiz constructor
    public DatabaseInformation() {
        //MYSQL
        this.url="jdbc:mysql://localhost:3306/atm_database?createDatabaseIfNotExist=true&autoReconnect=true&useSSL=false";
        this.user="root";
        this.password="root";
        this.forNameData="com.mysql.cj.jdbc.Driver";

        //POSTGRESQL
        /*this.url="jdbc:postgresql//localhost:5432/atm_database";
        this.userName="root";
        this.userPassword="root";
        this.forNameData="org.postgresql.Driver";*/

        //H2DB
        /*this.url="jdbc:h2:file./memory_persist/atm_database";
        this.userName="root";
        this.userPassword="root";
        this.forNameData="org.h2.Driver";*/
    }

    //parametreli constructor
    public DatabaseInformation(String user, String password,String url) {
        this.user = user;
        this.user = password;
        this.url = url;
    }

    /*public static void main(String[] args) {
        DatabaseInformation databaseInformation=new DatabaseInformation();
        System.out.println(databaseInformation);
    }*/


}
