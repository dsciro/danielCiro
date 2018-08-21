package test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import montoEsc.montoEsc;

class montoEscTest {

	@Test
	void testNameUnidad() {
				// Step 1. instantiate the tested class using the constructor method
				montoEsc testedNameUnidad = new montoEsc();
				// Step 2. Create the expected value variable
				String expedValue = "uno";
				// Step 3. Obtain the actual value
				String actualValue = testedNameUnidad.nameUnidad(1);
				// Step 4. Compare the expected versus actual values
				assertEquals(actualValue, expedValue);
				
	}
	@Test
	void testNameDecena() {
				// Step 1. instantiate the tested class using the constructor method
				montoEsc testNameDecena = new montoEsc();
				// Step 2. Create the expected value variable
				String expedValue = "treinta y uno";
				// Step 3. Obtain the actual value
				String actualValue = testNameDecena.nameDecena(31);
				// Step 4. Compare the expected versus actual values
				assertEquals(actualValue, expedValue);
				
	}
	@Test
	void testNameCentena() {
				// Step 1. instantiate the tested class using the constructor method
				montoEsc testNameCentena = new montoEsc();
				// Step 2. Create the expected value variable
				String expedValue = "ciento dieciseis";
				// Step 3. Obtain the actual value
				String actualValue = testNameCentena.nameCentena(116);
				// Step 4. Compare the expected versus actual values
				assertEquals(actualValue, expedValue);
				
	}
	@Test
	void testNameMil() {
				// Step 1. instantiate the tested class using the constructor method
				montoEsc testNameMil = new montoEsc();
				// Step 2. Create the expected value variable
				String expedValue = "dos mil dos";
				// Step 3. Obtain the actual value
				String actualValue = testNameMil.nameMiles(2002);
				// Step 4. Compare the expected versus actual values
				assertEquals(actualValue, expedValue);
				
	}

}
