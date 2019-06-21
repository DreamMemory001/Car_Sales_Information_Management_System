package servlet;

import bean.Root;
import daoImpl.RootDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_Root_Find", urlPatterns = "/Servlet_Root_Find")
public class Servlet_Root_Find extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Root root = new Root();
        RootDao find = new RootDao();
        root.setUsername(request.getParameter("username"));
        root.setPassword(request.getParameter("password"));
        boolean is = find.selectOne(root);
        if(is){
            response.sendRedirect("Fuction.jsp");
        }else{
            request.setAttribute("error","1");
            request.getRequestDispatcher("Login.jsp").forward(request,response);
        }
    }
}
