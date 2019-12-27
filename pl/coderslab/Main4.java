package pl.coderslab;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę produktu:");
        String name = scanner.nextLine();
        System.out.println("Podaj opis produktu ");

        String description = scanner.nextLine();

        Scanner read = new Scanner(System.in);
        String price = "";
        System.out.println("Podaj cenę produktu");
        while (!read.hasNextDouble()) {
            System.out.println("podaj liczbę");
            read.next();
        }
        double cena = read.nextDouble();
        price = price + cena;

        addItems(name, description, price);
    }

    static void addItems(String name, String description, String price) {
        try (Connection conn = DBUtil.connect()) {
            DBUtil.insert(conn, "insert into items (name, description, price) values(?, ?, ?)", name, description, price);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
