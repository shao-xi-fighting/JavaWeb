package main.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CheckUsername {


    public boolean CheckName(String loginName){
        boolean checkUsernameFlag=false; //设置检查标记，true表明用户名在数据库中不存在
        Connection conn=null;
        PreparedStatement ps = null;
        ResultSet rs =null;
        try{
            conn=DBUtil.getConnection();
            String sql="SELECT username FROM users WHERE username=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,loginName);
            rs=ps.executeQuery();
            if(rs.next()){  //查询结果行数大于0说明填写的用户名不存在与数据库中
                checkUsernameFlag=false;
            }else{
                checkUsernameFlag=true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBUtil.close(conn,ps,rs);
        }
        return checkUsernameFlag;
    }
}
