package model.dao;

import entities.User;

import java.sql.Date;

public interface UserDao {
    public void registerUser(User user);
    public boolean login();
    public boolean updateData();
    public boolean registerExpense();
}
