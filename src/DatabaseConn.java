
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class DatabaseConn {

		public static void main(String[] args){
			
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/test","","");
				System.out.println("connection establish");
				String query="select * from sudent";
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(query);
				while(rs.next()){
					System.out.println("id:" + rs.getInt("id")+ "name:" + rs.getString("name") + "class:" + rs.getString("class") );
				}
			}catch(Exception e){
				
				System.err.println(e);
			}
		}
}
