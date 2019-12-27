package Cwiczenia;

import pl.coderslab.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj id użytkownika");
        while (!scan.hasNextInt()) {
            System.out.println("Musisz podać numer");
            scan.next();
        }
        int id = scan.nextInt();

        try (Connection conn = DBUtil.connect()) {
            DBUtil.remove(conn, "messages", id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
