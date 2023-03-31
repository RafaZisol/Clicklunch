/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USER
 */
public class Cliente {
    private String nombre;
    private String correo;
    private String pass;
    private int nocuenta;

    public Cliente() {
    }

    public Cliente(String nombre, String correo, String pass, int nocuenta) {
        this.nombre = nombre;
        this.correo = correo;
        this.pass = pass;
        this.nocuenta = nocuenta;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getNocuenta() {
        return nocuenta;
    }

    public void setNocuenta(int nocuenta) {
        this.nocuenta = nocuenta;
    }
    
    
    
}
