/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

/**
 *
 * @author Kendall Tames
 * @author Steven Quesada
 * @author Carlos Vega
 * @author Marlen Solano
 */
public class HorarioDia {
  private TDia diaSemana;
  private int horaInicio;
  private int minInicio;
  private TTiempo tiempoInicio;
  private int horaFinal;
  private int minFinal;
  private TTiempo tiempoFinal;

  public HorarioDia(TDia diaSemana, int horaInicio, int minInicio, TTiempo tiempoInicio, int horaFinal, int minFinal,
      TTiempo tiempoFinal) {
    this.diaSemana = diaSemana;
    this.horaInicio = horaInicio;
    this.minInicio = minInicio;
    this.tiempoInicio = tiempoInicio;
    this.horaFinal = horaFinal;
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

  public int getHoraFinal() {
    return horaFinal;
  }

  public void setHoraDinal(int horaFinal) {
    this.horaFinal = horaFinal;
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

  @Override
  public String toString() {
    String out = "";

    out += String.format("Dia: %s\n",
        this.diaSemana.name().substring(0, 1).toUpperCase() + this.diaSemana.name().substring(1).toLowerCase());

    out += String.format("Hora inicio: %02d:%02d %s\n", this.horaInicio, this.minInicio,
        this.tiempoInicio.name().toLowerCase());

    out += String.format("Hora fin: %02d:%02d %s\n", this.horaFinal, this.minFinal,
        this.tiempoFinal.name().toLowerCase());

    out += "-".repeat(30);

    return out;
  }

  public String getHoraInicioString() {
    return String.format("%s, %02d:%02d %s",
        this.diaSemana.name().substring(0, 1).toUpperCase() + this.diaSemana.name().substring(1).toLowerCase(),
        this.horaInicio, this.minInicio, this.tiempoInicio.name().toLowerCase());
  }
}
