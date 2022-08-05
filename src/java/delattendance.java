/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class delattendance extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String nm=req.getParameter("fname1");
        String mnm=req.getParameter("fname2");
        String lnm=req.getParameter("fname3");
        String rno=req.getParameter("fname4");
       String dt=req.getParameter("fname5");
        String mnth=req.getParameter("fname6");
       String yr=req.getParameter("fname7");
       String dob=dt+"/"+mnth+"/"+yr;
        
        String gndr=req.getParameter("fname8");
        String year=req.getParameter("fname9");
        String dept=req.getParameter("fname10");
        String atdnc=req.getParameter("fname11");
        String tatdnc=req.getParameter("fname12");
        String email=req.getParameter("fname13");
        String fdbck=req.getParameter("fname14");
      
  
 
  
   try
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:"+"oracle:thin:"+"@localhost:1521:XE","lrsj","lrsj");
      Statement stmt=con.createStatement();
    String q1="delete from atdnc where rno='"+rno+"'";

   int x=stmt.executeUpdate(q1);
    if(x>0)
    {
        pw1.println("<html><body> successfully Deleted<br><a href=admin.html>go to home page</a></body></html>");
                
                }
    else
    {
        pw1.println("Deletion unsuccesful <br> <a href=admin.html>go to home page</a>");
    }
    con.close();
    }
    catch(Exception e)
    {
        pw1.println(e);
    }
    }
}