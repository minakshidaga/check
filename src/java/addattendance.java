/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class addattendance extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String nm=req.getParameter("fname1");
        String mnm=req.getParameter("fname2");
        String lnm=req.getParameter("fname3");
        String rno=req.getParameter("fname4");
       String dat=req.getParameter("fname5");
        String mon=req.getParameter("fname6");
       String yr=req.getParameter("fname7");
       String lupdt=dat+"/"+mon+"/"+yr;
        
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
    String q1="insert into atdnc values('"+nm+"','"+mnm+"','"+lnm+"','"+rno+"','"+lupdt+"','"+gndr+"','"+year+"','"+dept+"',"
            + "'"+atdnc+"','"+tatdnc+"','"+email+"','"+fdbck+"')";
 // pw1.println(q1);
   int x=stmt.executeUpdate(q1);
    if(x>0)
    {
        pw1.println("<html><body> successfully inserted<br><a href=admin.html>go to home page</a></body></html>");
                
                }
    else
    {
        pw1.println("insertion unsuccesful");
    }
    con.close();
    }
    catch(Exception e)
    {
        pw1.println(e);
    }
    }
}