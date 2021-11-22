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

    @DisplayName("isEmptyPrueba1")
    @Test
    public void isEmptyPrueba1() {
        assertTrue(listaVacia.isEmpty());
    } //IEP1

    @DisplayName("isEmptyPrueba2")
    @Test
    public void isEmptyPrueba2() {
        assertFalse(listaUnElemeto.isEmpty());
    } //IEP2

    @DisplayName("isEmptyPrueba3")
    @Test
    public void isEmptyPrueba3()  {
        assertFalse(listaActual.isEmpty());
    } //IEP3

    //Pruebas reverse() ---------------------------------------------------------------------------------------

    @DisplayName("reversePrueba1")
    @Test
    public void reversePrueba1() { //RP1
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>();
        assertIterableEquals(listaVacia.reverse(), listaEsperada);
    }

    @DisplayName("reversePrueba2")
    @Test
    public void reversePrueba2() { //RP2
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A");
        assertIterableEquals(listaUnElemeto.reverse(), listaEsperada);
    }

    @DisplayName("reversePrueba3")
    @Test
    public void reversePrueba3() { //RP3
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("B", "A");
        assertIterableEquals( listaActual.reverse(), listaEsperada);
    }

    //Pruebas size() ---------------------------------------------------------------------------------------

    @DisplayName("sizePrueba1")
    @Test
    public void sizePrueba1(){
        assertEquals(listaVacia.size(), 0);
    } //SP1

    @DisplayName("pruebaSize2")
    @Test
    public void sizePrueba2(){
        assertEquals(listaUnElemeto.size(), 1);
    } //SP2

    @DisplayName("pruebaSize3")
    @Test
    public void sizePrueba3(){
        assertEquals(listaActual.size(), 2);
    } //SP3

    //Pruebas toString() ---------------------------------------------------------------------------------------

    @DisplayName("toStringPrueba1")
    @Test
    public void toStringPrueba1(){
        assertEquals(listaVacia.toString(), "[]");
    } //TSP1

    @DisplayName("toStringPrueba2")
    @Test
    public void toStringPrueba2(){
        assertEquals(listaUnElemeto.toString(), "[A]");
    } //TSP2

    @DisplayName("toStringPrueba3")
    @Test
    public void toStringPrueba3(){
        assertEquals(listaActual.toString(), "[A, B]");
    } //TSP3
}