package org.example;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VcapServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
      throws ServletException, IOException
    {
        // Very simple - just return some plain text
    	response.setContentType("text/plain;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        String VCAP_SERVICES = System.getenv("VCAP_SERVICES");
        response.getWriter().println("vcap"+ VCAP_SERVICES);
    }
}
