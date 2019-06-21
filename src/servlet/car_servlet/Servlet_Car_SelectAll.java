package servlet.car_servlet;

import bean.Car;
import daoImpl.CarDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Servlet_Car_SelectAll", urlPatterns = "/Servlet_Car_SelectAll")
public class Servlet_Car_SelectAll extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");

        CarDao select = new CarDao();
        List<Car> list = new ArrayList<>();
        list = select.selectALL();
        request.setAttribute("list", list);
        request.getRequestDispatcher("Car_Select.jsp").forward(request,response);


    }
}
