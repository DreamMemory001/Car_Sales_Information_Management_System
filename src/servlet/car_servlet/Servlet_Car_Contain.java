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

        if(row.equals("汽车类型")){
            row = "cartype";
        }else if(row.equals("汽车品牌")){
            row = "carbrand";

        }
        System.out.println(row);
        System.out.println(ser);
        CarDao search = new CarDao();
        List<Car> list1 = new ArrayList<>();
        list1 = search.contain(ser,row);
       if (list1 == null){
           System.out.println(88888);
       }else {
           System.out.println(520);
       }
        request.setAttribute("list1", list1);
        request.getRequestDispatcher("Car_Contain.jsp").forward(request,response);
    }
}
