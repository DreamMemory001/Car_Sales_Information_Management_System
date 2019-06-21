package servlet.staff_servlet;

import bean.Sale;
import bean.Staff;
import daoImpl.SaleDao;
import daoImpl.StaffDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_Staff_DeleteOne", urlPatterns = "/Servlet_Staff_DeleteOne")
public class Servlet_Staff_DeleteOne extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Staff staff = new Staff();
        StaffDao delete = new StaffDao();
        String id  = request.getParameter("id");
        staff.setSta_id(id);
        int rs = delete.deleteOne(staff);
        request.setAttribute("id", id);
        if (rs != 0){
            request.getRequestDispatcher("delete_staff_succeed.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doPost(request,response);
    }
}
