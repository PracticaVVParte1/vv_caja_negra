package com.practica.cajanegra;

/*  En esta clase se encuentran las pruebas de los métodos que tienen la funcionalidad
    de elminiar un elemento de la lista. Estos métodos son:
    -removeLast()
    -removeLast(T elem)
 */

import com.cajanegra.SingleLinkedListImpl;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFuncionalidadRemove {

    private final SingleLinkedListImpl<String> listaActual = new SingleLinkedListImpl<>("A", "B");
    private final SingleLinkedListImpl<String> listaVacia = new SingleLinkedListImpl<>();
    private final SingleLinkedListImpl<String> listaUnElemeto = new SingleLinkedListImpl<>("A");

    //Pruebas removeLast() ---------------------------------------------------------------------------------------
    //Pruebas removeLast(T elem) ---------------------------------------------------------------------------------------

}
