/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebadirectoriotelefonico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Asus
 */
public class DirectorioTelefonico {
    
    private Map <Long, Cliente> c1 = new TreeMap <>();
    
    public int agregarCliente(long telefono, Cliente cliente){
        if (c1.containsKey(telefono)==false){
            c1.put(telefono, cliente);
            return 1;
        } else {
        return 0;
        }
    }
    
    public Cliente buscarCliente(Long telefono){
        return c1.get(telefono);
    }
    
    public Set<Long> buscarTelefono(String apellido){
        Set <Long> num1 = new HashSet();
        Set <Long> numeros = c1.keySet();
        Iterator it = numeros.iterator();
        while (it.hasNext()){
            long num = (long)it.next();
            Cliente ape = c1.get(num);
            if(ape.getApellido().equals(apellido)){
                num1.add(num);
            }
        }
        return num1;
    }
    
    public List<Cliente> buscarClientes(String ciudad){
        List c = new LinkedList();
        Set n3 = c1.keySet();
        Iterator it = n3.iterator();
        while (it.hasNext()){
            long num = (long)it.next();
            Cliente cliente = c1.get(num);
            if (cliente.getCiudad().equals(ciudad)){
                String nombreCompleto = cliente.getNombre() + " " + cliente.getApellido();
                    c.add(nombreCompleto);
            } 
        }
        return c;
    }
    
    public Cliente borrarCliente(long dni){
        Set x = c1.keySet();
        Iterator <Long> it = x.iterator();
        Cliente b = null;
        while (it.hasNext()){
            long num = (long)it.next();
            Cliente cliente = c1.get(num);
            if (cliente.getDni()==dni){
                b = c1.remove(num);
                //b++;
                break;
            }
        }
        return b;
    }
    
    public Long buscaClave(Long dni){
        Set<Long> keys = c1.keySet();
        Long clave =0L;
        for (Long num : keys) {
            Cliente cliente=c1.get(num);
            if(cliente.getDni()== dni)
                clave = num;
        }
        return clave;
    }
}
