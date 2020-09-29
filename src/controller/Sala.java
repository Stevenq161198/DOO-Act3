/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.controller;

import java.util.ArrayList;
import src.model.HorarioDia;

/**
 *
 * @author Kendall Tames
 * @author Steven Quesada
 * @author Carlos Vega
 * @author Marlen Solano
 */
public class Sala {
  private String nombre;
  private int capacidad;
  private int aforoHabilitado;
  private double costoMensual;
  private double costoMatricula;
  private ArrayList<HorarioDia> horario = new ArrayList<>();
  private GestorServicios gServicios;
  private GestorInstructores gInstructores;
  private GestorClientes gClientes;
  private GestorClases calendarioMensual;
  

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getCapacidad() {
    return capacidad;
  }

  public void setCapacidad(int capacidad) {
    this.capacidad = capacidad;
  }

  public int getAforoHabilitado() {
    return aforoHabilitado;
  }

  public void setAforoHabilitado(int aforoHabilitado) {
    this.aforoHabilitado = aforoHabilitado;
  }

  public double getCostoMensual() {
    return costoMensual;
  }

  public void setCostoMensual(double costoMensual) {
    this.costoMensual = costoMensual;
  }

  public double getCostoMatricula() {
    return costoMatricula;
  }

  public void setCostoMatricula(double costoMatricula) {
    this.costoMatricula = costoMatricula;
  }

  public ArrayList<HorarioDia> getHorarios() {
    return horario;
  }
  
  public String getHorariosString() {
    if (horario.size() == 0)
      return "No hay horarios registrados aún";
    
    String output = horario.get(0).toString();

    for (int indice = 1; indice < horario.size(); indice++) {
      output += "\n" + "-".repeat(10) + "\n";
      output += horario.get(indice).toString();
    }

    return output;
  }

  public void setHorario(ArrayList<HorarioDia> horario) {
    this.horario = horario;
  }

  public void addHorario(HorarioDia hDia) {
    this.horario.add(hDia);
  }

  public void removeHorario(int i) {
    this.horario.remove(i);
  }

  public GestorServicios getgServicios() {
    return gServicios;
  }

  public void setgServicios(GestorServicios gServicios) {
    this.gServicios = gServicios;
  }

  public GestorInstructores getgInstructores() {
    return gInstructores;
  }

  public void setgInstructores(GestorInstructores gInstructores) {
    this.gInstructores = gInstructores;
  }

  public GestorClientes getgClientes() {
    return gClientes;
  }

  public void setgClientes(GestorClientes gClientes) {
    this.gClientes = gClientes;
  }

  public GestorClases getCalendarioMensual() {
    return calendarioMensual;
  }

  public void setCalendarioMensual(GestorClases calendarioMensual) {
    this.calendarioMensual = calendarioMensual;
  }

  @Override
  public String toString() {
    String out = String.format("Información de sala: %s\n", this.nombre);
    out += "-".repeat(20) + "\n";
    out += String.format("Capacidad máxima: %d\n", this.capacidad);
    out += String.format("Aforo habilitado: %d\n", this.aforoHabilitado);
    out += String.format("Costo matrícula: %.2f\n", this.costoMatricula);
    out += String.format("Costo mensual: %.2f\n", this.costoMensual);
    return out;
  }
}
