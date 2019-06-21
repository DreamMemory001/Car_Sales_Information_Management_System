package servlet.car_servlet;

import bean.Car;
import daoImpl.CarDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_Buy_Select", urlPatterns = "/Servlet_Buy_Select")
public class Servlet_Buy_Select extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        Car car = new Car();
        car.setCar_id(request.getParameter("id"));
        Car car2 = new Car();
        CarDao selectone = new CarDao();
        car2 = selectone.selectOne(car);
        request.setAttribute("car2", car2);
        request.getRequestDispatcher("Car_Buy.jsp").forward(request,response);
    }
}
