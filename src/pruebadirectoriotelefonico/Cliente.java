/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebadirectoriotelefonico;

/**
 *
 * @author Asus
 */
public class Cliente {
    long dni;
    String nombre;
    String apellido;
    String ciudad;
    String direccion;

    public Cliente(long dni, String nombre, String apellido, String ciudad, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    Cliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        //return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", ciudad=" + ciudad + '}';
        return "Cliente{" + "Nombre: " + nombre +", Apellido: " + apellido +", DNI: " + dni +", Ciudad: " + ciudad + ", Dirección: " + direccion + '}';
    }
    
    public long getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
