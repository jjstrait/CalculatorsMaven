/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.jjs.calculatormaven.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.wctc.jjs.calculatormaven.model.geometryCalculator;

/**
 *
 * @author jstra
 */
@WebServlet(name = "geometryCalculator", urlPatterns = {"/geometryCalculator"})
public class geometryController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private final String LENGTH_RECT = "lengthRect";
    private final String WIDTH_RECT = "widthRect";
    private final String AREA_RECT = "areaRect";
    private final String RADIUS = "radius";
    private final String AREA_CIRCLE = "areaCircle";
    private final String SIDE_A = "a";
    private final String SIDE_B = "b";
    private final String HYPOTENUSE = "hypotenuse";
    private final String SHAPE_TYPE = "shapeType";
    
    private final String RETURN_PAGE = "index.jsp";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String errMsgLocation = AREA_RECT;
        
        try {
             geometryCalculator calc = new geometryCalculator();
            if(request.getParameter(SHAPE_TYPE).equals("rect")){
            errMsgLocation = AREA_RECT;
            
            String length = request.getParameter(LENGTH_RECT);
            String width = request.getParameter(WIDTH_RECT);
            
            double area = calc.calculateAreaRect(length, width);
            
            request.setAttribute(AREA_RECT,area);
            request.setAttribute(WIDTH_RECT,width);
            request.setAttribute(LENGTH_RECT,length);
            
            }else if(request.getParameter(SHAPE_TYPE).equals("circle")){
            errMsgLocation = AREA_CIRCLE;
           
            String radius = request.getParameter(RADIUS);
            
            
            double area = calc.calculateAreaCircle(radius);
            
            request.setAttribute(AREA_CIRCLE,area);
            request.setAttribute(RADIUS,radius);
           
            }else if(request.getParameter(SHAPE_TYPE).equals("triangle")){
            errMsgLocation = HYPOTENUSE;
           
            String a = request.getParameter(SIDE_A);
            String b = request.getParameter(SIDE_B);
            
            
            double hypotenuse = calc.calculateHypotenuse(a, b);
            
            request.setAttribute(SIDE_A,a);
            request.setAttribute(SIDE_B,b);
            request.setAttribute(HYPOTENUSE,hypotenuse);
           
            }
            System.out.println("Hello");
            
        }catch(Exception e){
            request.setAttribute(errMsgLocation, e.getMessage());
        }
        
        RequestDispatcher view = request.getRequestDispatcher(RETURN_PAGE);
             view.forward(request, response);
        
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

}
