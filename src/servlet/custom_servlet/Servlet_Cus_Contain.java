package servlet.custom_servlet;

import bean.Custom;
import daoImpl.CustomDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Servlet_Cus_Contain", urlPatterns = "/Servlet_Cus_Contain")
public class Servlet_Cus_Contain extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String row = request.getParameter("row");
        String ser = request.getParameter("ser");
        CustomDao contain = new CustomDao();
        List<Custom> list = new ArrayList<>();
        if (row.equals("客户姓名")){
            list = contain.contain(ser);
            System.out.println(5555);
        }else if(row.equals("客户手机")){
            list = contain.contain2(ser);
            System.out.println(6666);
        }

        request.setAttribute("list", list);
        if(list != null){
            System.out.println(list.size());
            System.out.println(2222);
            request.getRequestDispatcher("Cus_Contain.jsp").forward(request,response);
        }else {
            System.out.println(11111);
        }
    }

}
