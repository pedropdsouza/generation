import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculadoraTest{

    @Test
    fun somaTest(){
        assertEquals(11, Calculadora.soma(5, 6))
    }

    @Test
    fun subTest(){
        assertEquals(5, Calculadora.sub(10, 5))
    }

    @Test
    fun multTest(){
        assertEquals(9, Calculadora.mult(3, 3))
    }

    @Test
    fun divisaoTest(){
        assertEquals(10, Calculadora.divisao(20.0, 2.0))
    }

    @Test
    fun potenciaTest(){
        assertEquals(16, Calculadora.potencia(4.0, 2.0))
    }

    @Test
    fun raizQuadradaTest(){
        assertEquals(3, Calculadora.raizQuadrada(9.0))
    }

}