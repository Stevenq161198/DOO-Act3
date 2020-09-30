package src.controller;

import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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

  public String getSalaString() {
    return this.laSala.toString();
  }

  public String getHorariosSalaString() { ////////// !
    return this.laSala.getHorariosString();
  }

  public int getSizeHorarios(){
    return this.laSala.getSizeHorariosSalas();
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

  public double definirCostoMatricula(double costoMatricula) {
    this.laSala.setCostoMatricula(costoMatricula);
    return costoMatricula;
  }

  public double definirCostoMensualidad(double costoMensual) {
    this.laSala.setCostoMensual(costoMensual);
    return costoMensual;
  }

  public int definirCapacidad(int capacidad) {
    this.laSala.setCapacidad(capacidad);
    return capacidad;
  }

  public int definirAforo(int aforo) {
    this.laSala.setAforoHabilitado(aforo);
    return aforo;
  }

  public int getAforo(){
    return this.laSala.getAforoHabilitado();
  }

  public void registrarServicio(int id, String descripcion) {
    this.laSala.registrarServicio(id, descripcion);
  }

  public void editarServicio() {

  }

  public void consultarServicio() {

  }

  public void registrarInstructor(String nombre, String id, String email, String celular, boolean temporal) {
    // TODO: Poner temporal o no
    Instructor instructor = new Instructor(nombre, id, email, celular, temporal);
    this.laSala.agregarInstructor(instructor); 
  }

  public void registrarEspecialidadAInstructor(String idInstructor, String id, String descripcion, String nombre) { 
    Especialidad especialidad = new Especialidad(id, descripcion, nombre);
    this.laSala.agregarEspecialidadAInstructor(idInstructor, especialidad); 
  }

  public void editarInstructor() {

  }

  public void consultarInstructor() {

  }

  public void matricularCliente(String nombre, String id, String email, String celular) {
    Calendar cal = Calendar.getInstance();
    Date date = cal.getTime();

    Cliente cliente = new Cliente(nombre, id, email, celular, date);
    this.laSala.matricularCliente(cliente);
  }

  public void crearCalendarioParaUnMes() {

  }

  public void programarUnaClase(int idHorario, String idInstructor, int idServicio, int aforo) {
    this.laSala.agregarClase(idHorario, idInstructor, idServicio, aforo);
  }

  public void aplicarMensualidad() {

  }

  public void reservarEspacioEnClase(String pId,int pNumeroClase) {
    this.laSala.reservarEspacioEnClase(pId, pNumeroClase);

  }

  public void cancelarUnaReserva() {

  }

  public void sustituirInstructor() {

  }

  public String verCalendarioDelMes() {
    this.laSala.
  }

  public void verInstructores(Boolean temporal) {

  }

  public void verConfiguracionSala() {

  }

  public String verListaClientes() {
    return this.laSala.getClientesString();
  }

  public void verListaClientes(TEstado estado) {

  }

  public String verListaServicios() {
    return this.laSala.getServiciosString();
  }
  
  public int getSizeListaServicios(){
    return this.laSala.getServiciosStringSize();
  }

  public void verReservasDeUnaClase() {

  }

  public String verInstructors() {
    return this.laSala.getInstructoresString();
  }

  public int getSizeInstructors(){
    return this.laSala.getInstructoresStringSize();
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }


  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }

  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}
  public void verFechaMensualidad() {

  }

  public boolean verificarIdUnicoServicio(int id) {
    return !this.laSala.existeIdServicio(id);
  }

  public String verClaseParticular(int numeroClase){
    return this.laSala.getClaseParticular(numeroClase);
  }
}