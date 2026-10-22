import java.sql.*;
import java.util.*;

class Delete 
{
    public static void main(String args[]) 
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            Connection cn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test01", "root", "");
            
            
            Statement stmt = cn.createStatement();
            
          
            Scanner sc = new Scanner(System.in);
            int grno = 0;
            
            System.out.println("Enter grno. for record which you want to delete");
            grno = sc.nextInt();
            
    
            try 
            {
                int x = stmt.executeUpdate("delete from stud where grno="+grno);
                System.out.println("No of rows affected: " + x);
            } 
            catch (Exception e) 
            {
                System.out.println("Exception: " + e);
            }
         
            cn.close();
            sc.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}