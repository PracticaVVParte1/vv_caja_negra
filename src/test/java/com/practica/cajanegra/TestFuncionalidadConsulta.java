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
import static org.junit.jupiter.api.Assertions.*;

public class TestFuncionalidadConsulta {

    private final SingleLinkedListImpl<String> listaActual = new SingleLinkedListImpl<>("A", "B");
    private final SingleLinkedListImpl<String> listaVacia = new SingleLinkedListImpl<>();
    private final SingleLinkedListImpl<String> listaUnElemeto = new SingleLinkedListImpl<>("A");

    //Pruebas indexOf(T elem) ---------------------------------------------------------------------------------------
    //Pruebas isSubList(AbstractSingleLinkedListImpl<T> part) ---------------------------------------------------------------------------------------
}
