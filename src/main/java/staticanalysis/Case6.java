package staticanalysis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Case6 {
    class SQLService {
        public void connect() throws SQLException {
            Connection conn = DriverManager.getConnection(System.getenv("DB_JDBC_URL"), System.getenv("DB_USER"),
                    System.getenv("DB_PASSWORD"));
            conn.close();
        }
    }
}
