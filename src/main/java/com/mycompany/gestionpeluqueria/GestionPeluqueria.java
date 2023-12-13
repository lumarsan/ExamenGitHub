/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionpeluqueria;

/**
 *
 * @author Luis
 */
import java.util.ArrayList;
import java.util.Scanner;

class ServicioPeluqueria {
    private final String nombre;
    private final double precio;

    public ServicioPeluqueria(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Servicio: " + nombre + ", Precio: $" + precio;
    }
}

class Cita {
    private final String cliente;
    private final String servicio;
    private final String hora;

    public Cita(String cliente, String servicio, String hora) {
        this.cliente = cliente;
        this.servicio = servicio;
        this.hora = hora;
    }

    public String getCliente() {
        return cliente;
    }

    public String getServicio() {
        return servicio;
    }

    public String getHora() {
        return hora;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente + ", Servicio: " + servicio + ", Hora: " + hora;
    }
}

public class GestionPeluqueria {
    private final ArrayList<ServicioPeluqueria> servicios;
    private final ArrayList<Cita> citas;

    public GestionPeluqueria() {
        servicios = new ArrayList<>();
        citas = new ArrayList<>();
    }

    public void agregarServicio(String nombre, double precio) {
        ServicioPeluqueria nuevoServicio = new ServicioPeluqueria(nombre, precio);
        servicios.add(nuevoServicio);
        System.out.println("Servicio agregado: " + nuevoServicio);
    }

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

    public void programarCita(String cliente, String servicio, String hora) {
        Cita nuevaCita = new Cita(cliente, servicio, hora);
        citas.add(nuevaCita);
        System.out.println("Cita programada exitosamente: " + nuevaCita);
    }

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

    public static void main(String[] args) {
        GestionPeluqueria gestionPeluqueria = new GestionPeluqueria();
        Scanner scanner = new Scanner(System.in);

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
}