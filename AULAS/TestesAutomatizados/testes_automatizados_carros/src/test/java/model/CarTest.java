package model;

import org.example.model.Car;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class CarTest {

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
    public void startCar() {
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
    public void speedUpTest() {
        // Teste #5 - Deve acelerar corretamente um carro ligado
        Car car05 = new Car();
        car05.powerOn();
        car05.speedUp(10);
        Assert.assertEquals((Integer) 10, car05.getActualVelocity());
    }

    @Test
    public void speedUpTurnOffCar() {
        // Teste #6 - Não conseguir acelerar um carro desligado
        Car car06 = new Car();
        car06.speedUp(10);
        Assert.assertEquals((Integer) 0, car06.getActualVelocity());
    }

    @Test
    public void downZeroVelocity() {
        // Teste #7 - Não conseguir reduzir a velocidade de um carro ligado, abaixo de 0
        Car car07 = new Car();
        car07.powerOn();
        car07.speedUp(5);
        car07.breakCar(10);
        Assert.assertEquals((Integer) 5, car07.getActualVelocity());
        Assert.assertThrows(Exception.class, ()-> )
    }


}
