package pl.coderslab;

public class Main2 {

	private static final String QUERY1 = "select * from items where price > 50 order by price;";
	private static final String QUERY2 = "insert into items (name, description, price) VALUES ('product 1','desc 1',0.09);";
	private static final String QUERY3 = "DELETE from users where id = 7;";
	private static final String QUERY4 = "select distinct name from users, messages\n" +
			"where users.id = messages.user_id;";
	private static final String QUERY5 = "select name, price from items where id in (\n" +
			"    select item_id from items_orders where order_id=2\n" +
			"    ) order by price desc limit 1;";
	private static final String QUERY6 = "select * from orders where created = '2017-11-12';";
	private static final String QUERY7 = "insert into items_orders (item_id, order_id) VALUES\n" +
			"(2,6);";

	
}
