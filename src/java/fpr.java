/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class fpr extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
         PrintWriter pw1=res.getWriter();
        String uid=req.getParameter("fname1");
        String pass=req.getParameter("fname2");
        String nm=req.getParameter("fname3");
        String mnm=req.getParameter("fname4");
        String lnm=req.getParameter("fname5");
       String dt=req.getParameter("fname6");
        String mnth=req.getParameter("fname7");
       String yr=req.getParameter("fname8");
       String dob=dt+"/"+mnth+"/"+yr;
        
        String gndr=req.getParameter("fname9");
        String addr=req.getParameter("fname10");
        String city=req.getParameter("fname11");
        String pin=req.getParameter("fname12");
        String email=req.getParameter("fname13");
        String sq=req.getParameter("fname14");
        String ans=req.getParameter("fname15");
  
 
   try
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:"+"oracle:thin:"+"@localhost:1521:XE","lrsj","lrsj");
      Statement stmt=con.createStatement();
            String q1="update reg1 set pass1 ='"+pass+"'";
            
        ResultSet x=stmt.executeQuery(q1);
        if(x.next())
    {
          pw1.println("update successfull");
       }
       else
       {
         System.out.println("Not found ");
       }
     con.close();
     }
     catch(Exception e)
     { 
        System.out.println(e);
     }
}
}