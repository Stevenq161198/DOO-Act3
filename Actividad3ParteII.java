import java.util.Scanner;

import src.controller.Controlador;
import src.controller.Sala;
import src.controller.TUsuarios;
import src.model.HorarioDia;
import src.model.TDia;
import src.model.TTiempo;
import src.view.SubMenusAuxiliar;

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

  static void mostrarSubmenuHorario(Scanner in, Controlador controlador) throws Exception {

    int opt;
    do {
      System.out.println("*".repeat(10) + " SUBMENÚ HORARIO " + "*".repeat(10));
      System.out.println("1. Mostrar el horario actual");
      System.out.println("2. Agregar horario");
      System.out.println("3. Eliminar horario");
      System.out.println("4. Salir");
      System.out.print("> ");

      opt = in.nextInt();
      in.nextLine(); // Consume el salto de línea

      switch (opt) {
        case 1:
          SubMenusAuxiliar.mostrarHorarioActual(in, controlador);
          ;
          break;
        case 2:
          SubMenusAuxiliar.agregarHorario(in, controlador);
          break;
        case 3:
          SubMenusAuxiliar.eliminarHorario(in, controlador);
          break;
        case 4:
          break;
        default:
          System.out.println("La opción digitada no es válida");
          in.nextLine(); // Esperar por un Enter
          break;
      }
    } while (opt != 4);

  }

  static void mostrarSubmenuSala(Controlador controlador, Scanner in) throws Exception {

    int opt;
    do {
      System.out.println("\n" + controlador.getSalaString());
      System.out.println("*".repeat(10) + " SUBMENÚ SALA " + "*".repeat(10));
      System.out.println("1. Cambiar el nombre");
      System.out.println("2. Ver horario de atención");
      System.out.println("3. Cambiar horario de atención");
      System.out.println("4. Cambiar costo de matrícula");
      System.out.println("5. Cambiar costo de mensualidad");
      System.out.println("6. Cambiar capacidad máxima");
      System.out.println("7. Cambiar aforo");
      System.out.println("8. Salir");
      System.out.print("> ");

      opt = in.nextInt();
      in.nextLine(); // Consume el salto de línea

      switch (opt) {
        case 1:
          SubMenusAuxiliar.cambiarNombreSala(in, controlador);
          break;
        case 2:
          System.out.println("El horario de atención es: \n");
          System.out.println(controlador.getHorariosSalaString());
          break;
        case 3:
          mostrarSubmenuHorario(in, controlador);
          break;
        case 4:
          SubMenusAuxiliar.cambiarCostoMatricula(in, controlador);
          break;
        case 5:
          SubMenusAuxiliar.cambiarCostoMensualidad(in, controlador);
          break;
        case 6:
          SubMenusAuxiliar.cambiarCapacidadMaxima(in, controlador);
          break;
        case 7:
          SubMenusAuxiliar.cambiarAforo(in, controlador);
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
  public static void main(String[] args) throws Exception {

    Scanner in = new Scanner(System.in);
    Controlador controlador = new Controlador(new Sala(), TUsuarios.ADMINISTRADOR);
    controlador.definirNombreSala("Sala por defecto");
    controlador.agregarHorarioSala(new HorarioDia(TDia.LUNES, 12, 00, TTiempo.AM, 11, 59, TTiempo.PM));

    int opt;

    do {
      System.out.println("*".repeat(10) + " MENÚ PRINCIPAL " + "*".repeat(10));
      System.out.println("1. Configurar sala"); // DONE
      System.out.println("2. Registro de servicios ofrecidos"); // DONE
      System.out.println("3. Visualización servicios ofrecidos"); // DONE
      System.out.println("4. Registro de instructores"); // DONE
      System.out.println("5. Visualización de instructores"); // DONE
      System.out.println("6. Matrícula de un nuevo cliente"); // DONE
      System.out.println("7. Visualización de clientes"); // DONE
      System.out.println("8. Visualización de clases"); //
      System.out.println("9. Programar una clase"); // Steven
      System.out.println("10. Reservar de un espacio");// Carlos
      System.out.println("11. Ver una clase particular");// DONE
      System.out.println("12. Salir");
      System.out.print("> ");
      opt = in.nextInt();
      in.nextLine(); // Consumir salto de línea pendiente

      switch (opt) {
        case 1:
          mostrarSubmenuSala(controlador, in);
          break;
        case 2:
          SubMenusAuxiliar.registrarServicio(in, controlador);
          break;
        case 3:
          System.out.println(controlador.verListaServicios());
          break;
        case 4:
          SubMenusAuxiliar.registrarInstructor(in, controlador);
          break;
        case 5:
          SubMenusAuxiliar.visualizarInstructores(controlador);
          break;
        case 6:
          SubMenusAuxiliar.matricularCliente(in, controlador);
          break;
        case 7:
          SubMenusAuxiliar.visualizarClientes(controlador);
          break;
        case 8:
          // controlador.
          break;
        case 9:
          SubMenusAuxiliar.reservarUnEspacio(in, controlador);
          break;
        case 10:
          SubMenusAuxiliar.verClaseParticular(in, controlador);
          break;
        case 11:
          break;
        default:
          System.out.println("La opción digitada no es válida");
          in.nextLine(); // Esperar por un Enter
          break;
      }

    } while (opt != 11);

    in.close();
    System.out.println("\n¡Gracias por utilizar el programa!");
  } // https://www.youtube.com/watch?v=MXmQM_Uehtk

}
