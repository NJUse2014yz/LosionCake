package com.edu.nju.wel.dao;

import com.edu.nju.wel.model.User;
import java.util.List;

/**
 * Created by zs on 2017/3/2.
 */
public interface UserDao {
    public List<User> findAll();
	public User findById(String id);
	public void delete(User user);
	public void update(User user);
	public void insert(User user);
}
