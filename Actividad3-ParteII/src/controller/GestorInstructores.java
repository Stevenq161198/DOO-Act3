/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Instructor;
import model.ServicioEntrenamiento;

/**
 *
 * @author 1001001238
 */
public class GestorInstructores {
  private ArrayList<Instructor> instructores;

  public ArrayList<Instructor> getInstructores() {
    return instructores;
  }

  public void setInstructores(ArrayList<Instructor> instructores) {
    this.instructores = instructores;
  }
  
  public Boolean agregarServicioAInstructor(String idInstructor, ServicioEntrenamiento servicio ) {
    return true;
  } 
  
  public Boolean eliminarServicioAInstructor(String idInstructor, ServicioEntrenamiento servicio ) {
    return true;
  } 
}
