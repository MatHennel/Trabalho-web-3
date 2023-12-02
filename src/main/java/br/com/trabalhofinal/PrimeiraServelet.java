package br.com.trabalhofinal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

@WebServlet("/segundaServelet")
public class PrimeiraServelet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer= resp.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1>Primeira página atraves da Servelet</h1>");
        writer.println("</body>");
        writer.println("</html>");


    }
}
