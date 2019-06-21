package servlet.car_servlet;

import bean.Car;
import daoImpl.CarDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_Car_SelectOne", urlPatterns = "/Servlet_Car_SelectOne")
public class Servlet_Car_SelectOne extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        Car car = new Car();
        car.setCar_id(request.getParameter("id"));
        Car car1 = new Car();
        CarDao selectone = new CarDao();
        car1 = selectone.selectOne(car);
        request.setAttribute("car1", car1);
        request.getRequestDispatcher("Car_Update.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
