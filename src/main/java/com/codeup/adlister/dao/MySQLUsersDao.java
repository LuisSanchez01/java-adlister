package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;

public class MySQLUsersDao implements Users{
    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

//    public List<User> all() {
//        List<User> users = new ArrayList<>();
//        try {
//            Statement statement = connection.createStatement();
//            ResultSet rs = statement.executeQuery("SELECT * FROM users");
//            while (rs.next()){
//                User user = new User(
//                        rs.getLong("id"),
//                        rs.getLong("user_id"),
//                        rs.getString("title"),
//                        rs.
//                )
//            }
//        }
//    }

    @Override
    public User findByUsername(String username) {
       String query = "SELECT * FROM users\n" +
               "WHERE username = ?";
       try {
           PreparedStatement ps = connection.prepareStatement(query);
           ps.setString(1, username);
           ResultSet rs = ps.executeQuery();
           if (rs.next()){
//               create a user object to return
               return extractUser(rs);
           } else {
               return null;
           }
       } catch (SQLException e) {
           throw new RuntimeException(e);
       }
    }

    private User extractUser(ResultSet rs) throws SQLException {
        return new User(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("email"),
                rs.getString("password")
        );
    }

    @Override
    public Long insert(User user) {
        try {
            String sql = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());

            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }


    public static void main(String[] args) {
        Config config = new Config();
        MySQLUsersDao usersDao = new MySQLUsersDao(config);
        User user = usersDao.findByUsername("bob123");
        System.out.println(user.getUsername());
    }
}
