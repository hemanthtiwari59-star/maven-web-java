package com.example.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

/**
 * Simple servlet for testing AWS deployment
 */
@WebServlet("/")
public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html lang='en'>");
            out.println("<head>");
            out.println("    <meta charset='UTF-8'>");
            out.println("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.println("    <title>AWS Maven Web App</title>");
            out.println("    <style>");
            out.println("        body {");
            out.println("            font-family: Arial, sans-serif;");
            out.println("            max-width: 800px;");
            out.println("            margin: 50px auto;");
            out.println("            padding: 20px;");
            out.println("            background-color: #f5f5f5;");
            out.println("        }");
            out.println("        .container {");
            out.println("            background-color: white;");
            out.println("            padding: 30px;");
            out.println("            border-radius: 10px;");
            out.println("            box-shadow: 0 2px 10px rgba(0,0,0,0.1);");
            out.println("        }");
            out.println("        h1 {");
            out.println("            color: #333;");
            out.println("            border-bottom: 3px solid #007bff;");
            out.println("            padding-bottom: 10px;");
            out.println("        }");
            out.println("        .info {");
            out.println("            margin: 20px 0;");
            out.println("            padding: 15px;");
            out.println("            background-color: #e7f3ff;");
            out.println("            border-left: 4px solid #007bff;");
            out.println("        }");
            out.println("        .success {");
            out.println("            color: #28a745;");
            out.println("            font-weight: bold;");
            out.println("        }");
            out.println("        .timestamp {");
            out.println("            color: #666;");
            out.println("            font-size: 0.9em;");
            out.println("        }");
            out.println("    </style>");
            out.println("</head>");
            out.println("<body>");
            out.println("    <div class='container'>");
            out.println("        <h1>Welcome to AWS Cloud Deployment!</h1>");
            out.println("        <div class='info'>");
            out.println("            <p class='success'>Your Maven web application is running successfully on AWS EC2!</p>");
            out.println("            <p><strong>Deployment Date:</strong> October 2026</p>");
            out.println("            <p><strong>Framework:</strong> Maven + Servlets + JSP</p>");
            out.println("            <p><strong>Environment:</strong> AWS EC2 Instance</p>");
            out.println("        </div>");
            out.println("        <p>Your application has been successfully deployed to the cloud.</p>");
            out.println("        <p class='timestamp'>Server Time: " + LocalDateTime.now() + "</p>");
            out.println("    </div>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
