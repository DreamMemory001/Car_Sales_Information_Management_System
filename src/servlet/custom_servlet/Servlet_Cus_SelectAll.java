package servlet.custom_servlet;

import bean.Custom;
import daoImpl.CustomDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Servlet_Cus_SelectAll", urlPatterns = "/Servlet_Cus_SelectAll")
public class Servlet_Cus_SelectAll extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           doGet(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          request.setCharacterEncoding("UTF-8");
          response.setCharacterEncoding("UTF-8");
          CustomDao  selectAll  = new CustomDao();
          List<Custom> list = selectAll.selectAll();
          request.setAttribute("list", list);
        if (list != null){
              request.getRequestDispatcher("Cus_SelectAll.jsp").forward(request,response);
          }
    }
}
