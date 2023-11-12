package model;

import org.example.exception.SpeedUpNegativeException;
import org.example.exception.TurnOffCarWithVelocity;
import org.example.model.Car;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Annotations
 *
 * @Before // Junit 4 - Roda uma vez antes de cada teste
 * @BeforeEach // Junit 5
 * @BeforeClass // Junit 4 - Roda uma vez antes de TODOS os tests
 * @BeforeAll // Junit 5
 * @After // Junit 4 - Roda uma vez após cada teste
 * @AfterEach // Junit 5
 * @AfterClass // Junit 4 - Roda uma vez após TODOS os testes
 * @AfterAll // Junit 5
 * @Ignore // Junit 4 - Ignora um teste
 * @Disabled Novo:
 * @DisplayName // Junit 5
 * <p>
 * Assert // Junit 4
 * Assertion // Junit 5
 * <p>
 * fail - fail
 * assertTrue - assertTrue
 * assertSame - assertSame
 * assertNull - assertNull
 * assertNotSame - assertNotSame
 * assertNotNull - assertNotNull
 * assertFalse - assertFalse
 * assertEquals - assertEquals
 * assertArrayEquals - assertArrayEquals
 * assertThat - N/A
 * assertThrows (4.13) - assertThrows
 * <p>
 * Nova:
 * assertAll
 * assertThrows
 */
public class CarTest {

    // F.I.R.S.T - Principios
    // F - Fast
    // I - Isolado/Independente
    // R - Repetable
    // S - Self-validating
    // T - Oportuno (TDD)

    @BeforeAll
    public static void beforeClass() {
        System.out.println("roda uma vez antes de todos testes");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("roda uma vez depois de todos testes");
    }

    @BeforeEach
    public void before() {
        System.out.println("roda uma vez antes da cada teste");
    }

    @AfterEach
    public void after() {
        System.out.println("roda uma vez depois da cada teste");
    }


    @Test
    public void initializeCarByAllAtributes() {
        // public Carro(String cor, String marca, String modelo, Integer velocidadeMaxima)
        Car car = new Car("Black", "BMW", "X1", 350);

        assertAll("Testando atributos do carro",
                () -> assertEquals("Black", car.getColor()),
                () -> assertEquals("BMW", car.getBrand()),
                () -> assertEquals("X1", car.getModel()),
                () -> assertEquals(350, car.getMaxVelocity())
        );
    }

    @Test
    public void initializeCarWithoutMaxVelocity() {
        // public Carro(String cor, String marca, String modelo)
        Car car = new Car("Black", "BMW", "X1");

        assertAll("Testando atributos do carro",
                () -> assertEquals("Black", car.getColor()),
                () -> assertEquals("BMW", car.getBrand()),
                () -> assertEquals("X1", car.getModel()));
    }

    @Test
    public void newCarIsUnactive() {
        System.out.println("deveIniciarDesligado");
        // Given (Dado)
        Car car = new Car();
        // When (Quando)// Then (Então)
        assertFalse(car.getActive());
    }


    @Test
    //@Disabled // TODO
    public void carPowerOn() {
        System.out.println("deveLigarCorretamente");
        // Teste #3 - Deve ligar corretamente
        // Given (Dado)
        Car car = new Car();

        // When (Quando)
        car.powerOn();

        // Then (Então)
        assertTrue(car.getActive());
    }

    @Test
    public void carPowerOff() throws Exception {
        System.out.println("deveLigarCorretamente");
        // Teste #3 - Deve ligar corretamente
        // Given (Dado)
        Car car = new Car();

        // When (Quando)
        car.powerOn();
        car.powerOff();

        // Then (Então)
        assertFalse(car.getActive());
    }


    @Test
    public void speedUp() throws Exception {
        System.out.println("deveAcelerarCorretamente");
        // Teste #5 - Deve acelerar corretamente um carro ligado
        // Given (Dado)
        Car car = new Car();

        // When (Quando)
        car.powerOn();
        car.speedUp(10);

        // Then (Então)
        assertEquals((Integer) 10, car.getActualVelocity());
    }
    @Test
    public void breakACar() throws Exception {
        System.out.println("deveFreiarCorretamente");
        // Teste #5 - Deve freiar corretamente um carro ligado
        // Given (Dado)
        Car car = new Car();

        // When (Quando)
        car.powerOn();
        car.speedUp(10);
        car.breakCar(5);

        // Then (Então)
        assertEquals((Integer) 5, car.getActualVelocity());
    }
    @Test
    public void statusCar(){
        Car car = new Car();
        car.powerOn();
        String status = car.toString();
        System.out.println((status));
        assertEquals("active = true", status);
    }

    @Test
    public void lockACar() {
        // Given
        Car car = new Car();
        car.unLock();

        // When
        car.lock();

        // Then
        assertTrue(car.getLocked());
    }
    @Test
    public void unlockACar() {
        // Given
        Car car = new Car();
        car.powerOn();
        car.unLock();
        // Then
        assertFalse(car.getLocked());
    }

    @Test
    @DisplayName("Meu teste com nome bonito")
    public void turnOnWithZeroVelocity() {
        System.out.println("deveIniciarComVelocidadeZero");
        // Teste #2 - Deve iniciar com velocidade Zero
        // Given (Dado)
        Car car = new Car();
        // When (Quando)
        // Then (Então)
        assertEquals((Integer) 0, car.getActualVelocity());
    }

    @Test
    public void cannotExceedlimitOfVelocity() throws Exception {
        System.out.println("naoDeveUltrapassarAVelocidadeMaxima");
        // Teste #6 - Não pode ultrapassar a velocidade maxima
        // Given
        Car car = new Car(200);

        // When
        car.powerOn();
        car.speedUp(100);
        car.speedUp(100);
        car.speedUp(100);

        // Then
        assertEquals((Integer) 200, car.getActualVelocity());
    }

    @Test
    public void cannotDownBelowZeroVelocity() throws Exception {
        System.out.println("naoDeveTerVelocidadeInferiorAZero");
        // Given
        Car car = new Car();
        car.powerOn();
        car.speedUp(100);

        // When
        car.breakCar(50);
        car.breakCar(51);

        // Then
        assertEquals((Integer) 0, car.getActualVelocity());
    }

    @Test
    public void throwsExceptionGiveSpeedUpNegative() {
        Car car = new Car();
        car.powerOn();

        Throwable throwable =                               // runnable
                Assertions.assertThrows(SpeedUpNegativeException.class, () -> car.speedUp(-10));

        assertEquals("The additional velocity cannot be less than zero", throwable.getMessage());
    }

    @Test
    public void testeSemAssert() {
        //  Testes sem assert vão passar
    }
    @Test
    public void lockACarLockedDoNothing() {
        // Given
        Car car = new Car();
        car.powerOn();

        // When
        car.lock();
        car.lock();

        // Then
        assertEquals(true, car.getLocked());
    }
    @Test
    public void unlockACarUnlockedDoNothing() {
        // Given
        Car car = new Car();
        car.powerOn();

        // When
        car.unLock();
        car.unLock();

        // Then
        assertEquals(false, car.getLocked());
    }

    @Test
    public void speedUpCarUnactive() throws Exception {
        Car car = new Car();
        car.speedUp(10);
        assertEquals(0, car.getActualVelocity());
    }
    @Test
    public void breakCarUnactive() throws Exception {
        Car car = new Car();
        car.breakCar(10);
        assertEquals(0, car.getActualVelocity());
    }
    @Test
    public void turnOffCarWithVelocity() throws Exception {
        Car car = new Car();
        car.powerOn();
        car.speedUp(10);
        Throwable throwable = Assertions.assertThrows(TurnOffCarWithVelocity.class, car::powerOff);
        assertEquals("Cannot turn off a car with velocity", throwable.getMessage());
    }
    @Test
    public void equalsTestCars(){
        Car car01 = new Car("Black", "BMW", "X1");
        Car car02 = new Car("Black", "BMW", "X1");
        assertEquals(car01, car02);
    }


}
