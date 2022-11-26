package atm.sql;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection extends DatabaseInformation {

    //database connection
    private String url = this.getUrl();
    private String user = getUser();
    private String password = this.getPassword();
    private Connection connection;

    //Singleton Design Pattern
    //class Adı
    private static DatabaseConnection instance;

    // Singleton Design pattern constructor private olmalıdır
    // private olursa bu class new ile çağıramayız.(enum böyledir)
    // parametresiz constructor
    private DatabaseConnection() throws HamitMizrakException {
        try {
            Class.forName(this.getForNameData());
            //System.out.println("Driver Yüklendi");
            connection = DriverManager.getConnection(url, user, password);
            //System.out.println("Bağlantı başarılı");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            throw new HamitMizrakException("SQL hata: " + sqlException);
        } catch (Exception exception) {
            exception.printStackTrace();
            throw new HamitMizrakException("Genel hata: " + exception);
        }
    }

    // Singleton Design pattern
    //DatabaseConnection GETTER
    public static DatabaseConnection getInstance() {
        try {
            if (instance == null || instance.connection.isClosed())
                instance = new DatabaseConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }

    //GETTER AND SETTER
    //Connection (GETTER SETTER)
    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    //PSVM
    public static void main(String[] args) throws HamitMizrakException {
        DatabaseConnection databaseConnection = new DatabaseConnection();
    }
}
