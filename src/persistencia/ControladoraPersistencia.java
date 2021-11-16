package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Cliente;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
   
    ClienteJpaController cliJPA = new ClienteJpaController();
    
    public void crearCliente(Cliente cli) {
        
        try {
            cliJPA.create(cli);
        } catch (Exception ex) {
            System.out.println("No se pudo crear el cliente" + ex.getMessage());
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarCliente(int id_cliente){
        
        try {
            cliJPA.destroy(id_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarCliente(Cliente cli){
        
        try {
            cliJPA.edit(cli);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //devuelve todos los clientes -- lectura
    public List<Cliente> traerClientes(){
        
        return cliJPA.findClienteEntities();
    }
    
    //devuelve un cliente
    public Cliente buscarClienteEnParticular(Cliente cli){
        
        return cliJPA.findCliente(cli.getId_cliente());
    }
    
    public Cliente buscarClienteEnParticular(int id_cliente){    
        
        return cliJPA.findCliente(id_cliente);
    }
}
