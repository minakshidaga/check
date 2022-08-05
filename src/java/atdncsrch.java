/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class atdncsrch extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String rno=req.getParameter("fname4");
        
        
       
      
      
        
        
     
    try
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:"+"oracle:thin:"+"@localhost:1521:XE","lrsj","lrsj");
      Statement stmt=con.createStatement();
    String q1="select * from atdnc where rno='"+rno+"'";
    
    pw1.println("<!doctype html>\n" +
"<html>\n" +
"<head>\n" +
"<meta charset=\"utf-8\">\n" +
"<title>College Website</title>\n" +
"<style>\n" +
"ul {\n" +
"  list-style: none;\n" +
"  padding: 0;\n" +
"  margin: 0;\n" +
"  background: #1bc2a2;\n" +
"}\n" +

"ul li {\n" +
 " display: block;\n" +
  "position: relative;\n" +
  "float: left;\n" +
  "background: #1bc2a2;\n" +
"}\n" +

/* This hides the dropdowns */


"li ul { display: none; }\n" +

"ul li a {\n" +
"  display: block;\n" +
"  padding: 1em;\n" +
 " text-decoration: none;\n" +
  "white-space: nowrap;\n" +
  "color: #fff;\n" +
"}\n" +

"ul li a:hover { background: #2c3e50; }\n" +

/* Display the dropdown */


"li:hover > ul {\n" +
  "display: block;\n" +
  "position: absolute;\n" +
"}\n" +

"li:hover li { float: none; }\n" +

"li:hover a { background: #1bc2a2; }\n" +

"li:hover li a:hover { background: #2c3e50; }\n" +

".main-navigation li ul li { border-top: 0; }\n" +

/* Displays second level dropdowns to the right of the first level dropdown */


"ul ul ul {\n" +
"  left: 100%;\n" +
 " top: 0;\n" +
"}\n" +

/* Simple clearfix */



"ul:before,\n" +
"ul:after {\n" +
 " content: \"\";\n" +
  "display: table; \n" +
"}\n" +

"ul:after { clear: both; }\n" +
"body {\n" +
 "   font-family: \"Trebuchet MS\", Verdana, sans-serif;\n" +
  "  font-size: 16px;\n" +
   " background-color: goldenrod;\n" +
    "color: #555555;\n" +
    "padding: 3px;\n" +
"}\n" +

"#main {\n" +
 "   padding: 5px;\n" +
  "  padding-left:  15px;\n" +
   " padding-right: 15px;\n" +
    "background-color: #ffffff;\n" +
    "border-radius: 0 0 5px 5px;\n" +
"}\n" +

"h1 {\n" +
 "   font-family: HELVETICA,SANS-SERIF;\n" +
  "  border-bottom: 3px solid #cc9900;\n" +
   " color: #FF6103;\n" +
    "font-size: 38px;\n" +
"}\n" +
"h2 \n" +
 "   font-family: Georgi serif;\n" +
  "  border-bottom: 3px solid #cc9900;\n" +
   " color: #CDC3700;\n" +
    "font-size: 25px;\n" +
"}\n" +
"table {\n" +
 "   width:100%;\n" +
"}\n" +

"table, th , td {\n" +
"    border: 1px solid brown;\n" +
"   border-collapse: collapse;\n" +
"    padding: 5px;\n" +
"}\n" +

"th {\n" +
"    text-align: left;\n" +
"}\n" +

"table tr:nth-child(odd) {\n" +
 "   background-color: #fff0f5;\n" +
"}\n" +
"table tr:nth-child(even) {\n" +
"    background-color: #fff0f5;\n" +
"} \n" +

"form {\n" +
              
"}\n" +
".search {\n" +
  "              padding:8px 15px\n" +
  "              background:rgba(50, 50, 50, 0.2);\n" +
"                border:0px solid #dbdbdb;\n" +
"}\n" +
".button {\n" +
 "               position:relative;\n" +
"                padding:6px 15px;\n" +
 "               left:-8px;\n" +
  "              border:2px solid #207cca;\n" +
   "             background-color:#207cca;\n" +
   "             color:#fafafa;\n" +
"}\n" +
"</style>\n" +
"</head>\n" +

"\n" +
"<body background=\"black\">\n" +
"\n" +
"  <div id=\"main\">\n" +
" \n" +
"      <table border=\"1\"  width=\"100%\"  >\n" +
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
"  <li><a href=\"home.html\">Home</a></li>\n" +
 "   <li><a>Department</a>\n" +
"    <ul>\n" +
"        <li><a ><img src =\"it.jpg\" width =\"20\" height =\"20\">Computer Science & Engineering</a>\n" +
"	  <ul>\n" +
"	  <li><a href=\"cse.html\">Introduction</a></li>\n" +
"	  <li><a href=\"csefaculty.html\">Faculty</a></li>\n" +
"	  <li><a href=\"cselab.html\">Laboratories</a></li>\n" +
"           <li><a href=\"cseachivement.html\"> Achievement</a></li>\n" +
"	  </ul>\n" +
"      <li><a ><img src =\"ece.png\" width =\"20\" height =\"20\">Electronics & Communication Engineering</a>\n" +
"        <ul>\n" +
"          <li><a href=\"ece.html\">Introduction</a></li>\n" +
"	  <li><a href=\"ecefaculty.html\">Faculty</a></li>\n" +
"	  <li><a href=\"eclab.html\">Laboratories</a></li>\n" +
"           <li><a href=\"cseachivement.html\">Achievement</a></li>\n" +
"        </ul>\n" +
"		<li><a ><img src =\"bulb.jpg\" width =\"20\" height =\"20\">Electrical Engineering</a>\n" +
"	  <ul>\n" +
"	  <li><a href=\"ee.html\">Introduction</a></li>\n" +
"	  <li><a href=\"eefaculty.html\">Faculty</a></li>\n" +
"	  <li><a href=\"eelab.html\">Laboratories</a></li>\n" +
"          <li><a href=\"cseachivement.html\">Achievement</a></li>\n" +
"	  </ul>\n" +
"	  <li><a ><img src =\"ci.png\" width =\"20\" height =\"20\">Civil Engineering</a>\n" +
"	  <ul>\n" +
"	  <li><a href=\"ce.html\">Introduction</a></li>\n" +
"	  <li><a href=\"cefaculty.html\">Faculty</a></li>\n" +
"	  <li><a href=\"celab.html\">Laboratories</a></li>\n" +
"          <li><a href=\"achivement.html\">Achievement</a></li>\n" +
"	  </ul>\n" +
"              <li><a><img src =\"hu.png\" width =\"20\" height =\"20\">Humanities</a>\n" +
"	  <ul>\n" +
"	  <li><a href=\"hns.html\">Introduction</a></li>\n" +
"	  <li><a href=\"humanitiesfaculty.html\">Faculty</a></li>\n" +
"	  <li><a href=\"hnslab.html\">Laboratories</a></li>\n" +
"           <li><a href=\"achivement.html\">Achievement</a></li>\n" +
"	  </ul>\n" +
"      </li>\n" +
"    </ul>\n" +
"  </li>\n" +
"  <li><a>Admission</a>\n" +
"   <ul>\n" +
"       <li><a href=\"admspcrd.html\">Admission Details</a></li>\n" +
"   <li><a href=\"fee.html\">Course Fee</a></li>\n" +
"   <li><a href=\"scho.html\">Scholarship</a></li></ul></li>\n" +
"  <li><a >Library</a>\n" +
"      <ul>\n" +
"      <li><a href=\"#\">Rules & Regulations</a></li>\n" +
"       <li><a href=\"libraryteam.html\">Library Team</a></li>\n" +
"        <li><a href=\"libraryresourse.html\">Library Resources</a></li>\n" +
"  </ul>\n" +
"  </li>\n" +
"  \n" +
"  <li><a href=\"#\">Facilities</a>\n" +
"       <ul>\n" +
"      <li><a href=\"hostels.html\">Hostel Facility</a></li>\n" +
"       <li><a href=\"rag.html\">Anti-Ragging</a></li>\n" +
"        <li><a href=\"fac.html\">Other Facilities</a></li>\n" +
"  </ul>\n" +
"  </li>\n" +
"  <li><a href=\"#\">Placement</a>\n" +
"      <ul>\n" +
"      <li><a href=\"#\">Placement Team</a></li>\n" +
"       <li><a href=\"#\">Eminent Recruiters</a></li>\n" +
"  </ul>\n" +
"  </li>\n" +
"   <li><a>Attendance</a>\n" +
"   <ul>\n" +
"       <li><a href=\"atdncsrch.html\">View Attendance</a></li></ul></li>\n" +
"  <li><a href=\"#\">Events</a>\n" +
"      <ul>\n" +
"      <li><a href=\"#\">Gallery</a></li>\n" +
"       <li><a href=\"#\">Annual Sports</a></li>\n" +
"        <li><a href=\"#\">Educational Events</a></li>\n" +
"  </ul>\n" +
"  </li>\n" +
"  <li><a href=\"#\">Contact us</a>\n" +
"      <ul>\n" +
"      <li><a href=\"contactus.html\"> College Address</a></li>\n" +
"       <li><a href=\"#\">College Location</a></li>\n" +
"  </ul>\n" +
"  </li>\n" +
"  <li><a href=\"#\">About us</a>\n" +
"  <ul>\n" +
"       <li><a href=\"about.html\">Our mission & Vision</a></li>\n" +
"      <li><a href=\"chairman.html\">From the Chairman's Desk</a></li>\n" +
"       <li><a href=\"principal.html\">From the Principal's Desk</a></li>\n" +
"        <li><a href=\"#\">From the Director's Desk</a></li>\n" +
"        <li><a href=\"#\">The Management Team</a></li>\n" +
"  </ul>\n" +
"  </li>\n" +
"  <li><a href=\"admin1.html\">Admin</a></li>\n" +
"</ul>\n" +
 "                  <h2>Note:-</h2>\n" +
	  

"<p style=\"text-align: justify;\"><span style=\"font-weight: 400;\">According to the norms of Our College, the students has to maintain atleast 75% attendance in every semester in order to avoid fine.</span></p>\n" +
"<p style=\"text-align: justify;\"><span style=\"font-weight: 400;\">From the given attendance sheet, you can check your attendance through out the semester so that you can maintain your number of classes you attended. This sheet help you distinguish between the regular and irregular students.</span></p>\n" +
"<p style=\"text-align: justify;\"><span style=\"font-weight: 400;\">The best part about the attendance sheet for the students is that if they maintain above 90% attendance through out the semester they get reward for this which influence the students to attend more and more classes. </span></p>\n" +
"  <h2>Top 10 regular students</h2>\n" +
"<table style=\"width:100%\">\n" +

"    <tr>\n" +
"        <th>First name</th>\n" +
"        <th>Middle name</th>\n" +
"        <th>Last name</th>\n" +
"        <th>Roll no.</th>\n" +
"        <th>Last update</th>\n" +
"        <th>Gender</th>\n" +
"         <th>year</th>\n" +
"          <th>Department</th>\n" +
"          <th>Your Attendance</th>\n" +
"           <th>Total Attendance</th>\n" +
"            <th>Email</th>\n" +
         
"    </tr>\n" +
"    <tr>\n" +
"        <td>Lovey</td>\n" +
"        <td>_</td>\n" +
"        <td>Kant</td>\n" +
"        <td>20</td>\n" +
"        <td>26/may/2016</td>\n" +
"        <td>Female</td>\n" +
"         <td>4th year</td>\n" +
"          <td>CSE</td>\n" +
"           <td>50</td>\n" +
"            <td>50</td>\n" +
"             <td>lovely.cse.imps@gmail.com</td>\n" +
"    </tr></body>\n" +
"</table>\n" +
             "                  <h2>Your Result:-</h2>\n" +
  
        "</body>\n" +
           
"</html>");
  
        
   ResultSet x=stmt.executeQuery(q1);
   
        while(x.next())
    {
        
          pw1.println("<html>\n" +
"<body>\n" +
"    <form method=\"post\" >\n" +
"                 \n" +
               " &nbsp;\n" +  
                   " &nbsp;\n" +  
                   " &nbsp;\n" +  
                   " &nbsp;\n" +  
"        <table style=\"width:100%\">\n" +

"            <tr>\n" +
 "              <td>"+x.getString(1)+"</td>\n" +
                  "              <td>"+x.getString(2)+"</td>\n" +
                  "              <td>"+x.getString(3)+"</td>\n" +
                   "              <td>"+x.getString(4)+"</td>\n" +
                  "              <td>"+x.getString(5)+"</td>\n" +
                   "              <td>"+x.getString(6)+"</td>\n" +
                   "              <td>"+x.getString(7)+"</td>\n" +
                   "              <td>"+x.getString(8)+"</td>\n" +
                   "              <td>"+x.getString(9)+"</td>\n" +
                    "              <td>"+x.getString(10)+"</td>\n" +
                    "              <td>"+x.getString(11)+"</td>\n" +
                  
               
"                \n" +
"                \n" +
"            </tr>\n" +
"        </table>\n" +
"    </form>    \n" +
                   "         <br><br><br><br><br><br>\n" +
"</body>  \n" +
"</html>");
          
    }
   
   
    
    con.close();
     } 
    catch(Exception e)
    {
        pw1.println(e);
    }
    }
}