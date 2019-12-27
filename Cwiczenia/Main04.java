package Cwiczenia;

import java.sql.Connection;
import java.sql.SQLException;

import static pl.coderslab.DBUtil.connect;
import static pl.coderslab.DBUtil.printData;

public class Main04 {
    public static void main(String[] args) {

        try (Connection conn = connect()) {
            printData(conn, "select * from users", "id", "name", "email", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }



}
