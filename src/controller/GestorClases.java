/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.controller;

import java.util.ArrayList;
import src.model.Clase;
import src.model.Cliente;

/**
 *
 * @author Kendall Tames
 * @author Steven Quesada
 * @author Carlos Vega
 * @author Marlen Solano
 */
public class GestorClases {
  private int mesActual;
  private ArrayList<Clase> clasesProgramadas = new ArrayList<>();

  public Boolean agendarClase(Clase clase) {
    clasesProgramadas.add(clase);
    return true;
  }

  public Boolean reservarClase(Cliente pCliente, Clase pClase) {
    for(Clase clase: clasesProgramadas){
      if(clase.equals(pClase)){
        clase.addCliente(pCliente);
        return true;
      }
    }
    return false;
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
    String out = "";
    for (int indice = 0; indice < clasesProgramadas.size(); indice++) {
      Clase clase = clasesProgramadas.get(indice);
      out += String.format("%d. %s\t%s\n", indice, clase.getHorario().getHoraInicioString(),
          clase.getServicio().getDescripcion());
    }
    return out;
  }

  public String getClaseParticularString(int numeroClase) {
    String out = "";
    if (numeroClase < this.clasesProgramadas.size()) {
      out = this.clasesProgramadas.get(numeroClase).toString();
    } else {
      out = "El numero de clase no existe";
    }
    return out;
  }

  public Clase getClaseParticular(int numeroClase) {
      return this.clasesProgramadas.get(numeroClase);
  }
}
