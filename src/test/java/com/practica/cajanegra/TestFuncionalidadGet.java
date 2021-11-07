package com.practica.cajanegra;

/*  En esta clase se encuentran las pruebas de los métodos que tienen la funcionalidad
    de obtener un elemento de la lista. Estos métodos son:
    -getAtPos(int pos)
 */

import com.cajanegra.SingleLinkedListImpl;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFuncionalidadGet {

    private final SingleLinkedListImpl<String> listaActual = new SingleLinkedListImpl<>("A", "B", "C", "D", "E");

    @BeforeAll
    static void setup() {
        System.out.println("Comienzo de la ejecucion de las pruebas de los métodos de la clase TestFuncionalidadGet...");
    }

    @AfterAll
    static void done() {
        System.out.println("Fin de la ejecucion de la pruebas de la clase TestFuncionalidadGet.");
    }

    //Pruebas getAtPos(int pos) ---------------------------------------------------------------------------------------

    @DisplayName("pruebaGetAtPos1")
    @Test
    public void pruebaGetAtPos1(  ){
        String a = listaActual.getAtPos(listaActual.size()/2 + 1);
        assertEquals("C",a);
    }

    @DisplayName("pruebaGetAtPos2")
    @Test
    public void pruebaGetAtPos2(  ){
        String a = listaActual.getAtPos(1);
        assertEquals("A",a);
    }

    @DisplayName("pruebaGetAtPos3")
    @Test
    public void pruebaGetAtPos3(  ){
        String a = listaActual.getAtPos(listaActual.size());
        assertEquals("E",a);
    }

    @DisplayName("pruebaGetAtPos4")
    @Test
    public void pruebaGetAtPos4(  ){
        String a = listaActual.getAtPos(2);
        assertEquals("B",a);
    }

    @DisplayName("pruebaGetAtPos5")
    @Test
    public void pruebaGetAtPos5(  ){
        String a = listaActual.getAtPos(listaActual.size()-1);
        assertEquals("D",a);
    }

    @DisplayName("pruebaGetAtPos6")
    @Test
    public void pruebaGetAtPos6(  ){
        assertThrows(IllegalArgumentException.class, () -> listaActual.getAtPos(0));
    }

    @DisplayName("pruebaGetAtPos7")
    @Test
    public void pruebaGetAtPos7(  ) {
        assertThrows(IllegalArgumentException.class, () -> listaActual.getAtPos(listaActual.size() + 1));
    }
}
