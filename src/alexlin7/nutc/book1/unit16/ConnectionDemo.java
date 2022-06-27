package alexlin7.nutc.book1.unit16;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {
    public static void main(String[] args)
            throws ClassNotFoundException, SQLException {
        var jdbcUrl = "jdbc:postgresql://localhost:5432/test1";
        var user = args[0];
        var password = args[1];
        try(var conn = DriverManager.getConnection(jdbcUrl, user, password);
            var statement = conn.createStatement()) {
            statement.executeUpdate(
                    "Create TABLE messages (" +
                            "id SERIAL PRIMARY KEY," +
                            "name CHAR(20) NOT NULL," +
                            "email CHAR(40)," +
                            "msg VARCHAR(256) NOT NULL);"
            );
            System.out.println("建立表格messages");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
