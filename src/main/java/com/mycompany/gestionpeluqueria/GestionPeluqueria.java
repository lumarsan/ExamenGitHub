/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//Paquete de clases del proyecto
package com.mycompany.gestionpeluqueria;

/**
 *
 * @author Luis
 */
//Importaciones de clases de librerias Java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;
//Clase que representa el servicio de peluqueria
class ServicioPeluqueria {
    private final String nombre;
    private final double precio;
    //Constructor para inicializar un servicio
    public ServicioPeluqueria(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    //Metodos de obtención del nombre y precio del servicio
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    //Metodo para representar el servicio como cadena de texto
    @Override
    public String toString() {
        return "Servicio: " + nombre + ", Precio: $" + precio;
    }
}
//Clase que representa la cita en la peluqueria
class Cita {
    private final String cliente;
    private final String servicio;
    private final String hora;
    //Constructor de inicialización de la cita
    public Cita(String cliente, String servicio, String hora) {
        this.cliente = cliente;
        this.servicio = servicio;
        this.hora = hora;
    }
    //Metodos para obtener el cliente, servicio y hora de la cita
    public String getCliente() {
        return cliente;
    }

    public String getServicio() {
        return servicio;
    }

    public String getHora() {
        return hora;
    }
    //Metodo para representar la cita como cadena de texto
   @Override
public String toString() {
    return "Cita{cliente='" + cliente + "', servicio='" + servicio + "', hora='" + hora + "'}";
}


}
//Clase principal encargada de gestionar la peluqueria
public class GestionPeluqueria {
    private final ArrayList<ServicioPeluqueria> servicios;
    private final ArrayList<Cita> citas;
    //Constructor para inicializar las listas de servicios
    public GestionPeluqueria() {
        servicios = new ArrayList<>();
        citas = new ArrayList<>();
    }
    //Metodo para obtener la lista de servicios
     public List<ServicioPeluqueria> getServicios() {
        return servicios;
    }
     //Metodo que permite agregar un nuevo servicio
    public void agregarServicio(String nombre, double precio) {
        ServicioPeluqueria nuevoServicio = new ServicioPeluqueria(nombre, precio);
        servicios.add(nuevoServicio);
        System.out.println("Servicio agregado: " + nuevoServicio);
    }
    //Metodo para mostrar la lista de los servicios
    public void mostrarServicios() {
        if (servicios.isEmpty()) {
            System.out.println("No hay servicios registrados.");
        } else {
            System.out.println("Lista de servicios de peluquería:");
            for (ServicioPeluqueria servicio : servicios) {
                System.out.println(servicio);
            }
        }
    }
    // Método que permite programar una cita
    public void programarCita(String cliente, String servicio, String hora) {
        // Verificar si el servicio especificado existe en la lista de servicios
        boolean servicioExistente = servicios.stream().anyMatch(s -> s.getNombre().equalsIgnoreCase(servicio));
        if (!servicioExistente) {
            System.out.println("No es posible programar la cita. El servicio '" + servicio + "' no está disponible.");
        return; // Salir del método si el servicio no está disponible
    }
        // Si el servicio existe, proceder con la programación de la cita
        Cita nuevaCita = new Cita(cliente, servicio, hora);
        citas.add(nuevaCita);
        System.out.println("Cita programada exitosamente: " + nuevaCita);
}
    //Metodo que muestra la lista de citas programadas
    public void mostrarCitas() {
        if (citas.isEmpty()) {
            System.out.println("No hay citas programadas.");
        } else {
            System.out.println("Lista de citas programadas:");
            for (Cita cita : citas) {
                System.out.println(cita);
            }
        }
    }
    //Metodo principal para la ejecución del programa
    public static void main(String[] args) {
        GestionPeluqueria gestionPeluqueria = new GestionPeluqueria();
        Scanner scanner = new Scanner(System.in);
        //Bucle que muestra el menú principal
        while (true) {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Agregar servicio de peluquería");
            System.out.println("2. Mostrar servicios de peluquería");
            System.out.println("3. Programar cita");
            System.out.println("4. Mostrar citas programadas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después del número
            //Switch de manejo de opciones del menu
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del nuevo servicio: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Ingrese el precio del nuevo servicio: $");
                    double nuevoPrecio = scanner.nextDouble();
                    gestionPeluqueria.agregarServicio(nuevoNombre, nuevoPrecio);
                    break;
                case 2:
                    gestionPeluqueria.mostrarServicios();
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String cliente = scanner.nextLine();
                    System.out.print("Ingrese el servicio a realizar: ");
                    String servicio = scanner.nextLine();
                    System.out.print("Ingrese la hora de la cita: ");
                    String hora = scanner.nextLine();
                    gestionPeluqueria.programarCita(cliente, servicio, hora);
                    break;
                case 4:
                    gestionPeluqueria.mostrarCitas();
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
    //Metodo que permite la comprobación de tests del programa mediante JUnit
    public class TestGestionPeluqueria {

    // Método de prueba para comprobar la funcionalidad de agregarServicio
    @Test
    public void testAgregarServicio() {
        GestionPeluqueria gestionPeluqueria = new GestionPeluqueria();

        // Caso de prueba 1
        gestionPeluqueria.agregarServicio("Corte de Pelo", 20.0);
        assertEquals(1, gestionPeluqueria.getServicios().size());
        assertEquals("Corte de Pelo", gestionPeluqueria.getServicios().get(0).getNombre());
        assertEquals(20.0, gestionPeluqueria.getServicios().get(0).getPrecio(), 0.01);

        // Caso de prueba 2
        gestionPeluqueria.agregarServicio("Lavado de Cabello", 15.0);
        assertEquals(2, gestionPeluqueria.getServicios().size());
        assertEquals("Lavado de Cabello", gestionPeluqueria.getServicios().get(1).getNombre());
        assertEquals(15.0, gestionPeluqueria.getServicios().get(1).getPrecio(), 0.01);
    }
}
}