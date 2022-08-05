/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class queryrcv extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String name=req.getParameter("fname1");
        String email=req.getParameter("fname2");
        String cntct=req.getParameter("fname3");
       
        String query=req.getParameter("fname4");
        
      
        
        
     
    try
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:"+"oracle:thin:"+"@localhost:1521:XE","lrsj","lrsj");
      Statement stmt=con.createStatement();
    String q1="select * from query";
    pw1.println("<!DOCTYPE html>\n" +
"<html>\n" +
"\n" +
"<head>\n" +
 " <title>Our CollegeWebsite</title>\n" +
 " <link href=\"site.css\" rel=\"stylesheet\">\n" +
"</head>\n" +


"<body background=\"black\">\n" +

"  <div id=\"main\">\n" +
 
 "     <table border=\"1\"  width=\"100%\"  >\n" +
"<tr><td rowspan=\"4\" align=\"center\" ><img src=\"logo.jpg\" width=\"250\" height=\"150\"></td>\n" +
" <td align=\"center\" bgcolor=\"brown\"> <font color=\"lavender\" font size=\"20\" style=\"font-family:Times New Roman;font-weight:bold\">IMPS College of Engineering & Technology</font></td>\n" +
"</tr>\n" +
"<tr><td align=\"center\" bgcolor=\"brown\"> <font color=\"lavender\" font size=\"4\"style=\"font-family:Arial;font-weight:italic\"  >Approved by All India Council of Technical Education, Government of India</font></td>\n" +
"</tr>\n" +
"<tr><td align=\"center\" bgcolor=\"brown\"> <font color=\"lavender\" font size=\"4\"style=\"font-family:Times New Roman;font-weight:italic\" >Affiliated to Maulana Abul Kalam Azad University of Technology (Formerly know as W.B.U.T), Government of India</font></td>\n" +
"</tr>\n" +
"<tr><td align=\"center\" bgcolor=\"brown\"> <marquee><font color=\"lavender\" style=\"font-family:Times New Roman;font-weight:italic\"font size=\"4\">IMPSCET welcomes you || Even Semester 2016 Practical Exams routine are out || Even semester 2016 Form Fillup have begun</marquee></font></td>\n" +
"</tr>\n" +
"      </table>\n" +
"<ul class=\"main-navigation\">\n" +
"  <li><a href=\"admin.html\">Home</a></li>\n" +
 
  
"   <li><a>Attendance</a>\n" +
 "  <ul>\n" +
 "     <li><a href=\"addattendance.html\">Add Attendance</a></li>\n" +
 "       <li><a href=\"modattendance.html\">Edit Attendance</a></li>\n" +
 "        <li><a href=\"delattendance.html\">Delete Attendance</a></li>\n" +
 "  </ul></li>\n" +
 
 " <li><a href=\"queryrcv.html\">View Query</a></li>\n" +
 " <li><a href=\"fbrcv.html\">View Feedback</a></li>\n" +
"</ul>\n" +
" \n" +
"  </div>\n" +
"\n" +
"</body>\n" +
"</html> ");
    
   ResultSet x=stmt.executeQuery(q1);
   
        while(x.next())
    {
          pw1.println(" <html>\n" +
"<body>\n" +
"    <form method=\"post\">\n" +
"        <table>\n" +
"            <tr>\n" +
 "              <td>"+x.getString(1)+"</td>\n" +
                  "              <td>"+x.getString(2)+"</td>\n" +
                  "              <td>"+x.getString(3)+"</td>\n" +
                  "              <td>"+x.getString(4)+"</td>\n" +

"                \n" +
"                \n" +
"            </tr>\n" +
"        </table>\n" +
"    </form>    \n" +
"</body>  \n" +
"</html>\n" +
"");
                }
   
   
    }
    
    catch(Exception e)
    {
        pw1.println(e);
    }
    }
}