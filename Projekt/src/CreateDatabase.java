import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {

    public static void createTables() {
        Connection conn = null;
        try {
            conn = DBConnection.getDBConnection();
            Statement stmt = conn.createStatement();

            // Vytvoření tabulky pro romány
            String createNovelTable = "CREATE TABLE IF NOT EXISTS novels (" +
                                      "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                                      "title TEXT NOT NULL," +
                                      "author TEXT NOT NULL," +
                                      "year INTEGER NOT NULL," +
                                      "availability TEXT NOT NULL," +
                                      "genre TEXT NOT NULL)";
            stmt.execute(createNovelTable);

            // Vytvoření tabulky pro učebnice
            String createTextbookTable = "CREATE TABLE IF NOT EXISTS textbooks (" +
                                          "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                                          "title TEXT NOT NULL," +
                                          "author TEXT NOT NULL," +
                                          "year INTEGER NOT NULL," +
                                          "availability TEXT NOT NULL," +
                                          "gradeLevel INTEGER NOT NULL)";
            stmt.execute(createTextbookTable);

            System.out.println("Tabulky vytvořeny úspěšně.");
        } catch (SQLException e) {
            System.out.println("Chyba při vytváření tabulek: " + e.getMessage());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Chyba při zavírání spojení: " + e.getMessage());
                }
            }
        }
    }
}
