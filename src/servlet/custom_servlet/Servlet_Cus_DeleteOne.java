package servlet.custom_servlet;

import bean.Custom;
import daoImpl.CustomDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_Cus_DeleteOne", urlPatterns = "/Servlet_Cus_DeleteOne")
public class Servlet_Cus_DeleteOne extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Custom custom = new Custom();
        CustomDao delete = new CustomDao();
        String id = request.getParameter("id");
        custom.setCus_id(id);
        int rs  = delete.deleteOne(custom);
        request.setAttribute("id", id);
        if (rs != 0){
            request.getRequestDispatcher("delete_cus_succeed.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           doPost(request,response);
    }
}
