package com.practica.cajanegra;

/*  En esta clase se encuentran las pruebas de los métodos que tienen la funcionalidad
    de consultar sobre la lista. Estos métodos son:
    -indexOf(T elem)
    -isSubList(AbstractSingleLinkedListImpl<T> part)
 */

import com.cajanegra.SingleLinkedListImpl;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class TestFuncionalidadConsulta {

    private final SingleLinkedListImpl<String> listaActual = new SingleLinkedListImpl<>("A", "B", "C", "B", "A", "M", "M", "Z", "Z");

    @BeforeAll
    static void setup() {
        System.out.println("Comienzo de la ejecucion de las pruebas de los métodos de la clase TestFuncionalidadConsulta...");
    }

    @AfterAll
    static void done() {
        System.out.println("Fin de la ejecucion de la pruebas de la clase TestFuncionalidadConsulta.");
    }

    //Pruebas indexOf(T elem) ---------------------------------------------------------------------------------------

    @DisplayName("indexOfPrueba1")
    @Test
    public void indexOfPrueba1(  ){

        int a = listaActual.indexOf("M");

        assertEquals(6,a);

    }

    @DisplayName("indexOfPrueba2")
    @Test
    public void indexOfPrueba2(  ){

        int a = listaActual.indexOf("A");

        assertEquals(1,a);

    }

    @DisplayName("indexOfPrueba3")
    @Test
    public void indexOfPrueba3(  ){

        int a = listaActual.indexOf("Z");

        assertEquals(8,a);

    }

    @DisplayName("indexOfPrueba4")
    @Test
    public void indexOfPrueba4(  ){

        int a = listaActual.indexOf("B");

        assertEquals(2,a);

    }

    @DisplayName("indexOfPrueba5")
    @Test
    public void indexOfPrueba5(  ){

        assertThrows(NoSuchElementException.class, () -> listaActual.indexOf("Y"));

    }

    @DisplayName("pruebaIndexOf6")
    @Test
    public void pruebaIndexOf6(  ){

        assertThrows(IllegalArgumentException.class, () -> listaActual.indexOf("@"));

    }

    @DisplayName("pruebaIndexOf7")
    @Test
    public void pruebaIndexOf7(  ){
        assertThrows(IllegalArgumentException.class, () -> listaActual.indexOf("["));

    }
    //Pruebas isSubList(AbstractSingleLinkedListImpl<T> part) ---------------------------------------------------------------------------------------
}
