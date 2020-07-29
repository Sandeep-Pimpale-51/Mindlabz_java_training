import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.StringTokenizer;

public class ReadStudent {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		int roll;
		String name;
		int mark;
		int percentage;
		try
		{
		    // Open an input stream
		  

		    // Read a line of text

			BufferedReader br = null;

			try {

				String line;

				br = new BufferedReader(new FileReader("C://read.txt"));
				
				while ((line = br.readLine()) != null) 
				{
				   System.out.println(line);

				   StringTokenizer tokens = new StringTokenizer(line, " ");
				   		while(tokens.hasMoreTokens())
				   		{

				   				
				   				name = tokens.nextToken();
				   				roll = Integer.parseInt(tokens.nextToken());
				   				mark = Integer.parseInt(tokens.nextToken());
				   				percentage = Integer.parseInt(tokens.nextToken());
				   				Connection con = null;
				   				Class.forName("oracle.jdbc.driver.OracleDriver");
				   				con =
				   				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","system");
				   		      String sql = "INSERT INTO student VALUES (?,?,?,?)";
				   		   PreparedStatement st = con.prepareStatement(sql);
				   		st.setString(1,name);
				   		st.setInt(2,roll);
				   		st.setInt(3,mark);
				   		st.setInt(4, percentage);
				   		st.executeQuery();
				   		   System.out.println("Inserted records into the table...");
				        con.close();

				   		}
				   				
				   		if (br != null)
				br.close();
				   		
				System.out.println("Done");

			}
				} 
			catch (IOException e) {
				e.printStackTrace();
			}
			
		}finally {
			System.out.println("Done");
		}
	}
}