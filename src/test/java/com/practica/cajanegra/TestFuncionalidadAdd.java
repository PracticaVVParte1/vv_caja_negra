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
        assertThrows(IllegalArgumentException.class, () -> listaActual.addAtPos("M", 0));
    }
    @DisplayName("addAtPosPrueba9")
    @Test
    void addAtPosPrueba9() {
        assertThrows(IllegalArgumentException.class, () -> listaActual.addAtPos("A", 0));
    }
    @DisplayName("addAtPosPrueba10")
    @Test
    void addAtPosPrueba10() {
        assertThrows(IllegalArgumentException.class, () -> listaActual.addAtPos("Z", 0));
    }
    @DisplayName("addAtPosPrueba11")
    @Test
    void addAtPosPrueba11() {
        assertThrows(IllegalArgumentException.class, () -> listaActual.addAtPos("Y", 0));
    }
    @DisplayName("addAtPosPrueba12")
    @Test
    void addAtPosPrueba12() {
        assertThrows(IllegalArgumentException.class, () -> listaActual.addAtPos("B", 0));
    }
    @DisplayName("addAtPosPrueba13")
    @Test
    void addAtPosPrueba13() {
        assertThrows(IllegalArgumentException.class, () -> listaActual.addAtPos("@", 0));
    }
    @DisplayName("addAtPosPrueba14")
    @Test
    void addAtPosPrueba14() {
        assertThrows(IllegalArgumentException.class, () -> listaActual.addAtPos("[", 0));
    }
    @DisplayName("addAtPosPrueba15")
    @Test
    public void addAtPosPrueba15() {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "M", "B");
        listaActual.addAtPos("M",2);
        assertIterableEquals(listaEsperada, listaActual);
    }
    @DisplayName("addAtPosPrueba16")
    @Test
    public void addAtPosPrueb16() {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "A", "B");
        listaActual.addAtPos("A",2);
        assertIterableEquals(listaEsperada, listaActual);
    }
    @DisplayName("addAtPosPrueba17")
    @Test
    public void addAtPosPrueba17() {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "Z", "B");
        listaActual.addAtPos("Z",2);
        assertIterableEquals(listaEsperada, listaActual);
    }
    @DisplayName("addAtPosPrueba18")
    @Test
    public void addAtPosPrueba18() {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "Y", "B");
        listaActual.addAtPos("Y",2);
        assertIterableEquals(listaEsperada, listaActual);
    }
    @DisplayName("addAtPosPrueba19")
    @Test
    public void addAtPosPrueba19() {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "B");
        listaActual.addAtPos("B",2);
        assertIterableEquals(listaEsperada, listaActual);
    }
    @DisplayName("addAtPosPrueba20")
    @Test
    public void addAtPosPrueba20() {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B");
        listaActual.addAtPos("@",2);
        assertIterableEquals(listaEsperada, listaActual);
    }
    @DisplayName("addAtPosPrueba21")
    @Test
    public void addAtPosPrueba21() {
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B");
        listaActual.addAtPos("[",2);
        assertIterableEquals(listaEsperada, listaActual);
    }

    //Pruebas addFirst (T element) ---------------------------------------------------------------------------------------

    @DisplayName("addFisrtPrueba1")
    @Test
    public void addFisrtPrueba1(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("M", "A", "B");
        listaActual.addFirst("M");
        assertIterableEquals(listaEsperada, listaActual);

    }

    @DisplayName("addFisrtPrueba2")
    @Test
    public void addFisrtPrueba2(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "A", "B");
        listaActual.addFirst("A");
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addFisrtPrueba3")
    @Test
    public void addFisrtPrueba3(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("Z", "A", "B");
        listaActual.addFirst("Z");
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addFisrtPrueba4")
    @Test
    public void addFisrtPrueba4(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("B", "A", "B");
        listaActual.addFirst("B");
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addFisrtPrueba5")
    @Test
    public void addFisrtPrueba5(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("Y", "A", "B");
        listaActual.addFirst("Y");
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addFisrtPrueba6")
    @Test
    public void addFisrtPrueba6(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B");
        listaActual.addFirst("@");
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addFisrtPrueba7")
    @Test
    public void addFisrtPrueba7(){
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
        assertThrows(IllegalArgumentException.class, () -> listaActual.addNTimes("M", 0));
    }

    @DisplayName("addNTimesPueba9")
    @Test
    public void addNTimesPrueba9(){
        assertThrows(IllegalArgumentException.class, () -> listaActual.addNTimes("A", 0));
    }

    @DisplayName("addNTimesPueba10")
    @Test
    public void addNTimesPrueba10(){
        assertThrows(IllegalArgumentException.class, () -> listaActual.addNTimes("Z", 0));
    }

    @DisplayName("addNTimesPueba11")
    @Test
    public void addNTimesPrueba11(){
        assertThrows(IllegalArgumentException.class, () -> listaActual.addNTimes("B", 0));
    }

    @DisplayName("addNTimesPueba12")
    @Test
    public void addNTimesPrueba12(){
        assertThrows(IllegalArgumentException.class, () -> listaActual.addNTimes("Y", 0));
    }

    @DisplayName("addNTimesPueba13")
    @Test
    public void addNTimesPrueba13(){
        assertThrows(IllegalArgumentException.class, () -> listaActual.addNTimes("@", 0));
    }

    @DisplayName("addNTimesPueba14")
    @Test
    public void addNTimesPrueba14(){
        assertThrows(IllegalArgumentException.class, () -> listaActual.addNTimes("[", 0));
    }

    @DisplayName("addNTimesPueba15")
    @Test
    public void addNTimesPrueba15(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "M", "M");
        listaActual.addNTimes("M", 2);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addNTimesPueba16")
    @Test
    public void addNTimesPrueba16(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "A", "A");
        listaActual.addNTimes("A", 2);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addNTimesPueba17")
    @Test
    public void addNTimesPrueba17(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "Z", "Z");
        listaActual.addNTimes("Z", 2);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addNTimesPueba18")
    @Test
    public void addNTimesPrueba18(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "B", "B");
        listaActual.addNTimes("B", 2);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addNTimesPueba19")
    @Test
    public void addNTimesPrueba19(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B", "Y", "Y");
        listaActual.addNTimes("Y", 2);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addNTimesPueba20")
    @Test
    public void addNTimesPrueba20(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B");
        listaActual.addNTimes("@", 2);
        assertIterableEquals(listaEsperada, listaActual);
    }

    @DisplayName("addNTimesPueba21")
    @Test
    public void addNTimesPrueba21(){
        SingleLinkedListImpl<String> listaEsperada = new SingleLinkedListImpl<>("A", "B");
        listaActual.addNTimes("[", 2);
        assertIterableEquals(listaEsperada, listaActual);
    }
}
