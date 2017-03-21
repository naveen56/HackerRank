/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author naveen
 */
public class UpdateLoan extends HttpServlet {

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
        try ( 
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1444:XE","naveenkalyan","naveen56");) {
            PreparedStatement st=con.prepareStatement("insert into loan values(?,?,?,?,'pending')");
            HttpSession session=request.getSession(false);
         
            String username=(String)session.getAttribute("username");
            System.out.println(username);
            st.setString(1, username.trim());
            st.setString(2,request.getParameter("loantype").trim());
            st.setInt(3,Integer.parseInt(request.getParameter("amount")));
            st.setLong(4,Long.parseLong(request.getParameter("accountnumber")));
            st.executeQuery();
            
//            request.setAttribute("username", "naveen");
//             RequestDispatcher r=request.getRequestDispatcher("successpage.jsp");
//            
//            r.forward(request, response);
            response.sendRedirect("successpage.jsp");
            
                 } catch (SQLException ex) {
                     response.sendRedirect("successpage.jsp");
            Logger.getLogger(UpdateLoan.class.getName()).log(Level.SEVERE, null, ex);
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

}
