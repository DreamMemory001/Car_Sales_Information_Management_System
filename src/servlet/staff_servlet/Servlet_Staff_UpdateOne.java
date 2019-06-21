package servlet.staff_servlet;

import bean.Staff;
import daoImpl.StaffDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_Staff_UpdateOne", urlPatterns = "/Servlet_Staff_UpdateOne")
public class Servlet_Staff_UpdateOne extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          request.setCharacterEncoding("UTF-8");
          response.setCharacterEncoding("UTF-8");
          Staff staff = new Staff();
          StaffDao  update = new StaffDao();
          staff.setSta_id(request.getParameter("staid"));
          staff.setSta_name(request.getParameter("staname"));
          staff.setSta_sex(request.getParameter("stasex"));
          staff.setSta_adress(request.getParameter("staadress"));
          staff.setSta_phoneNumber(request.getParameter("staphonum"));
          int rs = update.updateOne(staff);
          if (rs != 0){
              request.getRequestDispatcher("Staff_Do_Update.jsp").forward(request,response);
          }else {
              System.out.println("s失败");
          }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
