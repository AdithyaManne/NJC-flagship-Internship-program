package sample;

import java.sql.Connection;
import java.sql.DriverManager;

public class Create1 {
	public static void main(String[] args) {
	     try {
	       Class.forName("com.mysql.cj.jdbc.Driver");
	              Connection conn = null;
	              conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
	           java.sql.Statement st=conn.createStatement();
	            final String createTableSQL = "create table movies (\r\n" + "  name  varchar(20) ,\r\n" +
	                    "  actor varchar(20),\r\n" + " actress varchar(20),\r\n" + "  director varchar(20),\r\n" +
	                    "  yearofrelease varchar(20)\r\n" + "  );";
	           boolean flag=st.execute(createTableSQL);
	           if(!flag)
	           {
	             System.out.println("table created successfully");
	           }
	           else
	           {
	             System.out.println("table not created");
	           }
	           conn.close();
	       }
	       catch(Exception e) {
	           System.out.print("Do not connect to DB - Error:"+e);
	       }
	  }

}
