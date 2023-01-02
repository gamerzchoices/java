import java.sql.*;

/* JAVA database connectivity

1 import the package
2 load and register the driver --> Go to File > Project Structure > Platform Setting > Global libraries > Add *.jar
3 establish the connection
4 create a statement
5 execute the query
6 process data
7 close

*/
public class ShowAppData {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root",""); // We can't create object of interface,so we need to search for method to make its instance
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM users");

        System.out.printf("%-4s | %-30s | %-16s\n","Id","Username","Password");
        // rs.next(); Move the pointer to data
        while(rs.next()){
            int id = rs.getInt("id");
            String username = rs.getString("username");
            String password = rs.getString("password");

            System.out.printf("%-4s | %-30s | %-16s\n",id,username,password);
        }

        st.close();
        con.close();

    }
}
