import java.sql.*;
public class DeleteData {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
        Statement st = con.createStatement();
        int count = st.executeUpdate("DELETE FROM users WHERE username='jasonBrat'");
        System.out.println(count);
        st.close();
        con.close();
    }

}
