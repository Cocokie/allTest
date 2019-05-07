package com.lix;

import com.lix.domain.Orders;
import com.lix.domain.OrdersUser;
import com.lix.domain.User;
import com.lix.domain.UserVo;
import com.lix.mapper.OrdersUserMapper;
import com.lix.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.Date;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) throws IOException {

        String path = "SqlMapConfig.xml";
        Reader resourceAsReader = Resources.getResourceAsReader(path);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(resourceAsReader);
        SqlSession sqlSession = sf.openSession();
        OrdersUserMapper ou = sqlSession.getMapper(OrdersUserMapper.class);
        List<Orders> ordersUsers = ou.findOrder();
        for (Orders ordersUser : ordersUsers) {
            System.out.println(ordersUser.getUser());
            System.out.println(ordersUser);
        }



    }
}
