package Details;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LegoDatabase {
    private Connection connection;

    // Конструктор класса
    public LegoDatabase(String url, String username, String password) throws SQLException {
        this.connection = DriverManager.getConnection(url, username, password);
    }

    // Метод для добавления детали в базу данных
    public void addPart(String name, String color,int quantity) throws SQLException {
        String query = "INSERT INTO parts (name, color, quantity) VALUES (?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, name);
        statement.setString(2, color);
        statement.setInt(3, quantity);
        statement.executeUpdate();
    }

    // Метод для получения списка деталей из базы данных
    public List<Map<String, Object>> getParts() throws SQLException {
        String query = "SELECT * FROM parts";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();

        List<Map<String, Object>> parts = new ArrayList<>();

        while (resultSet.next()) {
            Map<String, Object> part = new HashMap<>();
            part.put("name", resultSet.getString("name"));
            part.put("color", resultSet.getString("color"));
            part.put("quantity", resultSet.getInt("quantity"));
            parts.add(part);
        }
        return parts;
    }
}