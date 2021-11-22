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

public class    TestFuncionalidadGet {

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

    @DisplayName("getAtPosPrueba1")
    @Test
    public void getAtPosPrueba1(  ){ //GAPP1
        String a = listaActual.getAtPos(listaActual.size()/2 + 1);
        assertEquals("C",a);
    }

    @DisplayName("getAtPosPrueba2")
    @Test
    public void getAtPosPrueba2(  ){ //GAPP2
        String a = listaActual.getAtPos(1);
        assertEquals("A",a);
    }

    @DisplayName("getAtPosPrueba3")
    @Test
    public void getAtPosPrueba3(  ){ //GAPP3
        String a = listaActual.getAtPos(listaActual.size());
        assertEquals("E",a);
    }

    @DisplayName("getAtPosPrueba4")
    @Test
    public void getAtPosPrueba4(  ){ //GAPP4
        String a = listaActual.getAtPos(2);
        assertEquals("B",a);
    }

    @DisplayName("getAtPosPrueba5")
    @Test
    public void getAtPosPrueba5(  ){ //GAPP5
        String a = listaActual.getAtPos(listaActual.size()-1);
        assertEquals("D",a);
    }

    @DisplayName("getAtPosPrueba6")
    @Test
    public void getAtPosPrueba6(  ){ //GAPP6
        assertThrows(IllegalArgumentException.class, () -> listaActual.getAtPos(0));
    }

    @DisplayName("getAtPosPrueba7")
    @Test
    public void getAtPosPrueba7(  ) { //GAPP7
        assertThrows(IllegalArgumentException.class, () -> listaActual.getAtPos(listaActual.size() + 1));
    }
}