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
        int currPage = 1;
        if (request.getParameter("page") != null){
            currPage = Integer.parseInt(request.getParameter("page"));
        }


        StaffDao selectAll = new StaffDao();
        List<Staff> list = new ArrayList<>();
        list = selectAll.selectAll(currPage);
        request.setAttribute("list", list);
        int pages;
        int count = selectAll.CoutPage();
        if(count % Staff.PAGE_SIZE == 0){
            pages = count / Staff.PAGE_SIZE;
        }else {
            pages = count / Staff.PAGE_SIZE + 1;
        }

        StringBuffer sb = new StringBuffer();
        for(int i = 1 ; i <= pages ; i++){
            if (i == currPage ){
                sb.append("["+i+"]");
            }else{
                sb.append("<a href= 'Servlet_Staff_SelectAll?page="+i+"'>" + i + "</a>");
            }
            sb.append(" ");
        }
        request.setAttribute("bar", sb.toString());


        if (list != null){
            request.getRequestDispatcher("Staff_SelectAll.jsp").forward(request,response);
        }
    }
}
