package servlet.custom_servlet;

import bean.Custom;
import daoImpl.CustomDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_Cus_SelectOne", urlPatterns = "/Servlet_Cus_SelectOne")
public class Servlet_Cus_SelectOne extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        Custom custom = new Custom();
        custom.setCus_id(request.getParameter("id"));
        CustomDao selectOne = new CustomDao();
        Custom custom1 = selectOne.selectOne(custom);
        request.setAttribute("custom1", custom1);
        request.getRequestDispatcher("Cus_Update.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request,response);
    }
}
