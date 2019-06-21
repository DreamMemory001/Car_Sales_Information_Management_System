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

@WebServlet(name = "Servlet_Staff_Insert", urlPatterns = "/Servlet_Staff_Insert")
public class Servlet_Staff_Insert extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Staff staff = new Staff();
        StaffDao insert = new StaffDao();
        staff.setSta_id(request.getParameter("staid"));
        staff.setSta_name(request.getParameter("staname"));
        staff.setSta_sex(request.getParameter("stasex"));
        staff.setSta_adress(request.getParameter("staadress"));
        staff.setSta_phoneNumber(request.getParameter("staphonum"));
        int rs = insert.insertOne(staff);
        if (rs != 0){
            request.getRequestDispatcher("Staff_Insert_Succeed.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request,response);
    }
}
