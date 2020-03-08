package example.Myservlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        asyncSupported = true,
        description = "Mój serwlecik",
        urlPatterns = {"/Servlet"}
)

public class Servlet extends javax.servlet.http.HttpServlet {

    private static final long serialVersionUID = 1L;

protected void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    doGet(request, response);
}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {


    Double value1 = Double.valueOf(request.getParameter("value1"));
        Double value2 = Double.valueOf(request.getParameter("value2"));
        String operation = request.getParameter("operation");
        Double result = count(value1, value2, operation);
               request.setAttribute("result", result);
        RequestDispatcher requestDispatcher= request.getRequestDispatcher("Result.jsp");
        requestDispatcher.forward(request, response);
    }

    private Double count(Double value1, Double value2, String operation) {
        switch (operation) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            case "*":
                return value1 * value2;
            case "/":
                return value1 / value2;
            default:
                return value1 + value2;
        }
    }

}
