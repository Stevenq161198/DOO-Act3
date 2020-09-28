/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.controller;

import java.util.ArrayList;
import src.model.Clase;
import src.model.Cliente;
import src.model.Instructor;

/**
 *
 * @author 1001001238
 */
public class GestorClientes {
  private ArrayList<Cliente> clientes; 

  public ArrayList<Cliente> getClientes() {
    return clientes;
  }

  public void setClientes(ArrayList<Cliente> clientes) {
    this.clientes = clientes;
  }
  
  public Boolean aplicarPago(String idCliente) {
    return true;
  } 
}
