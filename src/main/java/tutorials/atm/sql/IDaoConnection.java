package tutorials.atm.sql;

import java.sql.Connection;
import java.util.ArrayList;

//interface , generics
public interface IDaoConnection <T> {
    //CRUD
    public void create(T t);
    public ArrayList<T> list();

    //SUM AMOUNT
    double sumAmount();


    double safeSpecialIdsumAmount(long id);

    public void update(T t);
    public void delete(T t);


    //Java 8 beraber gelen default interface
    default Connection getInterfaceConnection(){
        return DatabaseConnection.getInstance().getConnection();
    }
}
