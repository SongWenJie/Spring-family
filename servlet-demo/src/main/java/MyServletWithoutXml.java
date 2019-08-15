import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/myServletWithoutXml")
public class MyServletWithoutXml extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("MyServlet 在处理 get（）请求...");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=utf-8");
        out.println("<strong>My Servlet Without Xml!</strong><br>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("MyServlet 在处理 post（）请求...");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=utf-8");
        out.println("<strong>My Servlet Without Xml!</strong><br>");
    }
}
