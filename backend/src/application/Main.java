package application;

import db.DB;
import entities.User;
import model.dao.DaoFactory;
import model.dao.UserDao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
public class Main {
    public static void main(String[] args) throws SQLException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("=====TESTE CADASTRO=====");
        UserDao userDao = DaoFactory.createUserDao();
        User user = new User("Lucas Berta ",sdf.parse("30/03/2002"), "lucasalmeidaberta@gmail.com", 0, "123", 0, 2);

        userDao.registerUser(user);
    }
}