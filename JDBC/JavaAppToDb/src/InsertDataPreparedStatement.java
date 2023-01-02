import java.sql.*;
public class InsertDataPreparedStatement {
    public static void main(String[] args) throws Exception{
        String username = "jasonBrat";
        String password = "ninjastar";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");

        //We pass sql query in prepared statement
        PreparedStatement st = con.prepareStatement("INSERT INTO users(username,password) VALUES (?,?)");
        st.setString(1,username); // 1 is for first ?
        st.setString(2,password); // 2 is for second ?
        int count = st.executeUpdate();
        System.out.println(count);



    }
}
