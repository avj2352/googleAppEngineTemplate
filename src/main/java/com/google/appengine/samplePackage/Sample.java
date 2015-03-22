package com.google.appengine.samplePackage;

/**
 * Created by avj2352 on 3/21/2015.
 */
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Sample extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        String searchTerm = request.getParameter("term");
        writer.println("You searched for...." + searchTerm);
    }/*endmethod: doGet*/

}/*endServleClass: Sample*/
