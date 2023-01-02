import javax.swing.plaf.nimbus.State;
import java.sql.*;
public class InsertData {
    public static void main(String[] args) throws Exception{

        String username = "angelpriya";
        String password = "daddysgirl";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");

        Statement st = con.createStatement();

        // We are not fetching data so instead executeQuery we use executeUpdate and it returns int value for number of rows affected
        int count = st.executeUpdate("INSERT INTO users(username,password) VALUES ("+"'"+username+"','"+password+"')");
        System.out.println(count);

        st.close();
        con.close();

    }
}
