import java.util.Scanner;

import src.controller.Controlador;
import src.controller.Sala;
import src.controller.TUsuarios;
import src.model.HorarioDia;
import src.model.TDia;
import src.model.TTiempo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kendall Tames
 * @author Steven Quesada
 * @author Carlos Vega
 * @author Marlen Solano
 */
public class Actividad3ParteII {

  public static void mostrarSubmenuSala(Controlador controlador, Scanner in) {

    System.out.println("\n" + controlador.getSalaString());

    int opt;
    do {
      System.out.println("*".repeat(10) + " SUBMENÚ SALA " + "*".repeat(10));
      System.out.println("1. Cambiar el nombre");
      System.out.println("2. Ver horario de atención");
      System.out.println("3. Cambiar horario de atención");
      System.out.println("4. Cambiar costo de matrícula");
      System.out.println("5. Cambiar costo de mensualidad");
      System.out.println("6. Cambiar capacidad máxima");
      System.out.println("7. Cambiar aforo");
      System.out.println("8. Salir");
      System.out.println("> ");

      opt = in.nextInt();
      in.nextLine(); // Consume el salto de línea

      switch (opt) {
        case 1:
          System.out.print("Digite el nuevo nombre: ");
          String nuevoNombre = in.nextLine();
          System.out.println(String.format("El nuevo nombre es: %s", nuevoNombre));
          in.nextLine();
          break;
        case 2:
          System.out.println("El horario de atención es: \n");
          System.out.println(controlador.getHorariosSalaString());
          break;
        case 3:
          System.out.println("Ingrese el nuevo horario de atención\n");
          System.out.println("Dia: ");
          String nuevoDia = in.nextLine();
          String nuevoDiaU = nuevoDia.toUpperCase();
          TDia tDia = TDia.valueOf(nuevoDiaU);
          System.out.println("Hora y minutos de inicio: ");
          int nuevaHoraIn = in.nextInt();
          int nuevoMinIn = in.nextInt();
          System.out.println("Am/Pm: ");
          String ampmIn = in.nextLine();
          String ampmInU = ampmIn.toUpperCase().trim();
          TTiempo tTiempoIn = TTiempo.valueOf(ampmInU);
          System.out.println("Hora y minutos de fin: ");
          int nuevaHoraFin = in.nextInt();
          int nuevoMinFin = in.nextInt();
          System.out.println("Am/Pm: ");
          String ampmFin = in.nextLine();
          String ampmFinU = ampmFin.toUpperCase();
          TTiempo tTiempoFin = TTiempo.valueOf(ampmFinU);
          controlador.agregarHorarioSala(new HorarioDia(tDia, nuevaHoraIn, nuevoMinIn, tTiempoIn, nuevaHoraFin, nuevoMinFin, tTiempoFin));
          System.out.println("El nuevo horario es: ");
          System.out.println(controlador.getHorariosSalaString());
          break;
        case 4:
          System.out.println("Digite el nuevo costo de matrícula\n");
          System.out.println("Costo de matrícula: ");
          double nuevoCostoMatricula = in.nextDouble();
          System.out.println("El nuevo costo de matrícula es: ");
          System.out.println(controlador.definirCostoMatricula(nuevoCostoMatricula));
          break;
        case 5:
          System.out.println("Digite el nuevo costo de la mensualidad\n");
          System.out.println("Costo de mensualidad: ");
          Double nuevoCostoMensualidad =in.nextDouble();
          System.out.println("El nuevo costo de la mensualidad es: ");
          System.out.println(controlador.definirCostoMensualidad(nuevoCostoMensualidad));          
          
          break;
        case 6:
          System.out.println("Digite la nueva capacidad maxima\n");
          System.out.println("Capacidad maxima: ");
          int nuevoCapacidadMaxima = in.nextInt();
          System.out.println("La nueva capacidad maxima es: ");
          System.out.println(controlador.definirCapacidad(nuevoCapacidadMaxima));
          break;
        case 7:
          System.out.println("Digite la nuevo aforo\n");
          System.out.println("Aforo: ");
          int nuevoAforo = in.nextInt();
          System.out.println("El nuevo aforo es: ");
          System.out.println(controlador.definirAforo(nuevoAforo));
          break;
        case 8:
          System.out.println("¡Gracias, saliendo!");
          break;
        default:
          System.out.println("La opción digitada no es válida");
          in.nextLine(); // Esperar por un Enter
          break;
      }
    } while (opt != 8);

  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    Controlador controlador = new Controlador(new Sala(), TUsuarios.ADMINISTRADOR);
    controlador.definirNombreSala("Sala por defecto");
    controlador.agregarHorarioSala(new HorarioDia(TDia.LUNES, 12, 00, TTiempo.AM, 11, 59, TTiempo.PM));

    int opt;

    do {
      System.out.println("*".repeat(10) + " MENÚ PRINCIPAL " + "*".repeat(10));
      System.out.println("1. Configurar sala");
      System.out.println("2. Registro y visualización servicios ofrecidos");
      System.out.println("3. Registro y visualización de instructores");
      System.out.println("4. Matrícula de un nuevo cliente");
      System.out.println("5. Programar una clase");
      System.out.println("6. Reservar de un espacio");
      System.out.println("7. Ver una clase particular");
      System.out.println("8. Salir");
      System.out.println("> ");
      opt = in.nextInt();
      in.nextLine(); // Consumir salto de línea pendiente

      switch (opt) {
        case 1:
          mostrarSubmenuSala(controlador, in);
          break;
        case 2:

          break;
        case 3:
          break;
        case 4:
          break;
        case 5:
          break;
        case 6:
          break;
        case 7:
          break;
        case 8:
          break;
        default:
          System.out.println("La opción digitada no es válida");
          in.nextLine(); // Esperar por un Enter
          break;
      }

    } while (opt != 8);

    in.close();
    System.out.println("\nasta la procsima!");
  } // https://www.youtube.com/watch?v=MXmQM_Uehtk

}
