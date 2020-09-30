package src.view;

import java.util.Scanner;
import src.controller.Controlador;
import src.model.HorarioDia;
import src.model.TDia;
import src.model.TTiempo;

/**
 *
 * @author Kendall Tames
 * @author Steven Quesada
 * @author Carlos Vega
 * @author Marlen Solano
 */

public class SubMenusAuxiliar {
  public static void cambiarNombreSala(Scanner in, Controlador controlador) {
    System.out.print("Digite el nuevo nombre: ");
    String nombre = in.nextLine();
    controlador.definirNombreSala(nombre);
    System.out.println("Se ha definido el nuevo nombre con éxito.");
    in.nextLine();
  }

  public static void cambiarCostoMatricula(Scanner in, Controlador controlador) {
    System.out.println("Digite el nuevo costo de matrícula\n");
    System.out.println("Costo de matrícula: ");
    double nuevoCostoMatricula = in.nextDouble();
    in.nextLine();
    System.out.println("El nuevo costo de matrícula es: ");
    System.out.println(String.valueOf(controlador.definirCostoMatricula(nuevoCostoMatricula)));
  }

  public static void cambiarCostoMensualidad(Scanner in, Controlador controlador) {
    System.out.println("Digite el nuevo costo de la mensualidad\n");
    System.out.println("Costo de mensualidad: ");
    Double nuevoCostoMensualidad = in.nextDouble();
    in.nextLine();
    System.out.println("El nuevo costo de la mensualidad es: ");
    System.out.println(String.valueOf(controlador.definirCostoMensualidad(nuevoCostoMensualidad)));
  }

  public static void cambiarCapacidadMaxima(Scanner in, Controlador controlador) {
    System.out.println("Digite la nueva capacidad maxima\n");
    System.out.println("Capacidad maxima: ");
    int nuevoCapacidadMaxima = in.nextInt();
    in.nextLine();
    System.out.println("La nueva capacidad maxima es: ");
    System.out.println(controlador.definirCapacidad(nuevoCapacidadMaxima));
  }

  public static void cambiarAforo(Scanner in, Controlador controlador) {
    System.out.println("Digite la nuevo aforo\n");
    System.out.println("Aforo: ");
    int nuevoAforo = in.nextInt();
    in.nextLine();
    System.out.println("El nuevo aforo es: ");
    System.out.println(controlador.definirAforo(nuevoAforo));
  }

  public static HorarioDia obtenerNuevoHorario(Scanner in) throws Exception {
    System.out.println("Recolección de datos para el horario de atención:\n");

    System.out.println("Dia (Lunes a Domingo, sin tildes): ");
    String dia = in.nextLine().toUpperCase().trim();
    TDia tDia = TDia.valueOf(dia);

    // Datos de inicio
    System.out.print("Hora de inicio (0 - 12): ");
    int horaInicio = in.nextInt();
    in.nextLine();
    if (horaInicio < 0 || horaInicio > 12)
      throw new Exception("La hora debe estar entre 0 y 12");

    System.out.print("Minuto de inicio (0 - 59): ");
    int minutoInicio = in.nextInt();
    in.nextLine();
    if (minutoInicio < 0 || minutoInicio > 59)
      throw new Exception("Los minutos deben estar entre 0 y 59");

    System.out.print("Am / Pm: ");
    String ampmInicio = in.nextLine().toUpperCase().trim();
    TTiempo tTiempoInicio = TTiempo.valueOf(ampmInicio);

    // Datos de fin
    System.out.print("Hora de inicio (0 - 12): ");
    int horaFin = in.nextInt();
    in.nextLine();
    if (horaInicio < 0 || horaInicio > 12)
      throw new Exception("La hora debe estar entre 0 y 12");

    System.out.print("Minuto de inicio (0 - 59): ");
    int minutoFin = in.nextInt();
    in.nextLine();
    if (minutoInicio < 0 || minutoInicio > 59)
      throw new Exception("Los minutos deben estar entre 0 y 59");

    System.out.print("Am / Pm: ");
    String ampmFin = in.nextLine().toUpperCase().trim();
    TTiempo tTiempoFin = TTiempo.valueOf(ampmFin);

    return new HorarioDia(tDia, horaInicio, minutoInicio, tTiempoInicio, horaFin, minutoFin, tTiempoFin);
  }

  public static void mostrarHorarioActual(Scanner in, Controlador controlador) {
    System.out.println("El horario actual es: ");
    System.out.println(controlador.getHorariosSalaString());
  }

  public static void agregarHorario(Scanner in, Controlador controlador) throws Exception {
    HorarioDia horario = SubMenusAuxiliar.obtenerNuevoHorario(in);
    controlador.agregarHorarioSala(horario);
    System.out.println("El horario ha sido agregado con éxito");
  }

  public static void eliminarHorario(Scanner in, Controlador controlador) throws Exception {
    System.out.println(controlador.getHorariosSalaString());
    System.out.println("Digite el numero del horario que desea eliminar\n");
    System.out.println("Numero del horario: ");
    int numeroHorario = in.nextInt();
    in.nextLine();
    controlador.eliminarHorarioSala(numeroHorario);

  }

  public static void matricularCliente(Scanner in, Controlador controlador) {
    System.out.println("Ingrese el nombre del cliente: ");
    String nombre = in.nextLine();

    System.out.println("Ingrese el id del usuario: ");
    String id = in.nextLine();

    System.out.println("Ingrese el email del usuario: ");
    String email = in.nextLine();

    System.out.println("Ingrese el celular del usuario: ");
    String celular = in.nextLine();

    controlador.matricularCliente(nombre, id, email, celular);
  }

  public static void registrarServicio(Scanner in, Controlador controlador) {
    System.out.print("Digite el ID del nuevo servicio (solamente números): ");
    int id = in.nextInt();
    in.nextLine();

    while (!controlador.verificarIdUnicoServicio(id)) {
      System.out.print("Ese ID ya está en uso.\nDigite otro ID (solamente números): ");
      id = in.nextInt();
      in.nextLine();
    }

    System.out.print("Ingrese la descripción del servicio: ");
    String descripcion = in.nextLine();

    controlador.registrarServicio(id, descripcion);
  }

  public static void registrarInstructor(Scanner in, Controlador controlador) {
    System.out.println("Ingrese el nombre del instructor: ");
    String nombre = in.nextLine();

    System.out.println("Ingrese el id: ");
    String id = in.nextLine();

    System.out.println("Ingrese el email: ");
    String email = in.nextLine();

    System.out.println("Ingrese el celular: ");
    String celular = in.nextLine();

    System.out.println("¿Es temporal? (s/n): ");
    boolean temporal = in.nextLine().trim().toLowerCase().equals("s");

    controlador.registrarInstructor(nombre, id, email, celular, temporal);

    System.out.println("Indique la opción que desea: ");
    System.out.println("1. Agregar especialidad");
    System.out.println("2. Salir");

    String opcion = in.nextLine();

    while (opcion == "1") {
      // TODO: Mostrar especialidades existentes

      System.out.println("Ingrese el id de la especialidad: ");
      String idEsp = in.nextLine();

      System.out.println("Ingrese la descripcion de la especialidad: ");
      String descripcion = in.nextLine();

      System.out.println("Ingrese el nombre de la especialidad: ");
      String nombreEsp = in.nextLine();

      controlador.registrarEspecialidadAInstructor(id, idEsp, descripcion, nombreEsp);

      System.out.println("Seleccione 1 si desea seguir ingresando especialidades o presione enter para salir");
      opcion = in.nextLine();
    }
  }

  public static void visualizarClientes(Controlador controlador) {
    System.out.println("Lista de clientes:");
    System.out.println(controlador.verListaClientes());
  }

  public static void visualizarInstructores(Controlador controlador) {
    System.out.println("Lista de instructores: ");
    System.out.println(controlador.verInstructores());
  }

  public static void programarClase(Scanner in, Controlador controlador) {
    System.out.println("Ingrese los datos para programar la clase");
    System.out.println("Ingrese el ID del horario que desee: \n");

    controlador.getHorariosSalaString();

    int idHorario = in.nextInt();
    in.nextLine();

    while (idHorario < 0 || idHorario > controlador.getSizeHorarios()) {
      System.out.println("El ID no es válido.\nIngrese el ID del horario que desee: \n");
      controlador.getHorariosSalaString();
      idHorario = in.nextInt();
      in.nextLine();
    }

    System.out.println(controlador.verInstructores());

    System.out.println("Ingrese el id del instructor: \n");

    String idInstructor = in.nextLine();

    while (!controlador.validarIdInstructor(idInstructor)) {
      System.out.println("El ID no es válido.\nIngrese el id del instructor: \n");
      idInstructor = in.nextLine();
    }

    controlador.verListaServicios();

    System.out.println("Ingrese el id del servicio: \n");
    int idServicio = in.nextInt();
    in.nextLine();

    while (!controlador.validarIdServicio(idServicio)) {
      System.out.println("El ID no es válido.\nIngrese el id del servicio: \n");
      controlador.verListaServicios();
      idServicio = in.nextInt();
      in.nextLine();
    }

    System.out.println("Ingrese el aforo: \n");

    int aforo = in.nextInt();
    in.nextLine();

    controlador.programarUnaClase(idHorario, idInstructor, idServicio, aforo);

  }

  public static void verClaseParticular(Scanner in, Controlador controlador) {
    System.out.println(controlador.verCalendarioDelMes());
    System.out.println("Ingrese el numero de clase: ");

    int numeroClase = in.nextInt();
    in.nextLine();

    System.out.println(controlador.verClaseParticular(numeroClase));
  }

  public static void reservarUnEspacio(Scanner in, Controlador controlador) {
    System.out.println("Ingrese el numero de identificacion: ");
    String id = in.nextLine();

    System.out.println("Ingrese el numero de clase: ");
    int numeroClase = in.nextInt();
    in.nextLine();

    controlador.reservarEspacioEnClase(id, numeroClase);

  }
}