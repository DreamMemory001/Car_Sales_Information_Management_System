package servlet.car_servlet;

import bean.Car;
import daoImpl.CarDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_Car_Insert", urlPatterns = "/Servlet_Car_Insert")
public class Servlet_Car_Insert extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
//        String a = request.getParameter("carprice");
        String a = request.getParameter("carid");
        System.out.println(a);
        Car car = new Car();
        CarDao inset = new CarDao();
        car.setCar_id(request.getParameter("carid"));
        car.setCar_name(request.getParameter("carname"));
        car.setCar_brand(request.getParameter("carbrand"));
        car.setCar_type(request.getParameter("cartype"));
        car.setCar_price(Float.parseFloat(request.getParameter("carprice")));
        int rs = inset.insertCar(car);
        if (rs != 0){
            request.getRequestDispatcher("Car_Insert_Succeed.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
