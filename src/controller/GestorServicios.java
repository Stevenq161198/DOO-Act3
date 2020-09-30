/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.controller;

import java.util.ArrayList;
import src.model.Servicio;

/**
 *
 * @author Kendall Tames
 * @author Steven Quesada
 * @author Carlos Vega
 * @author Marlen Solano
 */
public class GestorServicios {
  private ArrayList<Servicio> servicios = new ArrayList<>();

  public ArrayList<Servicio> getServicios() {
    return servicios;
  }

  public int getServiciosSize() {
    return this.servicios.size();
  }

  public void setServicios(ArrayList<Servicio> servicios) {
    this.servicios = servicios;
  }

  public void agregarServicio(Servicio servicioEntrenamiento) {
    servicios.add(servicioEntrenamiento);
  }

  public void agregarServicio(int codigo, String descripcion) {
    this.agregarServicio(new Servicio(codigo, descripcion));
  }

  @Override
  public String toString() {
    String out = "Lista de servicios activos: \n";
    out += "-".repeat(20) + "\n";
    for (Servicio servicioEntrenamiento : servicios) {
      out += String.format("Cod [%d] => %s\n", servicioEntrenamiento.getCodigo(),
          servicioEntrenamiento.getDescripcion());
    }
    return out;
  }

  public boolean existeId(int id) {
    for (Servicio servicioEntrenamiento : servicios)
      if (servicioEntrenamiento.getCodigo() == id)
        return true;

    return false;
  }

  public Servicio getServicio(int idServicio) {
    for (Servicio servicio : servicios)
      if (servicio.getCodigo() == idServicio)
        return servicio;

    return null;
  }

}