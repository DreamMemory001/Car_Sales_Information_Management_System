package servlet.sale_servlet;

import bean.Sale;
import daoImpl.SaleDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_Sale_UpdateOne", urlPatterns = "/Servlet_Sale_UpdateOne")
public class Servlet_Sale_UpdateOne extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          request.setCharacterEncoding("UTF-8");
          response.setCharacterEncoding("UTF-8");
          Sale sale = new Sale();
          SaleDao udapte  = new SaleDao();
          sale.setSale_no(request.getParameter("saleno"));
          sale.setCar_name(request.getParameter("carname"));
          sale.setSale_num(Integer.parseInt(request.getParameter("salenum")));
          int rs = udapte.updateOne(sale);
          if (rs != 0){
              request.getRequestDispatcher("Sale_Do_Update.jsp").forward(request,response);
          }else {
              System.out.println(11111);
          }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     doPost(request,response);
    }
}
