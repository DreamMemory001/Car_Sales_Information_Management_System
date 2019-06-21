package servlet;

import bean.Root;
import daoImpl.RootDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet_Root_Insert", urlPatterns = "/Servlet_Root_Insert")
public class Servlet_Root_Insert extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Root root  = new Root();
        RootDao insert = new RootDao();
        root.setUsername(request.getParameter("username"));
        root.setPassword(request.getParameter("password"));
        int rs = insert.insertOne(root);
        if (rs != 0){
          response.sendRedirect("Login.jsp");
        }else {
            request.getRequestDispatcher("Login.jsp").forward(request,response);
        }
//        PrintWriter out = response.getWriter();
//        out.println("1111111111111111");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           doPost(request,response);

    }
}
