/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

import java.util.ArrayList;

/**
 *
 * @author Kendall Tames
 * @author Steven Quesada
 * @author Carlos Vega
 * @author Marlen Solano
 */
public class Clase {
  private HorarioDia horario;
  private Instructor instructor;
  private Servicio servicio;
  private int aforoClase;
  private ArrayList<Cliente> asistencia;

  public Clase(HorarioDia horario, Instructor instructor, Servicio servicio, int aforoClase) {
    this.asistencia = new ArrayList<>();
    this.horario = horario;
    this.instructor = instructor;
    this.servicio = servicio;
    this.aforoClase = aforoClase;
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

  public Servicio getServicio() {
    return servicio;
  }

  public void setServicio(Servicio servicio) {
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

  public void addCliente(Cliente cliente) {
    this.asistencia.add(cliente);
  }

  @Override
  public String toString() {
    String out = "Horario:\n";
    out += horario.toString() + "\n";
    out += String.format("Instructor: %s, ID %s\n", instructor.getNombre(), instructor.getId());
    out += String.format("Servicio: %s, ID %d\n", servicio.getDescripcion(), servicio.getCodigo());
    out += String.format("Aforo: %d, campos reservados: %d\n", this.aforoClase, this.asistencia.size());
    return out;
  }
}
