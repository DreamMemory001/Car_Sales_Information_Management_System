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
        int currPage = 1;
        if (request.getParameter("page") != null){
            currPage = Integer.parseInt(request.getParameter("page"));
        }

        CarDao select = new CarDao();
        List<Car> list = new ArrayList<>();
        list = select.selectALL(currPage);
        request.setAttribute("list", list);

        int pages;
        int count = select.CoutPage();
        if(count % Car.PAGE_SIZE == 0){
            pages = count / Car.PAGE_SIZE;
        }else {
            pages = count / Car.PAGE_SIZE + 1;
        }

        StringBuffer sb = new StringBuffer();
        for(int i = 1 ; i <= pages ; i++){
            if (i == currPage ){
                sb.append("["+i+"]");
            }else{
                sb.append("<a href= 'Servlet_Car_SelectAll?page="+i+"'>" + i + "</a>");
            }
            sb.append(" ");
        }
        request.setAttribute("bar", sb.toString());
        request.getRequestDispatcher("Car_Select.jsp").forward(request,response);


    }
}
