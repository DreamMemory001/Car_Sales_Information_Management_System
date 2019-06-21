package servlet.car_servlet;

import bean.Car;
import daoImpl.CarDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_Car_DeleteOne", urlPatterns = "/Servlet_Car_DeleteOne")
public class Servlet_Car_DeleteOne extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Car car = new Car();
        CarDao delete = new CarDao();
        String id  = request.getParameter("id");
        car.setCar_id(id);
        int rs = delete.deleteCar(car);
        request.setAttribute("id", id);
        if (rs != 0){
            request.getRequestDispatcher("delete_succeed.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           doPost(request,response);
    }
}
