package sql;

import java.sql.*;

public class jdbcDemo01 {
    public static void main(String[] args) throws Exception{
//        /*1.导入驱动jar包,复制到libs文件下,右键add as library*/
//        /*2.注册驱动*/
//        Class.forName("com.mysql.jdbc.Driver");
//        /*3.获取数据库链接对象*/
//        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/layman","root","123456");
//        /*4.定义sql语句*/
//        String sql = "update usrinfo set password='zg' where id=0";
//        /*5.获取sql执行对象*/
//        Statement stat=conn.createStatement();
//        int num = stat.executeUpdate(sql);
//        /*6.处理结果*/
//        System.out.println(num);
//        /*7.释放资源*/
//        stat.close();
//        conn.close();
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection connection = DriverManager.getConnection("jdbc://mysql://localhost:3306/layman","root","123456");
         String sql = "update userinfo set password='zg' where id=0";
         Statement stmt = connection.createStatement();
         int num = stmt.executeUpdate(sql);
         System.out.println(num);
         stmt.close();
         connection.close();

    }
}
