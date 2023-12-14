/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.gestionpeluqueria;

import java.util.List;
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
public class GestionPeluqueriaTest {
    
    public GestionPeluqueriaTest() {
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
     * Test of getServicios method, of class GestionPeluqueria.
     */
    @Test
    public void testGetServicios() {
        System.out.println("getServicios");
        GestionPeluqueria instance = new GestionPeluqueria();
        List<ServicioPeluqueria> expResult = null;
        List<ServicioPeluqueria> result = instance.getServicios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarServicio method, of class GestionPeluqueria.
     */
    @Test
    public void testAgregarServicio() {
        System.out.println("agregarServicio");
        String nombre = "";
        double precio = 0.0;
        GestionPeluqueria instance = new GestionPeluqueria();
        instance.agregarServicio(nombre, precio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarServicios method, of class GestionPeluqueria.
     */
    @Test
    public void testMostrarServicios() {
        System.out.println("mostrarServicios");
        GestionPeluqueria instance = new GestionPeluqueria();
        instance.mostrarServicios();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of programarCita method, of class GestionPeluqueria.
     */
    @Test
    public void testProgramarCita() {
        System.out.println("programarCita");
        String cliente = "";
        String servicio = "";
        String hora = "";
        GestionPeluqueria instance = new GestionPeluqueria();
        instance.programarCita(cliente, servicio, hora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarCitas method, of class GestionPeluqueria.
     */
    @Test
    public void testMostrarCitas() {
        System.out.println("mostrarCitas");
        GestionPeluqueria instance = new GestionPeluqueria();
        instance.mostrarCitas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class GestionPeluqueria.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GestionPeluqueria.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
