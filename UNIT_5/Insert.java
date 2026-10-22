import java.sql.*;
import java.util.Scanner;

class Insert
{
    public static void main(String args[]) 
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            Connection cn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test01", "root", "your_password");
            
            
            Statement stmt = cn.createStatement();
            
          
            Scanner sc = new Scanner(System.in);
            int grno = 0;
            String name = "";
            
            System.out.println("Enter grno:");
            grno = sc.nextInt();
            
            System.out.println("Enter name:");
            name = sc.next();
         
            try 
            {
                int x = stmt.executeUpdate("INSERT INTO stud VALUES (" + grno + ", '" + name + "')");
                System.out.println("No of row inserted: " + x);
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