/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.controller;

import java.util.ArrayList;

import src.model.Clase;
import src.model.Cliente;
import src.model.Especialidad;
import src.model.HorarioDia;
import src.model.Instructor;
import src.model.Servicio;

/**
 *
 * @author Kendall Tames
 * @author Steven Quesada
 * @author Carlos Vega
 * @author Marlen Solano
 */
public class Sala {
  private String nombre;
  private int capacidad;
  private int aforoHabilitado;
  private double costoMensual;
  private double costoMatricula;
  private ArrayList<HorarioDia> horario = new ArrayList<>();
  private GestorServicios gServicios;
  private GestorInstructores gInstructores;
  private GestorClientes gClientes;
  private GestorClases gClases;

  public Sala() {
    horario = new ArrayList<>();
    gServicios = new GestorServicios();
    gInstructores = new GestorInstructores();
    gClientes = new GestorClientes();
    gClases = new GestorClases();
  }

  public HorarioDia getHorario(int indice) {
    return horario.get(indice);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getCapacidad() {
    return capacidad;
  }

  public void setCapacidad(int capacidad) {
    this.capacidad = capacidad;
  }

  public int getAforoHabilitado() {
    return aforoHabilitado;
  }

  public void setAforoHabilitado(int aforoHabilitado) {
    this.aforoHabilitado = aforoHabilitado;
  }

  public double getCostoMensual() {
    return costoMensual;
  }

  public void setCostoMensual(double costoMensual) {
    this.costoMensual = costoMensual;
  }

  public double getCostoMatricula() {
    return costoMatricula;
  }

  public void setCostoMatricula(double costoMatricula) {
    this.costoMatricula = costoMatricula;
  }

  public ArrayList<HorarioDia> getHorarios() {
    return horario;
  }

  public void agregarInstructor(Instructor instructor) {
    this.gInstructores.addInstructor(instructor); 
  }

  public void agregarEspecialidadAInstructor(String idInstructor, Especialidad especialidad) {
    this.gInstructores.agregarEspecialidad(idInstructor, especialidad);  
  }

  public boolean agregarClase(int idHorario, String idInstructor, int idServicio, int aforo) {
    HorarioDia horarioDia = horario.get(idHorario);
    Instructor instructor = gInstructores.getInstructor(idInstructor);
    
    if (instructor == null)
      return false;

    Servicio servicio = gServicios.getServicio(idServicio);

    if (servicio == null)
      return false;

    Clase clase = new Clase(horarioDia, instructor, servicio, aforo);

    this.gClases.agendarClase(instructor, clase);

    return true;
  }

  public void matricularCliente(Cliente cliente) {
    this.gClientes.addCliente(cliente);
  }

  public String getHorariosString() {
    if (horario.size() == 0)
      return "No hay horarios registrados aún";

    String output = "";

    for (int indice = 0; indice < horario.size(); indice++) {
      output += "\n" + "Horario con ID " + indice + "\n";
      output += horario.get(indice).toString();
    }

    return output;
  }

  public void setHorario(ArrayList<HorarioDia> horario) {
    this.horario = horario;
  }

  public void addHorario(HorarioDia hDia) {
    this.horario.add(hDia);
  }

  public void removeHorario(int i) {
    this.horario.remove(i);
  }

  public String getServiciosString() {
    return this.gServicios.toString();
  }
  public String getServiciosStringSize() {
    return this.gServicios.getServiciosSize();
  }

  public int getSizeHorariosSalas(){
    return this.gServicios.getServiciosSize();
  }

  public String getClientesString() {
    return this.gClientes.toString();
  }

  public String getInstructoresString() {
    return this.gInstructores.toString();
  }
  
  public int getInstructoresStringSize(){
    return this.gInstructores.getSizeInstructores();
  }
  
  public String getClaseParticular(int numeroClase){
    return this.gClases.getClaseParticular(numeroClase);
  }

  @Override
  public String toString() {
    String out = String.format("Información de sala: %s\n", this.nombre);
    out += "-".repeat(20) + "\n";
    out += String.format("Capacidad máxima: %d\n", this.capacidad);
    out += String.format("Aforo habilitado: %d\n", this.aforoHabilitado);
    out += String.format("Costo matrícula: %.2f\n", this.costoMatricula);
    out += String.format("Costo mensual: %.2f\n", this.costoMensual);

    return out;
  }

  public boolean existeIdServicio(int id) {
    return this.gServicios.existeId(id);
  }

  public void registrarServicio(int id, String descripcion) {
    this.gServicios.agregarServicio(id, descripcion);
  }

  public boolean verificarCliente(String pId){
    boolean exists=false;
    if(this.gClientes.verificarId(pId)){
      exists=true;
    }
    return exists;
  }
  
  public boolean reservarEspacioEnClase(String pId,int pNumeroClase){
    if(verificarcliente(pId)){
      this.gClases.agendarClase(instructor, clase);
    }
  }
}
