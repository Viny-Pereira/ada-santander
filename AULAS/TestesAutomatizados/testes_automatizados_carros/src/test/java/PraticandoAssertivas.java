import org.example.model.Car;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class PraticandoAssertivas {

    @Test
    public void praticandoAssertTrue() {
        boolean eMaiorDeIdade = true;

        Assert.assertTrue(eMaiorDeIdade);
    }

    @Test
    public void praticandoAssertFalse() {
        boolean foiReprovado = false;

        Assert.assertFalse(foiReprovado);
    }

    @Test
    public void praticandoAssertNull() {
        Car carro = null;

        Assert.assertNull(carro);
    }

    @Test
    public void praticandoAssertNotNull() {
        Car carro = new Car();

        Assert.assertNotNull(carro);
    }

    @Test
    public void praticandoAssertArraysEquals() {
        int[] nums1 = new int[]{1, 2 ,3};
        int[] nums2 = new int[]{1, 2, 3};

        Assert.assertArrayEquals(nums1, nums2);
    }

    @Test
    public void praticandoAssertEquals_primitivos() {
        int a = 1;
        int b = 1;

        Assert.assertEquals(a, b);

        char a1 = 'a';
        char b1 = 'a';

        Assert.assertEquals(a1, b1);

        Integer a2 = 1;
        Integer b2 = 1;

        Assert.assertEquals(a2, b2);

        Assert.assertEquals(Math.PI, 3.141592, 0.001);
    }

    @Test
    public void praticandoAssertEquals_objetos() {
        Car carro = new Car("preto", "fiat", "uno");
        Car carro2 = new Car("azul", "fiat", "uno");

        Assert.assertEquals(carro, carro2);
    }

    @Test
    public void praticandoAssertEquals_detalhe_nas_strings() {
        String nome01 = "pedro";
        String nome02 = new String("pedro");

        Assert.assertEquals(nome01, nome02);
    }

    @Test
    public void praticandoAssertNotEquals() {
        int a = 1;
        int b = 2;

        Assert.assertNotEquals(a, b);
    }

    // Trazer exemplos
    @Test
    public void assertSame() {
        Car carro = new Car();
        Car carro1 = carro;

        Assert.assertSame(carro, carro1);
    }

    @Test
    public void assertNotSame() {
        Car carro = new Car();
        Car carro1 = new Car();

        Assert.assertNotSame(carro, carro1);
    }

    // assertThat - verifique Que

    @Test
    public void praticandoAssertThat() {
        int a = 1;
        int b = 1;

        //     verifique que 'a' é igual a 'b'
        Assert.assertThat(a, is(equalTo(b))); // Matchers


        String s1 = "Pedro";
        String s2 = "Ana";

        Assert.assertThat(s1, is(not(s2)));

        Car carro = new Car();

        Assert.assertThat(carro, is(instanceOf(Car.class)));
    }
}