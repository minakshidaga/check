import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class feedback extends HttpServlet
{


   public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter pw1 = res.getWriter();
        String name = req.getParameter("n1");
     
        String cntct = req.getParameter("n2");
        String email =req.getParameter("n3");
        
        String fdbck= req.getParameter("n4");        
       
      
      try
      {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","lrsj","lrsj");
        Statement stmt=con.createStatement();
        String q1="insert into feedback values('"+name+"','"+cntct+"','"+email+"','"+fdbck+"')";

       
        int x=stmt.executeUpdate(q1);
        if(x>0)
        { 
           pw1.println("Thank you for your Feedback <a href=home.html>go to Home page</a>");
       }
       else
       {
         pw1.println("UNSUCCESSFULL <a href=home.html>go to Home page</a>");
       }
     con.close();
     }
     catch(Exception e)
     { 
        pw1.println(e);
     }
}
}