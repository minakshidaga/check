/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class fpt extends HttpServlet
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
            String q1="select * from reg1 where ans1='"+ans+"'";
       pw1.println(q1);
        ResultSet x=stmt.executeQuery(q1);
        if(x.next())
    {
          pw1.println("<!DOCTYPE html>\n" +
"<html>\n" +
"\n" +
"<head>\n" +
"  <title>Our College Website</title>\n" +
"  <style>body {\n" +
"    font-family: \"Trebuchet MS\", Verdana, sans-serif;\n" +
"    font-size: 16px;\n" +
"    background-color: goldenrod;\n" +
"    color: #696969;\n" +
"    padding: 3px;\n" +
"}\n" +
"\n" +
"#main {\n" +
"    padding: 5px;\n" +
"    padding-left:  15px;\n" +
"    padding-right: 15px;\n" +
"    background-color: #ffffff;\n" +
"    border-radius: 0 0 5px 5px;\n" +
"}\n" +
"\n" +
"h1 {\n" +
"    font-family: Georgia, serif;\n" +
"    border-bottom: 3px solid #cc9900;\n" +
"    color: #996600;\n" +
"    font-size: 30px;\n" +
"}\n" +
"table {\n" +
"    width:100%;\n" +
"}\n" +
"\n" +
"table, th , td {\n" +
"    border: 1px solid grey;\n" +
"    border-collapse: collapse;\n" +
"    padding: 5px;\n" +
"}\n" +
"\n" +
"th {\n" +
"    text-align: left;\n" +
"}\n" +
"\n" +
"table tr:nth-child(odd) {\n" +
"    background-color: #f1f1f1;\n" +
"}\n" +
"table tr:nth-child(even) {\n" +
"    background-color: #ffffff;\n" +
"} \n" +
"\n" +
"form {\n" +
"              width:50%\n" +
"}\n" +
".search {\n" +
"                padding:8px 15px;\n" +
"                background:rgba(50, 50, 50, 0.2);\n" +
"                border:0px solid #dbdbdb;\n" +
"}\n" +
".button {\n" +
"                position:relative;\n" +
"                padding:6px 15px;\n" +
"                left:-8px;\n" +
"                border:2px solid #207cca;\n" +
"                background-color:#207cca;\n" +
"                color:#fafafa;\n" +
"}\n" +
".button:hover  {\n" +
"                background-color:#fafafa;\n" +
"                color:#207cca;\n" +
"}\n" +
"li {\n" +
"  color: red; /* bullet color */\n" +
"}\n" +
"li span {\n" +
"  color: black; /* text color */\n" +
"}\n" +
"ul {\n" +
"    list-style-type: none;\n" +
"    margin: 0;\n" +
"    padding: 0;\n" +
"    overflow: hidden;\n" +
"    background-color: wheat;\n" +
"}\n" +
"\n" +
"li {\n" +
"    float: left;\n" +
"}\n" +
"\n" +
"li a, .dropbtn {\n" +
"    display: inline-block;\n" +
"    color: black;\n" +
"    text-align: center;\n" +
"    padding: 14px 16px;\n" +
"    text-decoration: none;\n" +
"}\n" +
"\n" +
"li a:hover, .dropdown:hover .dropbtn {\n" +
"    background-color: cyan;\n" +
"}\n" +
"\n" +
"li.dropdown {\n" +
"    display: inline-block;\n" +
"}\n" +
"\n" +
".dropdown-content {\n" +
"    display: none;\n" +
"    position: absolute;\n" +
"    background-color: wheat;\n" +
"    min-width: 160px;\n" +
"    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n" +
"}\n" +
"\n" +
".dropdown-content a {\n" +
"    color: black;\n" +
"    padding: 12px 16px;\n" +
"    text-decoration: none;\n" +
"    display: block;\n" +
"    text-align: left;\n" +
"}\n" +
"\n" +
".dropdown-content a:hover {background-color:cyan}\n" +
"\n" +
".dropdown:hover .dropdown-content {\n" +
"    display: block;\n" +
"}</style>\n" +
"</head>\n" +
"\n" +
"<body background=\"2.jpg\">\n" +
"\n" +
"  <div id=\"main\">\n" +
"  <table>\n" +
"<tr>\n" +
"    <td><marquee bgcolor=\"black\">\n" +
"            <font color=\"yellow\" font size=\"14\" style=\"font-family:Brush Script Std;\">Welcome to College Website <img src=\"r.jpg\" width=\"30\" height=\"30\"></font></marquee></td>\n" +
"</tr>\n" +
"</table>\n" +
"\n" +
"      \n" +
"      <table>\n" +
"          <tr>\n" +
"              <td>\n" +
"                  <ul>\n" +
"  <li><a class=\"active\" href=\"home.html\">Home</a></li>\n" +
"  \n" +
"  <li class=\"dropdown\">\n" +
"    <a class=\"dropbtn\">Department</a>\n" +
"    <div class=\"dropdown-content\">\n" +
"      <a href=\"cse.html\">CSE</a>\n" +
"      <a href=\"ece.html\">ECE</a>\n" +
"      <a href=\"ce.html\">CE</a>\n" +
"    </div>\n" +
"  </li>\n" +
"  <li><a class=\"active\" href=\"Attendance.html\">Attendance</a></li>\n" +
"   <li><a class=\"active\" href=\"Library.html\">Library</a></li>\n" +
"  \n" +
"  <li><a class=\"active\" href=\"faculty.html\">Faculty</a></li>\n" +
"  <li><a class=\"active\" href=\"admission.html\">Admission</a></li>\n" +
"   <li><a class=\"active\" href=\"login.html\">Login</a></li>\n" +
"    <li><a class=\"active\" href=\"reg.html\">Signup</a></li> \n" +
"    \n" +
"    \n" +
"    \n" +
"</ul>\n" +
"\n" +
"              </td>\n" +
"          </tr>\n" +
"      </table>\n" +
"      \n" +
"      \n" +
"\n" +
"\n" +
"<!2nd table starts>\n" +
"\n" +
"\n" +
"<form method =\"post\" action=\"fpr\">\n" +
"<table>\n" +
"    <tr>\n" +
                  "        <td><font color=\"brown\" font size=\"5\" style=font-family:Trebuchet MS >Reset your password</font></td>\n" +
"        <td><font color=\"brown\" font size=\"5\" style=font-family:Trebuchet MS >enter new password</font></td>\n" +
"        <td><input type=\"text\" name=\"fname2\">\n" +
"<td>\n" +
"    <table><tr><td><center><input type=\"submit\" value=\"reset\"></center></td></tr></table>\n" +
"</td>\n" +
"</tr>\n" +
"</table>\n" +
"</form>\n" +
"\n" +
"<center><table>\n" +
"<tr>\n" +
"<td>\n" +
"<a href=\"home.html\"><center>Home</center></a>\n" +
"</td>\n" +
"<td>\n" +
"<a href=\"about.html\"><center>About us</center>\n" +
"</a></td>\n" +
"<td>\n" +
"<a href=\"contact.html\"><Center>Contact us</center></a>\n" +
"</td>\n" +
"</table>\n" +
"</center>\n" +
" \n" +
"  </div>\n" +
"\n" +
"</body>\n" +
"</html> ");
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