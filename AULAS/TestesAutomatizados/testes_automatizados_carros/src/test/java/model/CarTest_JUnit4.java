package model;

import org.example.model.Car;
import org.junit.jupiter.api.Test;
//import org.junit.Assert;
//import org.junit.Test;


public class CarTest_JUnit4 {
/*

    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void startTurnOff() {
        // Teste #1 - Deve iniciar desligado
        Car car01 = new Car();
        Assert.assertFalse(car01.getActive());

    }

    @Test
    public void startZeroVelocity() {
        // Teste #2 - Deve iniciar com velocidade Zero
        Car car02 = new Car();
        Assert.assertEquals((Integer) 0, car02.getActualVelocity());
    }

    @Test
    public void startCar() throws Exception {
        // Teste #3 - Deve ligar corretamente
        Car car03 = new Car();
        car03.powerOn();
        Assert.assertTrue(car03.getActive());
    }

    @Test
    public void turnOffTest() {
        // Teste #4 - Deve desligar corretamente um carro ligado
        Car car04 = new Car();
        car04.powerOn();
        car04.powerOff();
        Assert.assertFalse(car04.getActive());
    }

    @Test
    public void speedUp() throws Exception {
        // Teste #5 - Deve acelerar corretamente um carro ligado
        Car car05 = new Car();
        car05.powerOn();
        car05.speedUp(10);
        Assert.assertEquals((Integer) 10, car05.getActualVelocity());
    }

    @Test
    public void maxVelocityLimit() throws Exception {
        // Given
        Car car = new Car(200);
        // When

        car.powerOn();
        car.speedUp(100);
        car.speedUp(100);
        car.speedUp(100);
        //Then
        Assert.assertEquals((Integer) 200, car.getActualVelocity());

    }

    @Test
    public void speedUpTurnOffCar() throws Exception {
        // Teste #6 - Não conseguir acelerar um carro desligado
        Car car06 = new Car();
        car06.speedUp(10);
        Assert.assertEquals((Integer) 0, car06.getActualVelocity());
    }

    @Test
    public void downZeroVelocity() throws Exception {
        // Teste #7 - Não conseguir reduzir a velocidade de um carro ligado, abaixo de 0
        Car car07 = new Car();
        car07.powerOn();
        car07.speedUp(5);
        car07.breakCar(10);
        Assert.assertEquals((Integer) 5, car07.getActualVelocity());
    }

    // 1
    @Test(expected = Exception.class)
    public void exceptionDownZeroVelocity_01() throws Exception {
        Car car = new Car();
        car.powerOn();
        car.speedUp(-10);
    }

    @Test
    public void createCarWithAllAtributes() {
        // public Car(String cor, String marca, String modelo, Integer velocidadeMaxima)
        Car car = new Car("Preto", "BMW", "X1", 350);

        errorCollector.checkThat(car.getColor(), CoreMatchers.is("Pret"));
        errorCollector.checkThat(car.getBrand(), CoreMatchers.is("BM"));
    }

    // 2
    @Test
    public void exceptionDownZeroVelocity_02() throws Exception {
        Car car = new Car();
        car.powerOn();

        expectedException.expect(Exception.class);
        expectedException.expectMessage("The additional velocity cannot be less than zero");

        car.speedUp(-10);
    }

    // 3
    @Test
    public void exceptionDownZeroVelocity_03() {
        Car car = new Car();
        car.powerOn();

        try {
            car.speedUp(-10);
            Assert.fail();
        } catch (Exception e) {
            Assert.assertEquals("The additional velocity cannot be less than zero", e.getMessage());
        }
    }


    @Test
    public void exceptionDownZeroVelocity_04() {
        // 4 - O método mais utilizado/recomendado para testar exceptions
        //  Junit >= 4.13 ou 5

        Car car = new Car();
        car.powerOn();

        Throwable throwable =                               // runnable
                Assert.assertThrows(Exception.class, () -> car.speedUp(-10));

        Assert.assertEquals("The additional velocity cannot be less than zero", throwable.getMessage());
    }

    @Test
    public void testeSemAssert() {
        //  Testes sem assert vão passar
    }

*/

}
