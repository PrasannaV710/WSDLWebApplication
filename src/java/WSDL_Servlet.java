/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Prasanna Venkatesh
 */
public class WSDL_Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet WSDL_Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            int q= Integer.valueOf(request.getParameter("x"));
            int w= Integer.valueOf(request.getParameter("y"));
            String s=request.getParameter("z");
            int check = Integer.valueOf(request.getParameter("captcha"));
            int res=0;
            if(s.equals("-")){
                 res=subtract(q,w);
                out.println("The correct answer from the Captcha is \n" + res);
                
            }
            
            else if(s.equals("/")){
                 res=divide(q,w);
                 out.println("The correct answer from the Captcha is \n" + res);
                 
            }
            
            else if(s.equals("*")) {
                 res=multiply(q,w);
                 out.println("The correct answer from the Captcha is \n" + res);
            }
            
            else {
                 res=add(q,w);
                 out.println("The correct answer from the Captcha is \n" + res);
            }
            
            if(res==check)
            {
                out.println("\n Registration successful");
            }
            
            else {
                out.println("\n Registration failed");
            }
           
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private static int add(int intA, int intB) {
        Calculator.Calculator service = new Calculator.Calculator();
        Calculator.CalculatorSoap port = service.getCalculatorSoap();
        return port.add(intA, intB);
    }

    private static int divide(int intA, int intB) {
        Calculator.Calculator service = new Calculator.Calculator();
        Calculator.CalculatorSoap port = service.getCalculatorSoap();
        return port.divide(intA, intB);
    }

    private static int multiply(int intA, int intB) {
        Calculator.Calculator service = new Calculator.Calculator();
        Calculator.CalculatorSoap port = service.getCalculatorSoap();
        return port.multiply(intA, intB);
    }

    private static int subtract(int intA, int intB) {
        Calculator.Calculator service = new Calculator.Calculator();
        Calculator.CalculatorSoap port = service.getCalculatorSoap();
        return port.subtract(intA, intB);
    }
    

}
