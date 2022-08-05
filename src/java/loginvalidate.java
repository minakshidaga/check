import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.sql.*;
public class loginvalidate extends HttpServlet 
{
    public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
  {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String uid=req.getParameter("fname1");
         String pass=req.getParameter("fname2");
         HttpSession ses=req.getSession();
         ses.setAttribute("uid1",uid);
        
         try
         {
            
              if ((uid.equals("admin@l.com"))&& (pass.equals("l")))
         {
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
"  <li><a href=\"admin1.html\">Home</a></li>\n" +
 
  
"   <li><a>Attendance</a>\n" +
 "  <ul>\n" +
 "     <li><a href=\"addattendance.html\">Add Attendance</a></li>\n" +
 "       <li><a href=\"modattendance.html\">Edit Attendance</a></li>\n" +
 "        <li><a href=\"delattendance.html\">Delete Attendance</a></li>\n" +
 "  </ul></li>\n" +
 
 " <li><a href=\"queryr.html\">View Query</a></li>\n" +
 " <li><a href=\"fdbckr.html\">View Feedback</a></li>\n" +
"</ul>\n" +
" \n" +
"  </div>\n" +
"\n" +
"</body>\n" +
"</html> ");
         }
             else
             {
                 pw1.println("login failed !!!");
                 
             }
             
             
             
         }
         catch(Exception e)
         {
             pw1.println(e);
         }
  }
}
