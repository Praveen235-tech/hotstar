package com.hostar;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VideoServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws IOException, ServletException {
        request.getRequestDispatcher("/watch.html").forward(request, response);
    }
}
