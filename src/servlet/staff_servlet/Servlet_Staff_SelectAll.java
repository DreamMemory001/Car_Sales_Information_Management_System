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
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Servlet_Staff_SelectAll", urlPatterns = "/Servlet_Staff_SelectAll")
public class Servlet_Staff_SelectAll extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        StaffDao selectAll = new StaffDao();
        List<Staff> list = new ArrayList<>();
        list = selectAll.selectAll();
        request.setAttribute("list", list);
        if (list != null){
            request.getRequestDispatcher("Staff_SelectAll.jsp").forward(request,response);
        }
    }
}
