package de.codeplumber.roman.web;

import de.codeplumber.roman.transform.Roman2Decimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet to handle roman numbers.
 *
 * @author tom
 */
@WebServlet(name = "romanServlet", urlPatterns = {"/roman"})
public class RomanServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String eingabe = request.getParameter("romanString");
        Roman2Decimal roman2Decimal = new Roman2Decimal();
        String ausgabe = "";
        try {
            int ausgabeNummer = roman2Decimal.transform(eingabe);
            ausgabe = String.valueOf(ausgabeNummer);
        } catch (Exception e) {
            ausgabe = e.getMessage();
        }

        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        PrintWriter out = response.getWriter();
        out.println("Hello Roman World Servlet");
        out.println("Eingabe : "  + eingabe);
        out.println("Ausgabe : " + ausgabe);
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doGet(request, response);
    }
}
