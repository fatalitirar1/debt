import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class Connection_toBase {
    private static final String connection_line_adress = "localhost";
    private static final String connection_line_login = "root";
    private static final String connection_line_pass = "root";

    private  Connection connection;

    public Connection Connection_toBase()
    {
        try {
            this.connection = DriverManager.getConnection(connection_line_adress,connection_line_login,connection_line_pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return  this.connection;
    }

    public Connection getConnection() {
        return connection;
    }
}
