import java.sql.*;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesPractice {

    public static void main(String[] args) {
        Properties p = new Properties();
        try {
            FileInputStream fis = new FileInputStream("myDb.properties");
            p.load(fis);
            String driverName = p.getProperty("driverName");
            /* 
                The url should be like this in the properties file
                url = jdbc\:mysql\://localhost\:3306/weebtech

                if you put url like this
                url = jdbc:mysql://localhost:3306/weebtech 
                you will get error like no suitable driver found
            */
            String url = p.getProperty("url");
            String user = p.getProperty("user");
            String password = p.getProperty("password");
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            ResultSet resultset = st.executeQuery("SELECT * FROM user");
            while (resultset.next()) {
                System.out.println(resultset.getString(2));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
