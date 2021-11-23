package com.practica.cajanegra;

/*  En esta clase se encuentran las pruebas de los métodos que tienen la funcionalidad
    de añadir elementos a la lista. Estos métodos son:
    -addAtPos(T element, int p)
    -addFirst (T element)
    -addLast (T element)
    -addNTimes(T element, int p)
 */

import com.cajanegra.SingleLinkedListImpl;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFuncionalidadAdd {

    private final SingleLinkedListImpl<String> listaActual = new SingleLinkedListImpl<>("A", "B");

    @BeforeAll
    static void setup() {
        System.out.println("Comienzo de la ejecucion de las pruebas de los métodos de la clase TestFuncionalidadAdd...");
    }

    @AfterAll
    static void done() {
        System.out.println("Fin de la ejecucion de la pruebas de la clase TestFuncionalidadAdd.");
    }

    //Pruebas addAtPos(T element, int p) ---------------------------------------------------------------------------------------

    @DisplayName("addAtPosPrueba1")
    @Test
    public void addAtPosPrueba1() { //ATPP1
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("M", "A", "B");
        listaActual.addAtPos("M",1);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addAtPosPrueba2")
    @Test
    public void addAtPosPrueba2() { //ATPP2
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "A", "B");
        listaActual.addAtPos("A",1);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addAtPosPrueba3")
    @Test
    public void addAtPosPrueba3() { //ATPP3
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("Z", "A", "B");
        listaActual.addAtPos("Z",1);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addAtPosPrueba4")
    @Test
    public void addAtPosPrueba4() { //ATPP4
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("B", "A", "B");
        listaActual.addAtPos("B",1);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addAtPosPrueba5")
    @Test
    public void addAtPosPrueba5() { //ATPP5
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("Y", "A", "B");
        listaActual.addAtPos("Y",1);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addAtPosPrueba6")
    @Test
    public void addAtPosPrueba6() { //ATPP6
        assertThrows(IllegalArgumentException.class, () -> listaActual.addAtPos("@",1));
    }
    @DisplayName("addAtPosPrueba7")
    @Test
    public void addAtPosPrueba7() { //ATPP7
        assertThrows(IllegalArgumentException.class, () -> listaActual.addAtPos("[",1));
    }
    @DisplayName("addAtPosPrueba8")
    @Test
    public void addAtPosPrueba8() { //ATPP8
        assertThrows(IllegalArgumentException.class, () -> listaActual.addAtPos("S", 0));
    }

    @DisplayName("addAtPosPrueba9")
    @Test
    public void addAtPosPrueba9() { //ATPP9
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("S", "A", "B");
        listaActual.addAtPos("S",1);
        assertIterableEquals(listaEsperada, listaActual);
    }
    @DisplayName("addAtPosPrueba10")
    @Test
    public void addAtPosPrueb10() { //ATPP10
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "S", "B");
        listaActual.addAtPos("S",2);
        assertIterableEquals(listaEsperada, listaActual);
    }


    //Pruebas addFirst (T element) ---------------------------------------------------------------------------------------

    @DisplayName("addFirstPrueba1")
    @Test
    public void addFirstPrueba1(){ //AFP1
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("M", "A", "B");
        listaActual.addFirst("M");
        assertIterableEquals(listaEsperada, listaActual);


    }

    @DisplayName("addFirstPrueba2")
    @Test
    public void addFirstPrueba2(){ //AFP2
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "A", "B");
        listaActual.addFirst("A");
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addFirstPrueba3")
    @Test
    public void addFirstPrueba3(){ //AFP3
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("Z", "A", "B");
        listaActual.addFirst("Z");
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addFirstPrueba4")
    @Test
    public void addFirstPrueba4(){ //AFP4
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("B", "A", "B");
        listaActual.addFirst("B");
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addFirstPrueba5")
    @Test
    public void addFirstPrueba5(){ //AFP5
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("Y", "A", "B");
        listaActual.addFirst("Y");
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addFirstPrueba6")
    @Test
    public void addFirstPrueba6(){ //AFP6
        assertThrows(IllegalArgumentException.class, () -> listaActual.addFirst("@"));
    }

    @DisplayName("addFirstPrueba7")
    @Test
    public void addFirstPrueba7(){ //AFP7
        assertThrows(IllegalArgumentException.class, () -> listaActual.addFirst("["));
    }

    //Pruebas addLast (T element) ----------------------------------------------------------------------------------------

    @DisplayName("addLastPrueba1")
    @Test

    public void addLastPrueba1(  ) { //ALP1
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "M");
        listaActual.addLast("M");
        assertIterableEquals(listaEsperada, listaActual);

    }

    @DisplayName("addLastPrueba2")
    @Test
    public void addLastPrueba2(  ){ //ALP2
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "A");
        listaActual.addLast("A");
        assertIterableEquals(listaEsperada,listaActual);

    }

    @DisplayName("addLastPrueba3")
    @Test
    public void addLastPrueba3(  ){ //ALP3
        SingleLinkedListImpl<String> listaEsperada= new SingleLinkedListImpl<>("A", "B", "Z");
        listaActual.addLast("Z");
        assertIterableEquals(listaEsperada,listaActual);

    }

    @DisplayName("addLastPrueba4")
    @Test
    public void addLastPrueba4(  ){ //ALP4
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "B");
        listaActual.addLast("B");
        assertIterableEquals(listaEsperada,listaActual);

    }

    @DisplayName("addLastPrueba5")
    @Test
    public void addLastPrueba5(  ){ //ALP5
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "Y");
        listaActual.addLast("Y");
        assertIterableEquals(listaEsperada,listaActual);

    }

    @DisplayName("addLastPrueba6")
    @Test
    public void addLastPrueba6(  ){ //ALP6
        assertThrows(IllegalArgumentException.class, () -> listaActual.addLast("@"));

    }

    @DisplayName("addLastPrueba7")
    @Test
    public void addLastPrueba7(  ){ //ALP7
        assertThrows(IllegalArgumentException.class, () -> listaActual.addLast("["));

    }

    //Pruebas addNTimes(T element, int p) ---------------------------------------------------------------------------------------

    @DisplayName("addNTimesPueba1")
    @Test
    public void addNTimesPrueba1(){ //ANTP1
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "M");
        listaActual.addNTimes("M", 1);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addNTimesPueba2")
    @Test
    public void addNTimesPrueba2(){ //ANTP2
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "A");
        listaActual.addNTimes("A", 1);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addNTimesPueba3")
    @Test
    public void addNTimesPrueba3(){ //ANTP3
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "Z");
        listaActual.addNTimes("Z", 1);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addNTimesPueba4")
    @Test
    public void addNTimesPrueba4(){ //ANTP4
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "B");
        listaActual.addNTimes("B", 1);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addNTimesPueba5")
    @Test
    public void addNTimesPrueba5(){ //ANTP5
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "Y");
        listaActual.addNTimes("Y", 1);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addNTimesPueba6")
    @Test
    public void addNTimesPrueba6(){ //ANTP6
        assertThrows(IllegalArgumentException.class, () -> listaActual.addNTimes("@", 1));
    }

    @DisplayName("addNTimesPueba7")
    @Test
    public void addNTimesPrueba7(){ //ANTP7
        assertThrows(IllegalArgumentException.class, () -> listaActual.addNTimes("[", 1));
    }

    @DisplayName("addNTimesPueba8")
    @Test
    public void addNTimesPrueba8(){ //ANTP8
        assertThrows(IllegalArgumentException.class, () -> listaActual.addNTimes("S", -1));
    }

    @DisplayName("addNTimesPueba9")
    @Test
    public void addNTimesPrueba9(){ //ANTP9
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B");
        listaActual.addNTimes("S", 0);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addNTimesPueba10")
    @Test
    public void addNTimesPrueba10(){ //ANTP10
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "S");
        listaActual.addNTimes("S", 1);
        assertIterableEquals(listaEsperada, listaActual);
    }
}