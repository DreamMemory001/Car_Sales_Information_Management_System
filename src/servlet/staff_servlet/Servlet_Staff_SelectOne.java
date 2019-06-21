package servlet.staff_servlet;

import bean.Car;
import bean.Staff;
import daoImpl.CarDao;
import daoImpl.StaffDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_Staff_SelectOne", urlPatterns = "/Servlet_Staff_SelectOne")
public class Servlet_Staff_SelectOne extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        Staff staff = new Staff();
        staff.setSta_id(request.getParameter("id"));
        StaffDao selectOne = new StaffDao();
        Staff staff1 =selectOne.selectOne(staff);
        request.setAttribute("staff1", staff1);
        request.getRequestDispatcher("Staff_Update.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
