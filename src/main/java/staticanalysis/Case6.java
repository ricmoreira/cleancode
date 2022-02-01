package staticanalysis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Case6 {
    class SQLService {
        public void connect() throws SQLException {
            Connection conn = DriverManager.getConnection("jdbc:derby:memory:myDB;create=true", "login", "");
            //....
        }
    }
}
