package sample;
import java.sql.*;
public class Display {
	public static void main(String args[]){ 
        try{ 
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test","root",""); 
        Statement st = con.createStatement(); 
        String query,name1,actor1,actress1,director1,yearofrelease1; 
        int id1; 
        query="SELECT name,actor,actress,director,yearofrelease from movies"; 
        ResultSet rs = st.executeQuery(query); 
        while(rs.next()){ 
            name1=rs.getString("Name"); 
           actor1=rs.getString("actor"); 
            actress1=rs.getString("actress");
            director1=rs.getString("director");
            yearofrelease1=rs.getString("yearofrelease");
            System.out.println(name1+" "+ actor1+ " "+actress1+ " "+director1+ " "+yearofrelease1); 
        } 
        } 
        catch(Exception e){ 
            System.out.println(e); 
        } 
 }

}
