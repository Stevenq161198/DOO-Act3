/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.controller;

import java.util.ArrayList;
import src.model.Cliente;

/**
 *
 * @author Kendall Tames
 * @author Steven Quesada
 * @author Carlos Vega
 * @author Marlen Solano
 */
public class GestorClientes {
  private ArrayList<Cliente> clientes = new ArrayList<>();

  public ArrayList<Cliente> getClientes() {
    return clientes;
  }

  public void setClientes(ArrayList<Cliente> clientes) {
    this.clientes = clientes;
  }

  public Boolean aplicarPago(String idCliente) {
    return true;
  }

  public void addCliente(Cliente cliente) {
    this.clientes.add(cliente);
  }

  public boolean verificarId(String pId){
    boolean exists=false;
    for(Cliente cliente : clientes){
      if(cliente.getId()==pId){
        exists=true;
        break;
      }
    }
    return exists;
  }

  @Override
  public String toString() {
    String out = "";
    
    for (Cliente cliente : clientes)
      out += String.format("ID: %s, Nombre: %s\n", cliente.getId(), cliente.getNombre());

    return out;
  }
}
