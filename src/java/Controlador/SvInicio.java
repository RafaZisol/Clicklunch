/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import Config.Conexion;
import java.sql.ResultSet;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */

public class SvInicio extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
        String exito="Paginas/prueba.jsp";
        Statement st = null;
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
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
        try{
        
        processRequest(request, response);
        String usuario=request.getParameter("usuario");        
        String pass=request.getParameter("contra1");
        String nocuenta=request.getParameter("nocuenta");
        
        try (Connection con = Conexion.iniciar()) {
               st=con.createStatement();
               ResultSet rs = st.executeQuery("select * from where nocuenta='"+nocuenta+"'");
               if(rs.next()) {
                String usu = rs.getString("usuario");
                String contra = rs.getString("contraseña");
                if(usu==usuario && contra==pass){
                    System.out.println("Usuario: " + usuario);
                    System.out.println("Contraseña: " + contra);
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Inicio Exitoso</title>");            
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>Inicio de Sesion exitoso</h1>");
                    out.println("</body>");
                    out.println("</html>");
                } else {
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Inicio Exitoso</title>");            
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>Inicio de Sesion fallido</h1>");
                    out.println("</body>");
                    out.println("</html>");
                
                }
               }
               
           } catch (ClassNotFoundException ex) {
                Logger.getLogger(SvCliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(SvCliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(SvCliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(SvCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            st.close();   
            
            
            System.out.println("Se registro");  } catch (SQLException ex) {
            Logger.getLogger(SvCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            out.close();
        }
                 
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
