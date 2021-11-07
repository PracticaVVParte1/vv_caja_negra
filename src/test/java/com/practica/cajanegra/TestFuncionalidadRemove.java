package com.practica.cajanegra;

/*  En esta clase se encuentran las pruebas de los métodos que tienen la funcionalidad
    de elminiar un elemento de la lista. Estos métodos son:
    -removeLast()
    -removeLast(T elem)
 */

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class TestFuncionalidadRemove {

    private final SingleLinkedListImpl<String> listaActual = new SingleLinkedListImpl<>("A", "B");
    private final SingleLinkedListImpl<String> listaVacia = new SingleLinkedListImpl<>();
    private final SingleLinkedListImpl<String> listaUnElemeto = new SingleLinkedListImpl<>("A");

    private final SingleLinkedListImpl<String> listaActualM = new SingleLinkedListImpl<>("M","M","A","A","Z","Z","B","B","Y","Y");

    @BeforeAll
    static void setup() {
        System.out.println("Comienzo de la ejecucion de las pruebas de los métodos de la clase TestFuncionalidadRemove...");
    }

    @AfterAll
    static void done() {
        System.out.println("Fin de la ejecucion de la pruebas de la clase TestFuncionalidadRemove.");
    }

    //Pruebas removeLast() ---------------------------------------------------------------------------------------

    @DisplayName("pruebaRemoveLast1()")
    @Test
    public void pruebaRemoveLastVacio1()  {
        assertThrows(EmptyCollectionException.class, listaVacia::removeLast);
    }

    @DisplayName("pruebaRemoveLast2()")
    @Test
    public void pruebaRemoveLastVacio2() throws EmptyCollectionException {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>();
        listaUnElemeto.removeLast();
        assertIterableEquals(listaUnElemeto, listaEsperada);
    }

    @DisplayName("pruebaRemoveLast3()")
    @Test
    public void pruebaRemoveLastVacio3() throws EmptyCollectionException {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A");
        listaActual.removeLast();
        assertIterableEquals(listaActual, listaEsperada);
    }

    //Pruebas removeLast(T elem) ---------------------------------------------------------------------------------------

    @DisplayName("pruebaRemoveLast1(T elem)")
    @Test
    public void removeLastPrueba1() throws EmptyCollectionException, NoSuchElementException {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("M","A","A","Z","Z","B","B","Y","Y","@","@","[","[");
        listaActualM.removeLast("M");
        assertIterableEquals(listaEsperada, listaActualM);
    }
    @DisplayName("pruebaRemoveLast2(T elem)")
    @Test
    public void removeLastPrueba2() throws EmptyCollectionException, NoSuchElementException {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("M","M","A","Z","Z","B","B","Y","Y","@","@","[","[");
        listaActualM.removeLast("A");
        assertIterableEquals(listaEsperada, listaActualM);
    }
    @DisplayName("pruebaRemoveLast3(T elem)")
    @Test
    public void removeLastPrueba3() throws EmptyCollectionException, NoSuchElementException {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("M","M","A","A","Z","B","B","Y","Y","@","@","[","[");
        listaActualM.removeLast("Z");
        assertIterableEquals(listaEsperada, listaActualM);
    }
    @DisplayName("pruebaRemoveLast4(T elem)")
    @Test
    public void removeLastPrueba4() throws EmptyCollectionException, NoSuchElementException {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("M","M","A","A","Z","Z","B","Y","Y","@","@","[","[");
        listaActualM.removeLast("B");
        assertIterableEquals(listaEsperada, listaActualM);
    }
    @DisplayName("pruebaRemoveLast5(T elem)")
    @Test
    public void removeLastPrueba5() throws EmptyCollectionException, NoSuchElementException {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("M","M","A","A","Z","Z","B","B","Y","@","@","[","[");
        listaActualM.removeLast("Y");
        assertIterableEquals(listaEsperada, listaActualM);
    }
    @DisplayName("pruebaRemoveLast6(T elem)")
    @Test
    public void removeLastPrueba6() throws EmptyCollectionException, NoSuchElementException {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("M","M","A","A","Z","Z","B","B","Y","Y","@","[","[");
        listaActualM.removeLast("@");
        assertIterableEquals(listaEsperada, listaActualM);
    }
    @DisplayName("pruebaRemoveLast7(T elem)")
    @Test
    public void removeLastPrueba7() throws EmptyCollectionException, NoSuchElementException {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("M","M","A","A","Z","Z","B","B","Y","Y","@","@","[");
        listaActualM.removeLast("[");
        assertIterableEquals(listaEsperada, listaActualM);
    }
}
