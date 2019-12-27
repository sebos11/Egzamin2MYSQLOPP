package Cwiczenia;

import pl.coderslab.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;


public class main02 {
           public static void main(String[] args) {
            try(Connection conn = DBUtil.connect()) {
                DBUtil.insert(conn,"insert into users(name, email, password) values(?, ?, ?)", "jav men", "shfdd@sd.pl", "asdewq");
                DBUtil.insert(conn,"insert into users(name, email, password) values(?, ?, ?)", "cuker java", "doeere@wp.pl", "qwerty");

            } catch (SQLException e){
                e.printStackTrace();
            }
        }

    }
