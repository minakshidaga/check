/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class modattendance extends HttpServlet
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
         String q1="select * from atdnc where rno='"+rno+"'";
        ResultSet x=stmt.executeQuery(q1);
        if(x.next())
    {
       
        /*String lupdt=x.getString(5);
        String dat=lupdt.substring(0,2);
        String mon=lupdt.substring(3,6);
        String yr=lupdt.substring(7,11);*/
        pw1.println("hllo running");
        pw1.println("<html>\n" +
"    <head>\n" +
"    <title>Modify</title>\n" +
"       <link href=\"site.css\" rel=\"stylesheet\">\n" +
"       <script>\n" +
"       function ValidateEmail()  \n" +
"{  \n" +
"var x = document.forms[\"myForm\"][\"fname13\"].value;\n" +
"var mailformat = /^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$/;  \n" +
"if(x.match(mailformat))  \n" +
"{  \n" +
" \n" +
"return true;  \n" +
"}  \n" +
"else  \n" +
"{  \n" +
"alert(\"You have entered an invalid email address!\"); \n" +
"return false;  \n" +
"}  \n" +
"}  \n" +
"\n" +
"function resetting()\n" +
"{\n" +
"  alert(\"Refreshing every field\");\n" +
"}\n" +
"\n" +
"\n" +
"</script>\n" +
"\n" +
"\n" +
"</head>\n" +
"\n" +
"    <body>\n" +
                  
"        <form name=\"myForm\" action=\"updtattendance\" onsubmit=\"return validateForm()\" \n" +
"method=\"post\" onreset=\"resetting()\">\n" +
"       \n" +
"           <center><table>\n" +
"              \n" +
"            <tr>\n" +
"                <td>Name</td>\n" +
"               <td><input type=\"text\" name=\"fname1\" value="+x.getString(1)+"></td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td>Middle Name </td>\n" +
"               <td><input type=\"text\" name=\"fname2\" value="+x.getString(2)+"></td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td>Last Name </td>\n" +
"               <td><input type=\"text\" name=\"fname3\" value="+x.getString(3)+"></td>\n" +
"            </tr>\n" +
"             <tr>\n" +
"            <td>Roll no.</td>\n" +
"               <td><input type=\"text\" min=\"0\" name=\"fname4\" value="+x.getString(4)+"></td>\n" +
"               </tr>\n" +
"            <tr>\n" +
"            <td>LastUpdate</td>\n" +
"            <td>\n" +
"                    <select name=\"fname5\">\n" +
"    <option value="+dat+">"+dat+"</option>\n" +
"    <option value=\"1\">01</option>\n" +
"    <option value=\"2\">02</option>\n" +
"    <option value=\"3\">03</option>\n" +
"    <option value=\"4\">04</option>\n" +
"    <option value=\"5\">05</option>\n" +
"    <option value=\"6\">06</option>\n" +
"    <option value=\"7\">07</option>\n" +
"    <option value=\"8\">08</option>\n" +
"    <option value=\"9\">09</option>\n" +
"    <option value=\"10\">10</option>\n" +
"    <option value=\"11\">11</option>\n" +
"    <option value=\"12\">12</option>\n" +
"    <option value=\"13\">13</option>\n" +
"    <option value=\"14\">14</option>\n" +
"    <option value=\"15\">15</option>\n" +
"    <option value=\"16\">16</option>\n" +
"    <option value=\"17\">17</option>\n" +
"    <option value=\"18\">18</option>\n" +
"    <option value=\"19\">19</option>\n" +
"    <option value=\"20\">20</option>\n" +
"    <option value=\"21\">21</option>\n" +
"    <option value=\"22\">22</option>\n" +
"    <option value=\"23\">23</option>\n" +
"    <option value=\"24\">24</option>\n" +
"    <option value=\"25\">25</option>\n" +
"    <option value=\"26\">26</option>\n" +
"    <option value=\"27\">27</option>\n" +
"    <option value=\"28\">28</option>\n" +
"    <option value=\"29\">29</option>\n" +
"    <option value=\"30\">30</option>\n" +
"   <option value=\"31\">31</option>\n" +
"   </select>\n" +
"<select name=\"fname6\">\n" +
"    <option value="+mon+">"+mon+"</option>\n" +
"    <option value=\"Jan\">January</option>\n" +
"    <option value=\"Feb\">February</option>\n" +
"    <option value=\"Mar\">March</option>\n" +
"    <option value=\"Apr\">April</option>\n" +
"    <option value=\"May\">May</option>\n" +
"    <option value=\"Jun\">June</option>\n" +
"    <option value=\"Jul\">July</option>\n" +
"    <option value=\"Aug\">August</option>\n" +
"    <option value=\"Sep\">September</option>\n" +
"    <option value=\"Oct\">October</option>\n" +
"    <option value=\"Nov\">November</option>\n" +
"    <option value=\"Dec\">December</option>\n" +
"\n" +
"</select>\n" +
"<select name=\"fname7\">\n"+
"<option value="+yr+">"+yr+"</option>\n" +
"<option value=\"2016\">2016</option>\n" +
"</select></td>\n" +
"            </tr>\n" +
"            \n" +
"             <tr>\n" +
"                <td>Gender</td>\n" +
"               <td>\n" +
"                <select name=\"select\">\n" +
"    <option value="+x.getString(6)+">"+x.getString(6)+"</option>\n" +
"    <option value=\"Male\">Male</option>\n" +
"    <option value=\"Female\">Female</option>\n" +
"    <option value=\"Other\">Other</option>\n" +
"               </select>\n" +
"  </td>\n" +
"            </tr>\n" +
"             <tr>\n" +
"                <td>Year</td>\n" +
"               <td><input type=\"text\" name=\"fname9\" value="+x.getString(7)+"></td>\n" +
"               \n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td>Department</td>\n" +
"               <td><input type=\"text\" name=\"fname10\" value="+x.getString(8)+"></td>\n" +
"               \n" +
"            </tr>\n" +
"            <tr>\n" +
"            <td>Attendance</td>\n" +
"               <td><input type=\"number\" min=\"0\" name=\"fname11\" value="+x.getString(9)+"></td>\n" +
"               </tr>\n" +
"                <tr>\n" +
"            <td>Total Atendance</td>\n" +
"               <td><input type=\"number\" min=\"0\" name=\"fname12\" value="+x.getString(10)+"></td>\n" +
"               </tr>\n" +
"               \n" +
"               <tr> \n" +
"         <td>Email</td>\n" +
"               <td><input type=\"text\" name=\"fname13\" value="+x.getString(11)+" onblur=\"ValidateEmail()\"></td>\n" +
"               </tr>\n" +
"               <tr>\n" +
"                   <td><input type=\"submit\" value=\"Submit\"></td>\n" +
"               <td><input type=\"reset\" value=\"Reset\"></td>\n" +
"               </tr>\n" +
"               \n" +
"               \n" +
"            \n" +
"    \n" +
"        \n" +
"</table>        </form>\n" +
"</center>\n" +
"    </body>\n" +
"</html>");
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
