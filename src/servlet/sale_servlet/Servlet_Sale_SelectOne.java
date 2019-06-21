package servlet.sale_servlet;

import bean.Car;
import bean.Sale;
import daoImpl.CarDao;
import daoImpl.SaleDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_Sale_SelectOne", urlPatterns = "/Servlet_Sale_SelectOne")
public class Servlet_Sale_SelectOne extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        Sale sale = new Sale();
        sale.setSale_no(request.getParameter("id"));
        SaleDao selectone = new SaleDao();
        Sale sale1 = selectone.selectOne(sale);
        request.setAttribute("sale1", sale1);
        request.getRequestDispatcher("Sale_Update.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
