package upgrad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/helloworld")
public class HelloWorldServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter printWriter = response.getWriter();
        printWriter.write("<!Doctype html>");
        printWriter.write("<html>");
        printWriter.write("<head>");
        printWriter.write("<title>Hello World Servlet!</title>");
        printWriter.write("</head>");
        printWriter.write("<body>");
        printWriter.write("<p>Hello World!!</p>");
        printWriter.write("</body>");
        printWriter.write("</html>");

        printWriter.close();
    }

}