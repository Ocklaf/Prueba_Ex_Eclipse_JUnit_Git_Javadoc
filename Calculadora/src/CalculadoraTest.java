import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora micalcu = new Calculadora(10, 20);
		assertEquals(micalcu.suma(), 30);
	}

	@Test
	public void testResta() {
		Calculadora micalcu = new Calculadora(30, 20);
		assertEquals(micalcu.resta(), 10);
	}

	@Test
	public void testMultiplica() {
		Calculadora micalcu = new Calculadora(10, 20);
		assertEquals(micalcu.multiplica(), 200);
	}

	@Test
	public void testDivide() {
		Calculadora micalcu = new Calculadora(10, 5);
		assertEquals(micalcu.divide(), 2);
	}

}
