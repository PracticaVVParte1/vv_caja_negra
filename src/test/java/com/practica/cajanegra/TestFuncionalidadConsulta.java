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

    private final SingleLinkedListImpl<String> listaActual = new SingleLinkedListImpl<>("A", "B", "C", "B", "A", "M", "M", "X", "Z");
    private final SingleLinkedListImpl<String> listaVacia = new SingleLinkedListImpl<>();
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

        assertEquals(9,a);

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

        assertThrows(NoSuchElementException.class, () -> listaActual.indexOf("@"));

    }

    @DisplayName("pruebaIndexOf7")
    @Test
    public void pruebaIndexOf7(  ){
        assertThrows(NoSuchElementException.class, () -> listaActual.indexOf("["));

    }
    //Pruebas isSubList(AbstractSingleLinkedListImpl<T> part) ---------------------------------------------------------------------------------------

    @DisplayName("pruebaIsSublist1")
    @Test
    public void pruebaIsSublist1(  ){

        assertEquals(listaActual.isSubList(listaVacia),0);

    }
    @DisplayName("pruebaIsSublist2")
    @Test
    public void pruebaIsSublist2(  ){

        SingleLinkedListImpl<String> sublista = new SingleLinkedListImpl<>("A", "B");
        assertEquals(listaActual.isSubList(sublista),1);

    }
    @DisplayName("pruebaIsSublist3")
    @Test
    public void pruebaIsSublist3(  ){

        SingleLinkedListImpl<String> sublista = new SingleLinkedListImpl<>("Z");
        assertEquals(listaActual.isSubList(sublista),9);

    }
    @DisplayName("pruebaIsSublist4")
    @Test
    public void pruebaIsSublist4(  ){

        SingleLinkedListImpl<String> sublista = new SingleLinkedListImpl<>("X", "Z");
        assertEquals(listaActual.isSubList(sublista),8);

    }
    @DisplayName("pruebaIsSublist5")
    @Test
    public void pruebaIsSublist5(  ){

        SingleLinkedListImpl<String> sublista = new SingleLinkedListImpl<>("B", "C", "B");
        assertEquals(listaActual.isSubList(sublista),2);

    }
    @DisplayName("pruebaIsSublist6")
    @Test
    public void pruebaIsSublist6(  ){

        SingleLinkedListImpl<String> sublista = new SingleLinkedListImpl<>("B", "C", "B", "A", "M");
        assertEquals(listaActual.isSubList(sublista),2);

    }
    @DisplayName("pruebaIsSublist7")
    @Test
    public void pruebaIsSublist7(  ){

        SingleLinkedListImpl<String> sublista = new SingleLinkedListImpl<>("B", "A", "Z");
        assertEquals(listaActual.isSubList(sublista),-1);

    }
}