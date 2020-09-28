/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

/**
 *
 * @author 1001001238
 */
public class HorarioDia {
  private TDia diaSemana; 
  private int horaInicio;
  private int minInicio; 
  private TTiempo tiempoInicio;
  private int horaDinal;
  private int minFinal;
  private TTiempo tiempoFinal;

  public HorarioDia(TDia diaSemana, int horaInicio, int minInicio, TTiempo tiempoInicio, int horaDinal, int minFinal, TTiempo tiempoFinal) {
    this.diaSemana = diaSemana;
    this.horaInicio = horaInicio;
    this.minInicio = minInicio;
    this.tiempoInicio = tiempoInicio;
    this.horaDinal = horaDinal;
    this.minFinal = minFinal;
    this.tiempoFinal = tiempoFinal;
  }

  public TDia getDiaSemana() {
    return diaSemana;
  }

  public void setDiaSemana(TDia diaSemana) {
    this.diaSemana = diaSemana;
  }

  public int getHoraInicio() {
    return horaInicio;
  }

  public void setHoraInicio(int horaInicio) {
    this.horaInicio = horaInicio;
  }

  public int getMinInicio() {
    return minInicio;
  }

  public void setMinInicio(int minInicio) {
    this.minInicio = minInicio;
  }

  public TTiempo getTiempoInicio() {
    return tiempoInicio;
  }

  public void setTiempoInicio(TTiempo tiempoInicio) {
    this.tiempoInicio = tiempoInicio;
  }

  public int getHoraDinal() {
    return horaDinal;
  }

  public void setHoraDinal(int horaDinal) {
    this.horaDinal = horaDinal;
  }

  public int getMinFinal() {
    return minFinal;
  }

  public void setMinFinal(int minFinal) {
    this.minFinal = minFinal;
  }

  public TTiempo getTiempoFinal() {
    return tiempoFinal;
  }

  public void setTiempoFinal(TTiempo tiempoFinal) {
    this.tiempoFinal = tiempoFinal;
  }
  
  
}
