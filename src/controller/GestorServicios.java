/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.controller;

import java.util.ArrayList;
import src.model.ServicioEntrenamiento;

/**
 *
 * @author Kendall Tames
 * @author Steven Quesada
 * @author Carlos Vega
 * @author Marlen Solano
 */
public class GestorServicios {
  private ArrayList<ServicioEntrenamiento> servicios;

  public ArrayList<ServicioEntrenamiento> getServicios() {
    return servicios;
  }

  public void setServicios(ArrayList<ServicioEntrenamiento> servicios) {
    this.servicios = servicios;
  }
  
  
}
