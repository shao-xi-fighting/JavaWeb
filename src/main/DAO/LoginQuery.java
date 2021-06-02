package main.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginQuery {
    public boolean serachUser(String uname,String upasswd){
        boolean serachFlag =false;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn = DBUtil.getConnection();
            String sql = "SELECT * FROM users WHERE username='"+uname+"' AND pword='"+upasswd+"'";
            ps=conn.prepareStatement(sql);
            rs = ps.executeQuery();
           if(rs.next()){
               if(rs.getString(2).equals(uname)&&rs.getString(3).equals(upasswd)){
                   serachFlag=true;
               }
           }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBUtil.close(conn,ps,rs);
        }
        return  serachFlag;
    }

}
