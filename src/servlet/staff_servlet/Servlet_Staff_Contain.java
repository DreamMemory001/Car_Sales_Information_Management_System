package servlet.staff_servlet;

import bean.Staff;
import daoImpl.StaffDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Servlet_Staff_Contain", urlPatterns = "/Servlet_Staff_Contain")
public class Servlet_Staff_Contain extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.setCharacterEncoding("UTF-8");
       response.setCharacterEncoding("UTF-8");
       String row = request.getParameter("row");
       String ser = request.getParameter("ser");

        StaffDao contain = new StaffDao();
        List<Staff> list2 = new ArrayList<>();
       if (row.equals("员工地址")){
            list2 = contain.contain(ser);
           System.out.println(5555);
       }else if(row.equals("员工电话")){
            list2 = contain.contain2(ser);
           System.out.println(6666);
       }



       request.setAttribute("list2", list2);
       if(list2 != null){
           System.out.println(list2.size());
           System.out.println(2222);
           request.getRequestDispatcher("Staff_Contain.jsp").forward(request,response);
       }else {
           System.out.println(11111);
       }
    }
}
