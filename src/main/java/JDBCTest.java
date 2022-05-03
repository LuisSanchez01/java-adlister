import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class JDBCTest {
    private static List<String> getAuthorNames() {
        List<String> authorNames = new ArrayList<>();
        try {
            Config config = new Config();
            // Establish connection
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword());

            // Create statement object
            Statement statement = connection.createStatement();
            // Execute statement
            ResultSet rs = statement.executeQuery("SELECT author_name FROM codeup_test_db.authors");
            while (rs.next()){
                authorNames.add(rs.getString("author_name"));
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return authorNames;
    }

    public static void main(String[] args) {
        List<String> authors = getAuthorNames();
        for(String name : authors){
            System.out.println(name);
        }
    }
}



