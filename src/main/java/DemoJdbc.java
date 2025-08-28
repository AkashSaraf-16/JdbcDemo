// Step 1: import packages

import java.sql.*;

public class DemoJdbc{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Step 2/3: Load and register the driver
        Class.forName("org.postgresql.Driver");

        // Step 4: Create the connection
        String url = "jdbc:postgresql://localhost:5432/demo";
        String usrName = "postgres";
        String pass = "1234";
        Connection conn = DriverManager.getConnection(url,usrName, pass);

        // Step 5: Create statement
        Statement st = conn.createStatement();

//        String query = "select * from student";
//        String query = "insert into student values (4,'Raman', 87)" ;
//        String query = "update student set marks=89 where sid=2" ;
        String query = "delete from student where sid=3" ;

        //Step 6: Execute Statement
//        ResultSet rs = st.executeQuery(query);
        boolean status = st.execute(query);
        System.out.println(status);
//        while(rs.next()){
//            String name = rs.getString("name");
//            int marks = rs.getInt("marks");
//            System.out.println(name+ " - " +marks);
//        }

        conn.close();

    }
}