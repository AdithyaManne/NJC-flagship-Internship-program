package sample;
import java.sql.*;
import java.util.Scanner; 

public class Insert1 {
	public static void main(String[] args) {  
	      String name, query,actor,actress,director,yearofrelease;
	      Scanner input = new Scanner (System.in); 
	      try { 
	       Class.forName("com.mysql.cj.jdbc.Driver"); 
	       System.out.println("Driver is loaded successfully"); 
	        
	       java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test","root", ""); 
	                  System.out.println("Connection is established"); 
	                  Statement st= con.createStatement(); 
	     
	                  System.out.println("Enter name:"); 
	                  name=input.next(); 
	                   System.out.println("Enter actor:"); 
	                   actor=input.next(); 
	                   System.out.println("Enter actress:"); 
	                  actress=input.next(); 
	                  System.out.println("Enter director:");
	                  director=input.next();
	                  System.out.println("Enter yearofrelease:");
	                  yearofrelease=input.next();
	                   query ="INSERT INTO movies values('"+name+"','"+actor+"','"+actress+"','"+director+"','"+yearofrelease+"');"; 
	                  st.executeUpdate(query); 
	      } catch (ClassNotFoundException | SQLException e) { 
	        
	       System.out.println(e); 
	      } 
	      input.close();
	     }
	

}
