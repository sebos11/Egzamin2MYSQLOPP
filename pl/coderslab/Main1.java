package pl.coderslab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main1 {
	private static final String QUERY1 = "create table users (\n" +
			"    id int auto_increment primary key,\n" +
			"    name varchar(60) not null,\n" +
			"    email varchar(60) unique not null,\n" +
			"    password varchar(60) not null\n" +
			");";
	private static final String QUERY2 = "create table messages (\n" +
			"    id int  auto_increment primary key,\n" +
			"    user_id int,\n" +
			"    message text,\n" +
			"    foreign key(user_id) references users(id)\n" +
			");";
	private static final String QUERY3 = "create table items (\n" +
			"    id          int auto_increment primary key,\n" +
			"    name        varchar(40) not null,\n" +
			"    description text,\n" +
			"    price       decimal(7, 2)\n" +
			");\n";
	private static final String QUERY4 = "create table orders (\n" +
			"    id int auto_increment primary key,\n" +
			"    description text not null,\n" +
			"    created date,\n" +
			"    user_id int,\n" +
			"    foreign key(user_id) references users(id)\n" +
			");";
	private static final String QUERY5 = "create table items_orders(\n" +
			"    id int auto_increment primary key,\n" +
			"    item_id int,\n" +
			"    order_id int,\n" +
			"    foreign key(item_id) references items(id),\n" +
			"    foreign key(order_id) references orders(id)\n" +
			");";
	
	public static void main(String[] args){

		try (Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/exam2?useSSL=false&characterEncoding=utf8",
				"root", "coderslab");
			 Statement stat = conn.createStatement()) {

			stat.executeUpdate(QUERY1);
			stat.executeUpdate(QUERY2);
			stat.executeUpdate(QUERY3);
			stat.executeUpdate(QUERY4);
			stat.executeUpdate(QUERY5);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
