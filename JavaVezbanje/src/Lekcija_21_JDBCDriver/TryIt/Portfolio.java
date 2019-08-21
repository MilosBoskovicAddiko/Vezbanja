package Lekcija_21_JDBCDriver.TryIt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Portfolio implements Runnable{
    @Override
    public void run() {
        String sqlQuery = "select * from portfolio";
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lesson21","root","root");
            Statement st = connection.createStatement(); ResultSet rs = st.executeQuery(sqlQuery);) {

            while (rs.next()) {
                System.out.println("Id: " + rs.getInt("id") + ", Symbol: "+ rs.getString("symbol") +
                        ", Quantity: " + rs.getInt("quantity") + ", Total Price: " + (rs.getDouble("quantity") * rs.getDouble("price")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
