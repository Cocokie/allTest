package com.lix.mapper;

import com.lix.domain.User;
import com.lix.domain.UserVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    public User findUser(int i);
    public void addUser(User u);
    public void deleteUser(User u);
    public void updateUser(User u);
    public List<User> findAll();
    public List<User> findUserBy(UserVo user);

}
