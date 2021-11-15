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
    public void addAtPosPrueba1() {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("M", "A", "B");
        listaActual.addAtPos("M",1);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addAtPosPrueba2")
    @Test
    public void addAtPosPrueba2() {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "A", "B");
        listaActual.addAtPos("A",1);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addAtPosPrueba3")
    @Test
    public void addAtPosPrueba3() {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("Z", "A", "B");
        listaActual.addAtPos("Z",1);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addAtPosPrueba4")
    @Test
    public void addAtPosPrueba4() {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("B", "A", "B");
        listaActual.addAtPos("B",1);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addAtPosPrueba5")
    @Test
    public void addAtPosPrueba5() {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("Y", "A", "B");
        listaActual.addAtPos("Y",1);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addAtPosPrueba6")
    @Test
    public void addAtPosPrueba6() {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B");
        listaActual.addAtPos("@",1);
        assertIterableEquals(listaEsperada, listaActual);
    }
    @DisplayName("addAtPosPrueba7")
    @Test
    public void addAtPosPrueba7() {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B");
        listaActual.addAtPos("[",1);
        assertIterableEquals(listaEsperada, listaActual);
    }
    @DisplayName("addAtPosPrueba8")
    @Test
    void addAtPosPrueba8() {
        assertThrows(IllegalArgumentException.class, () -> listaActual.addAtPos("S", 0));
    }

    @DisplayName("addAtPosPrueba9")
    @Test
    public void addAtPosPrueba9() {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("S", "A", "B");
        listaActual.addAtPos("S",1);
        assertIterableEquals(listaEsperada, listaActual);
    }
    @DisplayName("addAtPosPrueba10")
    @Test
    public void addAtPosPrueb10() {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "S", "B");
        listaActual.addAtPos("S",2);
        assertIterableEquals(listaEsperada, listaActual);
    }


    //Pruebas addFirst (T element) ---------------------------------------------------------------------------------------

    @DisplayName("addFirstPrueba1")
    @Test
    public void addFirstPrueba1(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("M", "A", "B");
        listaActual.addFirst("M");
        assertIterableEquals(listaEsperada, listaActual);


    }

    @DisplayName("addFirstPrueba2")
    @Test
    public void addFirstPrueba2(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "A", "B");
        listaActual.addFirst("A");
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addFirstPrueba3")
    @Test
    public void addFirstPrueba3(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("Z", "A", "B");
        listaActual.addFirst("Z");
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addFirstPrueba4")
    @Test
    public void addFirstPrueba4(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("B", "A", "B");
        listaActual.addFirst("B");
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addFirstPrueba5")
    @Test
    public void addFirstPrueba5(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("Y", "A", "B");
        listaActual.addFirst("Y");
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addFirstPrueba6")
    @Test
    public void addFirstPrueba6(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B");
        listaActual.addFirst("@");
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addFirstPrueba7")
    @Test
    public void addFirstPrueba7(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B");
        listaActual.addFirst("[");
        assertIterableEquals(listaEsperada, listaActual);
    }

    //Pruebas addLast (T element) ----------------------------------------------------------------------------------------

    @DisplayName("addLastPrueba1")
    @Test

    public void addLastPrueba1(  ) {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "M");
        listaActual.addLast("M");
        assertIterableEquals(listaEsperada, listaActual);

    }

    @DisplayName("addLastPrueba2")
    @Test
    public void addLastPrueba2(  ){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "A");
        listaActual.addLast("A");
        assertIterableEquals(listaEsperada,listaActual);

    }

    @DisplayName("addLastPrueba3")
    @Test
    public void addLastPrueba3(  ){
        SingleLinkedListImpl<String> listaEsperada= new SingleLinkedListImpl<>("A", "B", "Z");
        listaActual.addLast("Z");
        assertIterableEquals(listaEsperada,listaActual);

    }

    @DisplayName("addLastPrueba4")
    @Test
    public void addLastPrueba4(  ){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "B");
        listaActual.addLast("B");
        assertIterableEquals(listaEsperada,listaActual);

    }

    @DisplayName("addLastPrueba5")
    @Test
    public void addLastPrueba5(  ){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "Y");
        listaActual.addLast("Y");
        assertIterableEquals(listaEsperada,listaActual);

    }

    @DisplayName("addLastPrueba6")
    @Test
    public void addLastPrueba6(  ){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B");
        listaActual.addLast("@");
        assertIterableEquals(listaEsperada,listaActual);

    }

    @DisplayName("addLastPrueba7")
    @Test
    public void addLastPrueba7(  ){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B");
        listaActual.addLast("[");
        assertIterableEquals(listaEsperada,listaActual);

    }

    //Pruebas addNTimes(T element, int p) ---------------------------------------------------------------------------------------

    @DisplayName("addNTimesPueba1")
    @Test
    public void addNTimesPrueba1(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "M");
        listaActual.addNTimes("M", 1);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addNTimesPueba2")
    @Test
    public void addNTimesPrueba2(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "A");
        listaActual.addNTimes("A", 1);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addNTimesPueba3")
    @Test
    public void addNTimesPrueba3(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "Z");
        listaActual.addNTimes("Z", 1);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addNTimesPueba4")
    @Test
    public void addNTimesPrueba4(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "B");
        listaActual.addNTimes("B", 1);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addNTimesPueba5")
    @Test
    public void addNTimesPrueba5(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "Y");
        listaActual.addNTimes("Y", 1);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addNTimesPueba6")
    @Test
    public void addNTimesPrueba6(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B");
        listaActual.addNTimes("@", 1);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addNTimesPueba7")
    @Test
    public void addNTimesPrueba7(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B");
        listaActual.addNTimes("[", 1);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addNTimesPueba8")
    @Test
    public void addNTimesPrueba8(){
        assertThrows(IllegalArgumentException.class, () -> listaActual.addNTimes("S", -1));
    }

    @DisplayName("addNTimesPueba9")
    @Test
    public void addNTimesPrueba9(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B");
        listaActual.addNTimes("S", 0);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addNTimesPueba10")
    @Test
    public void addNTimesPrueba10(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "S");
        listaActual.addNTimes("S", 1);
        assertIterableEquals(listaEsperada, listaActual);
    }

}