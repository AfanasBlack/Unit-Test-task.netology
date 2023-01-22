import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void fullArray() {
        Assertions.assertNotNull(Main.products);
        for (String product : Main.products) {
            Assertions.assertNotNull(product);
        }
        System.out.println("В массиве нет пустых значений");
    }

    @Test
    void sale3x2() {
        for (String productsSale : Main.productsOnSale) {
            for (String product : Main.products)
            if (product.equals(productsSale)) {
                Assertions.assertEquals(product, productsSale);
            }
        }
        System.out.println("Продукт по акции найден!");
    }

    @Test
    void arrayLength() {
        Assertions.assertEquals(Main.products.length, Main.prices.length);
        System.out.println("Массив продуктов и цен равен по длинне");
    }
}
