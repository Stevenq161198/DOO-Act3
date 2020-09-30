/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

import java.util.Date;

/**
 *
 * @author Kendall Tames
 * @author Steven Quesada
 * @author Carlos Vega
 * @author Marlen Solano
 */
public class Cliente extends Persona{
  private Date fechaMatricula;
  private Date fechaUltimoPago;
  private TEstado estado;  

  public Cliente(String nombre, String id, String email, String celular, Date fechaMatricula) {
    super(nombre, id, email, celular);
    this.fechaMatricula = fechaMatricula;
    this.estado = TEstado.ACTIVO;
  }

  public Date getFechaMatricula() {
    return fechaMatricula;
  }

  public void setFechaMatricula(Date fechaMatricula) {
    this.fechaMatricula = fechaMatricula;
  }

  public Date getFechaUltimoPago() {
    return fechaUltimoPago;
  }

  public void setFechaUltimoPago(Date fechaUltimoPago) {
    this.fechaUltimoPago = fechaUltimoPago;
  }

  public TEstado getEstado() {
    return estado;
  }

  public void setEstado(TEstado estado) {
    this.estado = estado;
  }
  
  
}
