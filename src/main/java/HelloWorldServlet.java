import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

    @WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")
public class HelloWorldServlet extends HttpServlet {


        @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//        ServletResponse response = null;
//            assert false;
            res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Hello, World!</h1>");
    }
}
