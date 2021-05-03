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
public class PruebaDirectorioTelefonico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DirectorioTelefonico d1 = new DirectorioTelefonico();
        Cliente c1 = new Cliente(42744219, "Renzo", "Gomez", "Lujan", "Barrio Evita");
        Cliente c2 = new Cliente(35684943, "Marcelo", "Gomez", "San Francisco", "Perito Moreno s/n");
        Cliente c3 = new Cliente(25456987, "Fernando", "Fernandez", "Nogoli", "s/n");
        Cliente c4 = new Cliente(42744219, "Gonzalo", "Gaya", "Lujan", "Barrio Uarpes");
        
        
        System.out.println(d1.agregarCliente(2664886857L, c1));
        System.out.println(d1.agregarCliente(2664565878L, c2));
        System.out.println(d1.agregarCliente(2664123456L, c3));
        System.out.println(d1.agregarCliente(2664886857L, c4));
        
        
        System.out.println(d1.buscarCliente(2664886857L));
        System.out.println(d1.buscarCliente(2664565878L));

        System.out.println(d1.buscarTelefono("Gomez"));
        
        System.out.println(d1.buscarClientes("Lujan"));
        System.out.println(d1.buscarClientes("San Francisco"));
        
        System.out.println(d1.borrarCliente(42744219));
        System.out.println(d1.borrarCliente(42744219));
    }
    
}
