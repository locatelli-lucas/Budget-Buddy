package model.dao.impl;

import db.DB;
import db.DBException;
import entities.User;
import model.dao.UserDao;

import java.sql.*;

public class UserDaoJDBC implements UserDao {
    private Connection conn;

    public UserDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void registerUser(User user) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "INSERT INTO user " +
                            "(Name, BirthDate, Email, MonthlyIncome, Password, Balance, ReportGap) " +
                            "VALUES " +
                            "(?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            st.setString(1, user.getName());
            st.setDate(2, new java.sql.Date(user.getBirthDate().getTime()));
            st.setString(3, user.getEmail());
            st.setDouble(4, user.getMonthlyIncome());
            st.setString(5, user.getPassword());
            st.setDouble(6, user.getBalance());
            st.setInt(7, user.getReportGap());

            int rowsAffected = st.executeUpdate();

            if(rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if(rs.next()) {
                    int id = rs.getInt(1);
                    user.setUserId(id);
                }
                DB.closeResultSet(rs);
            } else
                throw new DBException("Unexpected Error! No rows affected");

        } catch (SQLException e) {
            throw new DBException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public boolean login() {
        return false;
    }

    @Override
    public boolean updateData() {
        return false;
    }

    @Override
    public boolean registerExpense() {
        return false;
    }
}
