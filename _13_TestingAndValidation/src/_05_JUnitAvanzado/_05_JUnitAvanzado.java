package _13_TestingAndValidation.src._05_JUnitAvanzado;
/*
// Ejemplo avanzado con setup/teardown y manejo de excepciones
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class _05_JUnitAvanzado {
    private int[] numeros;

    @Before
    public void setUp() {
        numeros = new int[]{1, 2, 3, 4, 5};
    }

    @After
    public void tearDown() {
        numeros = null;
    }

    public int maximo(int[] arr) {
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        return max;
    }

    @Test
    public void testMaximo() {
        assertEquals(5, maximo(numeros));
    }

    @Test(expected = NullPointerException.class)
    public void testMaximoNulo() {
        maximo(null);
    }
}
*/
