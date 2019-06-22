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

@WebServlet(name = "Servlet_Car_Contain", urlPatterns = "/Servlet_Car_Contain")
public class Servlet_Car_Contain extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doGet(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        String row = request.getParameter("row");
        String ser = request.getParameter("ser");
        List<Car> list1 = new ArrayList<>();
        CarDao contain = new CarDao();
        if(row.equals("汽车类型")){
            list1 = contain.contain(ser);
        }else if(row.equals("汽车品牌")){
            list1 = contain.contain2(ser);
        }
        request.setAttribute("list1", list1);
       if (list1 == null){
           System.out.println(88888);
       }else {
           request.getRequestDispatcher("Car_Contain.jsp").forward(request,response);
           System.out.println(520);
           System.out.println(list1.size());
       }


    }
}
