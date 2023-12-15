/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionpeluqueria;

/**
 *
 * @author Luis
 */
import org.junit.Test;

public class PerformanceTests {

    @Test
    public void testAgregarServiciosRendimiento() {
        GestionPeluqueria gestionPeluqueria = new GestionPeluqueria();

        // Medir el tiempo necesario para agregar 1000 servicios
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            gestionPeluqueria.agregarServicio("Servicio" + i, 10.0);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Tiempo para agregar 1000 servicios: " + (endTime - startTime) + " milisegundos");
    }


    @Test
    public void testProgramarCitasRendimiento() {
        GestionPeluqueria gestionPeluqueria = new GestionPeluqueria();

        // Agregar servicios para tener datos de prueba
        for (int i = 0; i < 1000; i++) {
            gestionPeluqueria.agregarServicio("Servicio" + i, 10.0);
        }

        // Medir el tiempo necesario para programar 1000 citas
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            gestionPeluqueria.programarCita("Cliente" + i, "Servicio" + i, "10:00 AM");
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Tiempo para programar 1000 citas: " + (endTime - startTime) + " milisegundos");
    }
}
