package functional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EjerciciosTest {

    static Ejercicios ejercicios;

    @BeforeAll
    static void setUp() {
        ejercicios = new Ejercicios();
    }

    @Test
    void ejercicio1() {
        assertEquals(6, ejercicios.ejercicio1(List.of(1, 2, 3)));
    }

    @Test
    void ejercicio2() {
        assertEquals(List.of(2), ejercicios.ejercicio2(List.of(1, 2, 3)));
    }

    @Test
    void ejercicio3() {
        assertEquals(List.of("A", "B", "C"), ejercicios.ejercicio3(List.of("a", "b", "c")));
    }

    @Test
    void ejercicio4() {
        assertEquals(3, ejercicios.ejercicio4(List.of(1, 2, 3)));          ;
    }

    @Test
    void ejercicio5() {
        assertEquals(2, ejercicios.ejercicio5(List.of(1, 2, 3), 1));
    }

    @Test
    void ejercicio6() {
        assertEquals("ABC", ejercicios.ejercicio6(List.of("A", "B", "C")));
    }

    @Test
    void ejercicio7() {
        assertEquals(List.of(1, 4, 9), ejercicios.ejercicio7(List.of(1, 2, 3)));
    }

    @Test
    void ejercicio8() {
        assertEquals(List.of(1, 2, 3), ejercicios.ejercicio8(List.of(1, 2, 3, 1, 2, 3)));
    }

    @Test
    void ejercicio9() {
        assertEquals(2, ejercicios.ejercicio9(List.of(1, 2, 3), 1));
    }

    @Test
    void ejercicio10() {
        assertEquals(2, ejercicios.ejercicio10(List.of("A", "B", "AB", "C"), 'A'));
    }
}