package Cwiczenia;
import pl.coderslab.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class Main01 {
    public static void main(String[] args) {
        try (
                Connection conn = DBUtil.connect()) {
            System.out.println("connect");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
