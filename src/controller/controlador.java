package src.controller;

import java.util.ArrayList;

import src.model.*;

/**
 *
 * @author Kendall Tames
 * @author Steven Quesada
 * @author Carlos Vega
 * @author Marlen Solano
 */
public class Controlador {
  private Sala laSala;
  private TUsuarios usuarioActual;

  public Controlador(Sala laSala, TUsuarios usuarioActual) {
    this.laSala = laSala;
    this.usuarioActual = usuarioActual;
  }

  // public Sala getLaSala() {
  // return laSala;
  // }

  // public void setLaSala(Sala laSala) {
  // this.laSala = laSala;
  // }

  public String getSalaString() {
    return this.laSala.toString();
  }

  public String getHorariosSalaString() {
    return this.laSala.getHorariosString();
  }

  public TUsuarios getUsuarioActual() {
    return usuarioActual;
  }

  public void setUsuarioActual(TUsuarios usuarioActual) {
    this.usuarioActual = usuarioActual;
  }

  public void definirNombreSala(String nombre) {
    this.laSala.setNombre(nombre);
  }

  public void definirHorarioSala(ArrayList<HorarioDia> horario) {
    this.laSala.setHorario(horario);
  }

  public void agregarHorarioSala(HorarioDia horario) {
    this.laSala.addHorario(horario);
  }

  public void eliminarHorarioSala(int indice) {
    this.laSala.removeHorario(indice);
  }

  public void definirCostoMatricula(double costoMatricula) {
    this.laSala.setCostoMatricula(costoMatricula);
  }

  public void definirCostoMensualidad(double costoMensual) {
    this.laSala.setCostoMensual(costoMensual);
  }

  public void definirCapacidad(int capacidad) {
    this.laSala.setCapacidad(capacidad);
  }

  public void definirAforo(int aforo) {
    this.laSala.setAforoHabilitado(aforo);
  }

  public void registrarServicio() {

  }

  public void editarServicio() {

  }

  public void consultarServicio() {

  }

  public void registrarInstructor() {

  }

  public void editarInstructor() {

  }

  public void consultarInstructor() {

  }

  public void matricularCliente() {

  }

  public void crearCalendarioParaUnMes() {

  }

  public void programarUnaClase() {

  }

  public void aplicarMensualidad() {

  }

  public void reservarEspacioEnClase() {

  }

  public void cancelarUnaReserva() {

  }

  public void sustituirInstructor() {

  }

  public void verCalendarioDelMes() {

  }

  public void verInstructores(Boolean temporal) {

  }

  public void verConfiguracionSala() {

  }

  public void verListaClientes(TEstado estado) {

  }

  public void verListaServicios() {

  }

  public void verReservasDeUnaClase() {

  }

  public void verInstructores() {

  }

  public void verFechaMensualidad() {

  }
}
