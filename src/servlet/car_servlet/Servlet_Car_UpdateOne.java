package servlet.car_servlet;

import bean.Car;
import daoImpl.CarDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_Car_UpdateOne", urlPatterns = "/Servlet_Car_UpdateOne")
public class Servlet_Car_UpdateOne extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        Car car = new Car();
        CarDao update = new CarDao();
        car.setCar_id(request.getParameter("carid"));
        car.setCar_name(request.getParameter("carname"));
        car.setCar_brand(request.getParameter("carbrand"));
        car.setCar_type(request.getParameter("cartype"));
        car.setCar_price(Float.parseFloat(request.getParameter("carprice")));
        int rs = update.updateCar(car);
        if (rs != 0){
            request.getRequestDispatcher("Car_Do_Update.jsp").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
    }
}
