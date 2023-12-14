/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
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
public class ServicioPeluqueriaTest {
    
    public ServicioPeluqueriaTest() {
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
     * Test of getNombre method, of class ServicioPeluqueria.
     */
    @Test
    public void testGetNombre() {
    System.out.println("getNombre");
    ServicioPeluqueria instance = new ServicioPeluqueria("Corte", 10.0);
    String expResult = "Corte"; //
    String result = instance.getNombre();
    assertEquals(expResult, result);
}


    /**
     * Test of getPrecio method, of class ServicioPeluqueria.
     */
    @Test
    public void testGetPrecio() {
    System.out.println("getPrecio");
    ServicioPeluqueria instance = new ServicioPeluqueria("Corte", 10.0);
    double expResult = 10.0;
    double result = instance.getPrecio();
    assertEquals(expResult, result, 0); 
}


    /**
     * Test of toString method, of class ServicioPeluqueria.
     */
    @Test
public void testToString() {
    System.out.println("toString");
    ServicioPeluqueria instance = new ServicioPeluqueria("Corte", 10.0);
    String expResult = "Servicio: Corte, Precio: $10.0";
    String result = instance.toString();
    assertEquals(expResult, result);
}

    
}
