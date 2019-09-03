package com.lix.importurl;

import com.lix.domain.Company;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.PooledDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySqlDao {
   /* static PooledDataSource pool = new ComboPooledDataSource("mysql");

    public static Connection getConnection() {
        try {
            return pool.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
*/
   public static void main(String[] args) {
       getCompanys(20);
   }
    public static List<Company> getCompanys(int i) {
        List list = new ArrayList();

        String sql = "select * from huizong limit ?,?";
        PreparedStatement statement =null;
        Connection connection=null;
        try {
             connection = MysqlUtils.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, i);
            statement.setInt(2, 50);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet == null) {
                return new ArrayList<>();
            }
            while (resultSet.next()) {
                Company c = new Company();
                c.setId(resultSet.getString("序号"));
                c.setCode(resultSet.getString("股票代码"));
                c.setQyjc(resultSet.getString("股票简称"));
                c.setType(resultSet.getString("备注"));
                c.setEnName(resultSet.getString("英文名"));
                c.setZhName(resultSet.getString("中文名"));
                list.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public static void close(Connection conn, PreparedStatement pst, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pst != null) {
            try {
                pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void insert(String target, String infoId, String category) {
        String sql = "insert into construction values(?,?,?)";
        try {
            PreparedStatement statement = MysqlUtils.getConnection().prepareStatement(sql);
            statement.setString(1, target);
            statement.setString(2, infoId);
            statement.setString(3, category);
            statement.execute();
        } catch (Exception e) {
            System.out.println("公司为"+target);
            e.printStackTrace();
        }
    }
}
