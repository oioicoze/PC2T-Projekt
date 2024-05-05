import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

  private static volatile Connection dbConnection;

  private DBConnection() {}



  public static Connection getDBConnection() {
    if (dbConnection == null) {
      synchronized (DBConnection.class) {
        if (dbConnection == null) {
          try {
            Class.forName("org.sqlite.JDBC");
            dbConnection = DriverManager.getConnection("jdbc:sqlite:db/user.db");
          } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace(); // log it
          }
        }
      }
    }
    return dbConnection;
  }

  public static void closeConnection() {
    try {
      dbConnection.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

}
