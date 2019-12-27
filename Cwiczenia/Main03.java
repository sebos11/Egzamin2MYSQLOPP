package Cwiczenia;

import pl.coderslab.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id użytkownika:");
        String user_id = scanner.nextLine();
        System.out.println("Podaj wiadomość: ");
        String message = scanner.nextLine();
        addMessage(user_id, message);
    }

    static void addMessage(String user_id, String message){
        try(Connection conn = DBUtil.connect()) {
            DBUtil.insert(conn,"insert into messages (user_id, message) values(?, ?)", user_id, message);

        } catch (SQLException e){
            e.printStackTrace();
        }

    }

}
