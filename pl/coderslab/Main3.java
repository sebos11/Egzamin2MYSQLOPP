package pl.coderslab;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String parametr = "";
        System.out.println("Podaj id użytkownika którego wiadomości i zamówienia chcesz wyświetlić");
        while (!read.hasNextInt()) {
            System.out.println("podaj liczbę");
            read.next();
        }
        int id = read.nextInt();
        parametr = parametr + id;


        try (Connection conn = DBUtil.connect()) {

            String[] params = new String[1];
            params[0]=parametr;
            System.out.println("+++++++++++++ LISTA WIADOMOŚCI+++++++++++++++++++++ ");
            String[] columns = new String[]{"message"};
            DBUtil.printData(conn, "select * from messages where user_id = ?", params, columns);
           columns = new String[]{"id", "description", "created"};
            System.out.println("********* LISTA ZAMÓWIEŃ *************************");
            DBUtil.printData(conn,"select * from orders where user_id = ?",params,columns);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
