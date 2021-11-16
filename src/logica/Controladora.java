package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearCliente(int num_cliente,String nombre_perro,String raza,String color,String alergico,String atencionEspecial,
                                String nombre_duenio,String celular_duenio,String observaciones){
        
        Cliente cli = new Cliente();
        
        cli.setNum_cliente(num_cliente);
        cli.setNombre_perro(nombre_perro);
        cli.setRaza(raza);
        cli.setColor(color);
        cli.setAlergico(alergico);
        cli.setAtencionEspecial(atencionEspecial);
        cli.setNombre_duenio(nombre_duenio);
        cli.setCelular_duenio(celular_duenio);
        cli.setObservaciones(observaciones);
        
        controlPersis.crearCliente(cli);
    }
    
    public void crearCliente(Cliente cli){
        controlPersis.crearCliente(cli);
    }
    
    public void eliminarCliente(int id_cliente){
        controlPersis.eliminarCliente(id_cliente);
    }
    
    public void modificarCliente(Cliente cli){
        controlPersis.modificarCliente(cli);
    }
    
    //devuelve todos los clientes
    public List<Cliente> traerClientes(){
        return controlPersis.traerClientes();
    }
    
    //devuelve un cliente
    public Cliente traerClienteEnParticular(Cliente cli){
        return controlPersis.buscarClienteEnParticular(cli);
    }
    
    public Cliente traerClienteEnParticular(int id_cliente){       
        return controlPersis.buscarClienteEnParticular(id_cliente);
    }
}
