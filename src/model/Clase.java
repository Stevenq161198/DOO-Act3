/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 1001001238
 */
public class Clase {
  private HorarioDia horario; 
  private Instructor instructor;
  private ServicioEntrenamiento servicio; 
  private int aforoClase;  
  private ArrayList<Cliente> asistencia; 
 
  public Clase(HorarioDia horario, Instructor instructor, ServicioEntrenamiento servicio, int aforoClase, ArrayList<Cliente> asistencia) {
    this.asistencia = new ArrayList<Cliente>();
    this.horario = horario;
    this.instructor = instructor;
    this.servicio = servicio;
    this.aforoClase = aforoClase;
    this.asistencia = asistencia;
  }

  public HorarioDia getHorario() {
    return horario;
  }

  public void setHorario(HorarioDia horario) {
    this.horario = horario;
  }

  public Instructor getInstructor() {
    return instructor;
  }

  public void setInstructor(Instructor instructor) {
    this.instructor = instructor;
  }

  public ServicioEntrenamiento getServicio() {
    return servicio;
  }

  public void setServicio(ServicioEntrenamiento servicio) {
    this.servicio = servicio;
  }

  public int getAforoClase() {
    return aforoClase;
  }

  public void setAforoClase(int aforoClase) {
    this.aforoClase = aforoClase;
  }

  public ArrayList<Cliente> getAsistencia() {
    return asistencia;
  }

  public void setAsistencia(ArrayList<Cliente> asistencia) {
    this.asistencia = asistencia;
  }
  
  
}
