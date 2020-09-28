/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

import java.util.ArrayList;

/**
 *
 * @author 1001001238
 */
public class Instructor extends Persona {
  private Boolean temporal;
  private ArrayList<ServicioEntrenamiento> servicios; 

  public Instructor(String nombre, String id, String email, String celular, Boolean temporal, ArrayList<ServicioEntrenamiento> servicios) {
    super(nombre, id, email, celular);
    this.servicios = new ArrayList<ServicioEntrenamiento>();
    this.temporal = temporal;
    this.servicios = servicios;
  }

  public Boolean getTemporal() {
    return temporal;
  }

  public void setTemporal(Boolean temporal) {
    this.temporal = temporal;
  }

  public ArrayList<ServicioEntrenamiento> getServicios() {
    return servicios;
  }

  public void setServicios(ArrayList<ServicioEntrenamiento> servicios) {
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
