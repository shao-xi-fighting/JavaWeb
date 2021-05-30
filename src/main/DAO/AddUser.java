package main.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AddUser {
    public void adduser(String loginName,String loginPassword){
        Connection conn=null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn=DBUtil.getConnection();
            String sql="Insert into users(username,pword) values(?,?)";
            ps=conn.prepareStatement(sql);
            ps.setString(1,loginName);
            ps.setString(2,loginPassword);
            ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBUtil.close(conn,ps,rs);
        }
    }


}
