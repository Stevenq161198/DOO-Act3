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
public class Instructor extends Persona {
  private Boolean temporal;
  private ArrayList<Servicio> servicios; 
  private ArrayList<Especialidad> especialidades; 
  
  public Instructor(String nombre, String id, String email, String celular, Boolean temporal) {
    super(nombre, id, email, celular);
    this.servicios = new ArrayList<Servicio>();
    this.temporal = temporal;
    this.servicios = new ArrayList<>();
    this.especialidades = new ArrayList<>();
  }

  public Boolean getTemporal() {
    return temporal;
  }

  public void setTemporal(Boolean temporal) {
    this.temporal = temporal;
  }

  public ArrayList<Servicio> getServicios() {
    return servicios;
  }
  
  public ArrayList<Especialidad> getEspecialidades() {
    return especialidades;
  }

  public void aniadirEspecialidad(Especialidad especialidad) {
    this.especialidades.add(especialidad);
  }

  public void setServicios(ArrayList<Servicio> servicios) {
    this.servicios = servicios;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCelular() {
    return celular;
  }

  public void setCelular(String celular) {
    this.celular = celular;
  }
  
  
}
