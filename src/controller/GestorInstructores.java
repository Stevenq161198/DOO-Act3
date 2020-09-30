/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.controller;

import java.util.ArrayList;
import src.model.Instructor;
import src.model.Servicio;

/**
 *
 * @author Kendall Tames
 * @author Steven Quesada
 * @author Carlos Vega
 * @author Marlen Solano
 */
public class GestorInstructores {
  private ArrayList<Instructor> instructores;

  public ArrayList<Instructor> getInstructores() {
    return instructores;
  }

  public int getSizeInstructores(){
    return instructores.size();
  }

  public void setInstructores(ArrayList<Instructor> instructores) {
    this.instructores = instructores;
  } 
  
  public void addInstructor(Instructor instructor) {
    this.instructores.add(instructor);
  }

  public void agregarEspecialidad(String idInstructor, Especialidad especialidad ) {
    for (Instructor instructor : instructores) {
      if (instructor.getId()==idInstructor){
        instructor.aniadirEspecialidad(especialidad);
      }
    }
  } 

  public Boolean agregarServicioAInstructor(String idInstructor, Servicio servicio ) {
    return true;
  } 
  
  public Boolean eliminarServicioAInstructor(String idInstructor, Servicio servicio ) {
    return true;
  } 

  @Override
  public String toString() {
    String out = "";
    
    for (Instructor instructor : instructores)
      out += String.format("ID: %s, Nombre: %s\n", instructor.getId(), instructor.getNombre());

    return out;
  }

  public Instructor getInstructor(String idInstructor) {
    for (Instructor instructor : instructores)
      if (instructor.getId().equals(idInstructor))
        return instructor;
    return null;
  }
}
