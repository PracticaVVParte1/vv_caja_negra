package com.practica.cajanegra;

/*  En esta clase se encuentran las pruebas de los métodos que tienen diversas funcionalidades.
    Estos métodos son:
    -isEmpty()
    -reverse()
    -size()
    -toString()
 */

import com.cajanegra.SingleLinkedListImpl;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFuncionalidadUtil {

    private final SingleLinkedListImpl<String> listaActual = new SingleLinkedListImpl<>("A", "B");
    private final SingleLinkedListImpl<String> listaVacia = new SingleLinkedListImpl<>();
    private final SingleLinkedListImpl<String> listaUnElemeto = new SingleLinkedListImpl<>("A");

    @BeforeAll
    static void setup() {
        System.out.println("Comienzo de la ejecucion de las pruebas de los métodos de la clase TestFuncionalidadUtil...");
    }

    @AfterAll
    static void done() {
        System.out.println("Fin de la ejecucion de la pruebas de la clase TestFuncionalidadUtil.");
    }

    //Pruebas isEmpty() ---------------------------------------------------------------------------------------

    @DisplayName("pruebaIsEmpty1")
    @Test
    public void pruebaIsEmpty1() {
        assertTrue(listaVacia.isEmpty());
    }

    @DisplayName("pruebaIsEmpty2")
    @Test
    public void pruebaIsEmpty2() {
        assertFalse(listaUnElemeto.isEmpty());
    }

    @DisplayName("pruebaIsEmpty3")
    @Test
    public void pruebaIsEmpty3()  {
        assertFalse(listaActual.isEmpty());
    }

    //Pruebas reverse() ---------------------------------------------------------------------------------------

    @DisplayName("pruebaReverse1")
    @Test
    public void pruebaReverse1() {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>();
        assertIterableEquals(listaVacia.reverse(), listaEsperada);
    }

    @DisplayName("pruebaReverse2")
    @Test
    public void pruebaReverse2() {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A");
        assertIterableEquals(listaUnElemeto.reverse(), listaEsperada);
    }

    @DisplayName("pruebaReverse3")
    @Test
    public void pruebaReverse3() {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("B", "A");
        assertIterableEquals( listaActual.reverse(), listaEsperada);
    }

    //Pruebas size() ---------------------------------------------------------------------------------------

    @DisplayName("pruebaSize1")
    @Test
    public void pruebaSize1(){
        assertEquals(listaVacia.size(), 0);
    }

    @DisplayName("pruebaSize2")
    @Test
    public void pruebaSize2(){
        assertEquals(listaUnElemeto.size(), 1);
    }

    @DisplayName("pruebaSize3")
    @Test
    public void pruebaSize3(){
        assertEquals(listaActual.size(), 2);
    }

    //Pruebas toString() ---------------------------------------------------------------------------------------

    @DisplayName("pruebaToString1")
    @Test
    public void pruebatoString1(){
        assertEquals(listaVacia.toString(), "[]");
    }

    @DisplayName("pruebaToString2")
    @Test
    public void pruebatoString2(){
        assertEquals(listaUnElemeto.toString(), "[A]");
    }

    @DisplayName("pruebaToString3")
    @Test
    public void pruebatoString3(){
        assertEquals(listaActual.toString(), "[A, B]");
    }
}
