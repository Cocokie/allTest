package com.lix.mapper;

import com.lix.domain.Orders;
import com.lix.domain.OrdersUser;
import com.lix.domain.User;

import java.util.List;

public interface OrdersUserMapper {
    public List<OrdersUser> findOrdersUser();
    public List<Orders> findOrdersUserMap();
    public List<Orders> findOrdersDetails();
    public List<User> findMost();
    public List<Orders> findOrder();
    public void insertUser(User user);


}
