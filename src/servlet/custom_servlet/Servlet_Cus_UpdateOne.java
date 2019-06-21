package servlet.custom_servlet;

import bean.Custom;
import daoImpl.CustomDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_Cus_UpdateOne", urlPatterns = "/Servlet_Cus_UpdateOne")
public class Servlet_Cus_UpdateOne extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Custom custom = new Custom();
        CustomDao update = new CustomDao();
        custom.setCus_id(request.getParameter("cusid"));
        custom.setCus_name(request.getParameter("cusname"));
        custom.setCus_sex(request.getParameter("cussex"));
        custom.setCus_type(request.getParameter("custype"));
        custom.setCus_phoneNumber(request.getParameter("cusphonum"));
        int rs = update.updateOne(custom);
        if (rs != 0){
            request.getRequestDispatcher("Cus_Do_Update.jsp").forward(request,response);
        }else {
            System.out.println("失败");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
