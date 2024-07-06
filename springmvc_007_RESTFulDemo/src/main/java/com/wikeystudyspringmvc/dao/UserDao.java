package com.wikeystudyspringmvc.dao;

import com.wikeystudyspringmvc.bean.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wikey
 * @create: 2024-06-30 00:12
 * @Description:
 */
@Repository
public class UserDao {

    private static List<User> userList = new ArrayList<>();

    static {
        User user1 = new User(1L,"jack", 1, "jack@gmail.com");
        User user2 = new User(2L,"mercy", 2, "mercy@gmail.com");
        User user3 = new User(3L,"tom", 1, "tom@gmail.com");
        User user4 = new User(4L,"lily", 2, "lily@gmail.com");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
    }

    public List<User> getAllUser() {
        return userList;
    }

    public void saveUser(User user) {
        Long id = this.generateId();
        user.setId(id);
        userList.add(user);
    }

    public Long generateId() {
        Long maxId = userList.stream().map(user -> user.getId()).reduce((id1, id2) -> id1 > id2 ? id1 : id2).get();
        return maxId;
    }
}