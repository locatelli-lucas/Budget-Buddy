package application;

import db.DB;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection conn = DB.getConnection();
        DB.closeConnection();

    }
}