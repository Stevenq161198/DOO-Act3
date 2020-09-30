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
 * @author Kendall Tames
 * @author Steven Quesada
 * @author Carlos Vega
 * @author Marlen Solano
 */
public class GestorClases {
  private int mesActual;
  private ArrayList<Clase> clasesProgramadas;

  public Boolean agendarClase(Instructor instructor, Clase clase) {

    return true;
  }

  public Boolean reservarClase(Cliente cliente, Clase clase) {
    return true;
  }

  public int getMesActual() {
    return mesActual;
  }

  public void setMesActual(int mesActual) {
    this.mesActual = mesActual;
  }

  public ArrayList<Clase> getClasesProgramadas() {
    return clasesProgramadas;
  }

  public void setClasesProgramadas(ArrayList<Clase> asistencia) {
    this.clasesProgramadas = asistencia;
  }

  @Override
  public String toString() {
    return "sa";
  }

  public String getClaseParticular(int numeroClase) {
    String out = "";
    if (numeroClase < this.clasesProgramadas.size()) {
      out = this.clasesProgramadas.get(numeroClase).toString();
    } else {
      out = "El numero de clase no existe";
    }
    return out;
  }
}
