/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 842458
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {
        
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String no1 = request.getParameter("no1");
            String no2 = request.getParameter("no2");
            
            if (no1 == null || no1.equals("") || no2 == null || no2.equals("")){
                
                request.setAttribute("message", "Invalid entery");
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                
            }
            else {
                
                int first = Integer.parseInt(no1);
                int second = Integer.parseInt(no2);
                
            int add = first + second;
            request.setAttribute("result", " " + add);
            
            int subtract = first - second;
            request.setAttribute("result", " " + subtract);
            
            int multiply = first * second;
            request.setAttribute("result", " " + multiply);
            
            int divide = first % second;
            request.setAttribute("result", " " + divide);
            
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            }
    }

   

}
