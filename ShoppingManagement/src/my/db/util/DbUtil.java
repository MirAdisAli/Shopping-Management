package my.db.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {

   private static final String USER = "root";
   private static final String UPWD = "12345678";

   private static final String URL = "jdbc:mysql://localhost:3306/shop";
   private static final String DRIVER = "com.mysql.jdbc.Driver";

   static {
       try {
           Class.forName(DRIVER);
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
   }

   public static Connection getConnection() throws SQLException {
       return DriverManager.getConnection(URL, USER, UPWD);
   }

   public static void close(Connection connection, Statement statement) {
       if (statement != null) {
           try {
               statement.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
       if (connection != null) {
           try {
               connection.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
   }

   public static void close(Connection connection, Statement statement, ResultSet rs) {
       if (statement != null) {
           try {
               statement.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
       if (connection != null) {
           try {
               connection.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
       if (rs != null) {
           try {
               rs.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
   }
}





