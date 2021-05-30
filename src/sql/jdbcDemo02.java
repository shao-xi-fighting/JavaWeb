package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcDemo02 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/layman","root","123456");
        String sql = "update userinfo set password='sydASIOYD' where id=1";
        Statement stmt = connection.createStatement();
        int num=stmt.executeUpdate(sql);
        System.out.println(num);
        stmt.close();
        connection.close();
    }
}
