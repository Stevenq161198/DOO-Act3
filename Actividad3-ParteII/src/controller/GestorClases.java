/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Clase;
import model.Cliente;
import model.Instructor;

/**
 *
 * @author 1001001238
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
  
  
}
