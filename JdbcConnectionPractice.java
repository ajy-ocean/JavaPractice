import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class JdbcConnectionPractice {

    public static void main(String[] args) {

        try {
            // Registering The Driver.....
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Creating Connection..........
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/weebtech", "blankocean",
                    "blankocean@root");

            // Creating Statement..........
            Statement stmt = con.createStatement();

            // Executing Statement.........
            String query = "SELECT * FROM user";
            ResultSet resultset = stmt.executeQuery(query);

            while (resultset.next()) {
                System.out.println(resultset.getInt(1) + " " + resultset.getString(2));
            }

            // Get metaData about tablte....
            ResultSetMetaData rsmd = resultset.getMetaData();
            System.out.println(rsmd.getColumnCount());
            
            // Get metaData about database....
            DatabaseMetaData dbmd = con.getMetaData();
            System.out.println("Driver Name: " + dbmd.getDriverName());
            System.out.println("Driver Version: " + dbmd.getDriverVersion());
            System.out.println("UserName: " + dbmd.getUserName());
            System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
            System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());

            // Closing the connection.........
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}