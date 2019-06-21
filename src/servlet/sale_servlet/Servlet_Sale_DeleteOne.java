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

@WebServlet(name = "Servlet_Sale_DeleteOne", urlPatterns = "/Servlet_Sale_DeleteOne")
public class Servlet_Sale_DeleteOne extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Sale sale = new Sale();
        SaleDao delete = new SaleDao();
        String id  = request.getParameter("id");
        sale.setSale_no(id);
        int rs = delete.deleteOne(sale);
        request.setAttribute("id", id);
        if (rs != 0){
            request.getRequestDispatcher("delete_sale_succeed.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
    }
}
