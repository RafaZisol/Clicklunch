/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;

import Config.Conexion;
import Interface.Interface;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author USER
 */
public class ClienteDAO implements Interface{
    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    Cliente p=new Cliente();
    Conexion cn= new Conexion();

    @Override
    public boolean registrar(Cliente cliente) {
        String sql="insert into clientes(usuario,correo,contraseña,nocuenta)values('"+cliente.getNombre()+"','"+cliente.getCorreo()+"','"+cliente.getPass()+"','"+cliente.getNocuenta()+"')";
        try{
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        
        ps.executeUpdate();
        }catch(Exception e){
            System.err.println("Error"+e);
        }
        return false;
    }

    @Override
    public void verificar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
