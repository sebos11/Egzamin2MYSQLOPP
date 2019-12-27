package Cwiczenia;

import pl.coderslab.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class main06 {
    public static void main(String[] args) {
        try (Connection conn = DBUtil.connect()) {
            String avgPrice = DBUtil.singleValue(conn, "select avg(price) as p from items ", "p");
            System.out.println("Average rating " + avgPrice);
            String[] params = new String[]{"60"};
            String[] columns = new String[]{"id", "description", "price"};
            DBUtil.printData(conn, "select * from items where price > ?", params, columns);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
