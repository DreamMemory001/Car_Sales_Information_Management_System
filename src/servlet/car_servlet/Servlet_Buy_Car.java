package servlet.car_servlet;

import bean.Sale;
import com.sun.org.apache.regexp.internal.RE;
import daoImpl.CarDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_Buy_Car", urlPatterns = "/Servlet_Buy_Car")
public class Servlet_Buy_Car extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.setCharacterEncoding("UTF-8");
       request.setCharacterEncoding("UTF-8");
        Sale sale  = new Sale();
        CarDao buy = new CarDao();
        sale.setSale_no(request.getParameter("saleno"));
        sale.setCar_name(request.getParameter("carname"));
        sale.setSale_num(Integer.parseInt(request.getParameter("salenum")));
        int rs = buy.buycar(sale);
        if (rs != 0){
            request.getRequestDispatcher("Servlet_Sale_SelectAll").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     doPost(request,response);
    }
}
