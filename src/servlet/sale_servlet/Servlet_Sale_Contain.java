package servlet.sale_servlet;

import bean.Sale;
import daoImpl.SaleDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Servlet_Sale_Contain", urlPatterns = "/Servlet_Sale_Contain")
public class Servlet_Sale_Contain extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String row = request.getParameter("row");
        String ser = request.getParameter("ser");
        SaleDao  contain = new SaleDao();
        List<Sale> list = new ArrayList<>();
        if (row.equals("订单编号")){
            list = contain.conatin(ser);
            System.out.println(5555);
        }

        request.setAttribute("list", list);
        if(list != null){
            System.out.println(list.size());
            System.out.println(2222);
            request.getRequestDispatcher("Sale_Contain.jsp").forward(request,response);
        }else {
            System.out.println(11111);
        }
    }
}
