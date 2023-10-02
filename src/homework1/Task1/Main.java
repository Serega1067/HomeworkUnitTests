package homework1.Task1;

import static org.assertj.core.api.Assertions.*;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");

//        assertThat(calculateDiscount(100, 10)).isEqualTo(50);

        assertThat(calculateDiscount(100, 20)
        ).isEqualTo(80);
        assertThat(calculateDiscount(1.0, 10.0)
        ).isEqualTo(0.9);
        assertThat(calculateDiscount(100.0, 0)
        ).isEqualTo(100.0);
        assertThat(calculateDiscount(100.0, 100.0)
        ).isEqualTo(0.0);
//        assertThatThrownBy(
//                () -> calculateDiscount(-100, 10))
//                .isInstanceOf(ArithmeticException.class);

        assertThatThrownBy(
                () -> calculateDiscount(100, -5))
                .isInstanceOf(ArithmeticException.class);

        assertThatThrownBy(
                () -> calculateDiscount(100, 101))
                .isInstanceOf(ArithmeticException.class);

        System.out.println("Цена со скидкой: " + calculateDiscount(
                100, 5));
//        System.out.println("Цена со скидкой: " + calculateDiscount(
//                100, -5));
    }

    public static double calculateDiscount(double purchaseAmount,
                                           double discountAmount) {
        if (discountAmount > 100) {
            throw new ArithmeticException("Скидка не может быть больше 100%");
        }
        if (discountAmount < 0) {
            throw new ArithmeticException("Скидка не может быть отрицательной");
        }
        return purchaseAmount * ((100 - discountAmount) / 100);
    }
}