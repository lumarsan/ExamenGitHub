/*
 * Haz clic en nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para cambiar esta licencia
 * Haz clic en nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java para editar esta plantilla
 */
package com.mycompany.gestionpeluqueria;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis
 */
public class CitaTest {

    public CitaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getCliente method, of class Cita.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");

        // Crea una instancia de Cita con datos de ejemplo
        Cita instance = new Cita("Juan Pérez", "Corte de pelo", "12:00 PM");

        // Suponiendo que tienes un constructor en Cita que establece cliente, servicio y hora
        String expResult = "Juan Pérez";
        String result = instance.getCliente();

        // Comprueba si el resultado coincide con el valor esperado
        assertEquals(expResult, result);
    }

    /**
     * Test of getServicio method, of class Cita.
     */
    @Test
    public void testGetServicio() {
        System.out.println("getServicio");

        // Crea una instancia de Cita con datos de ejemplo
        Cita instance = new Cita("Juan Pérez", "Corte de pelo", "12:00 PM");

        // Suponiendo que tienes un constructor en Cita que establece cliente, servicio y hora
        String expResult = "Corte de pelo";
        String result = instance.getServicio();

        // Comprueba si el resultado coincide con el valor esperado
        assertEquals(expResult, result);
    }

    /**
     * Test of getHora method, of class Cita.
     */
    @Test
    public void testGetHora() {
        System.out.println("getHora");

        // Crea una instancia de Cita con datos de ejemplo
        Cita instance = new Cita("Juan Pérez", "Corte de pelo", "12:00 PM");

        // Suponiendo que tienes un constructor en Cita que establece cliente, servicio y hora
        String expResult = "12:00 PM";
        String result = instance.getHora();

        // Comprueba si el resultado coincide con el valor esperado
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Cita.
     */
    @Test
    public void testToString() {
        System.out.println("toString");

        // Crea una instancia de Cita con datos de ejemplo
        Cita instance = new Cita("Juan Pérez", "Corte de pelo", "12:00 PM");

        // Suponiendo que tienes una implementación adecuada de toString en Cita
        String expResult = "Cita{cliente='Juan Pérez', servicio='Corte de pelo', hora='12:00 PM'}";
        String result = instance.toString();

        // Comprueba si el resultado coincide con el valor esperado
        assertEquals(expResult, result);
    }
}
