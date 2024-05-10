package pw;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class oraclejava {
	public static void main(String[] args)throws Exception{

        //load the JDBC Driver

        //11 

        //Connection Obj

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","planetwars","planetwarss");

        //JDBC Obj fro Statement

        Statement st = con.createStatement();

        //write the query

        String query = "select * from emp60";

        //create JDBC ResultSet obj

        ResultSet rs = st.executeQuery(query);

        while(rs.next()){

            System.out.println(rs.getInt(1)+" "+rs.getString(2));

        }

        rs.close();

        st.close();

        con.close();

    }

}