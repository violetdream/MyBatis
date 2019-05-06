package com.personal.batis;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 2019/5/5/0005
 * Create by 刘仙伟
 */
public class Executor {
    public <T> T query(String sql, Object parameter) {
        Connection connection=null;
        PreparedStatement pstmt=null;
        List list=new ArrayList();
        EUser user=new EUser();
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/ORCLPDB","ebank_48","ebank_48");
//            stmt=connection.createStatement();
            connection.setAutoCommit(false);
            pstmt=connection.prepareStatement(sql,new String[]{String.valueOf(parameter)});
            if(null!=parameter&&!"".equals(parameter)){
                pstmt.setString(1,String.valueOf(parameter));
            }

            ResultSet resultSet=pstmt.executeQuery();
            connection.commit();

            while(resultSet.next()){
                String cifSeq=resultSet.getString("CIFSEQ");
                String userSeq=resultSet.getString("USERSEQ");
                String userId=resultSet.getString("USERID");
                user.setCifSeq(cifSeq);
                user.setUserSeq(userSeq);
                user.setUserId(userId);
                list.add(user);
            }
            System.out.println("list = " + list);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (T)list;
    }
}
