package alexlin7.nutc.book1.unit16;

import javax.sql.DataSource;
import java.sql.*;
import java.util.*;

public class MessageDAO {
    private final DataSource dataSource;

    public MessageDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    //範例一
//    public void add(Message message) {
//        try(var conn = DriverManager.getConnection(url, username, passwords);
//            var statement = conn.createStatement()) {
//            var sql = String.format(
//                    "INSERT INTO messages(name, email, msg) VALUES ('%s', '%s', '%s')",
//                    message.getName(), message.getEmail(), message.getMsg());
//            statement.executeUpdate(sql);
//        } catch (SQLException ex) {
//            throw new RuntimeException(ex);
//        }
//    }

    //範例二
//    public void add(Message message) {
//        try(var conn = DriverManager.getConnection(url, username, passwords);
//            var statement = conn.prepareStatement(
//                    "INSERT INTO messages(name, email, msg) VALUES (?, ?, ?)")) {
//            statement.setString(1, message.getName());
//            statement.setString(2, message.getEmail());
//            statement.setString(3, message.getMsg());
//            statement.executeUpdate();
//        } catch (SQLException ex) {
//            throw new RuntimeException(ex);
//        }
//    }

    //第三版
    public void add(Message message) {
        try(var conn = dataSource.getConnection();
            var statement = conn.prepareStatement(
                    "INSERT INTO messages(name, email, msg) VALUES (?, ?, ?)")) {
            statement.setString(1, message.getName());
            statement.setString(2, message.getEmail());
            statement.setString(3, message.getMsg());
            statement.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Message> get() {
        var messages = new ArrayList<Message>();
        try(var conn = dataSource.getConnection();
            var statement = conn.createStatement()) {
            var result = statement.executeQuery("SELECT * FROM messages");
            while (result.next()) {
                var message = toMessage(result);
                messages.add(message);
            }
        } catch(SQLException ex) {
            throw new RuntimeException(ex);
        }
        return messages;
    }

    private Message toMessage(ResultSet result) throws SQLException {
        var message = new Message();
        message.setId(result.getLong(1));
        message.setName(result.getString(2));
        message.setEmail(result.getString(3));
        message.setMsg(result.getString(4));
        return message;
    }
}
