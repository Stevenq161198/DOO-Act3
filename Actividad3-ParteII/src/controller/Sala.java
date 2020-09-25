/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.HorarioDia;
/**
 *
 * @author 1001001238
 */
public class Sala {
  private String nombre;  
  private int capacidad; 
  private int aforoHabilitado;  
  private double costoMensual;  
  private double costoMatricula; 
  private ArrayList<HorarioDia> horario;
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

  public ArrayList<HorarioDia> getHorario() {
    return horario;
  }

  public void setHorario(ArrayList<HorarioDia> horario) {
    this.horario = horario;
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
  
  
}
