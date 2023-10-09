//package homework3.test;

import homework3.main.Tasks;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TasksTest {
    /*
    Задание 1.
    Напишите тесты, покрывающие на 100% метод evenOddNumber,
    который проверяет, является ли переданное число четным или нечетным.
     */
    @ParameterizedTest
    @ValueSource(ints = {-10, -4, 0, 6, 24, Integer.MIN_VALUE})
    void testEvenNumbers(int n) {
        assertTrue(Tasks.evenOddNumber(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {-11, -5, 7, 23, Integer.MAX_VALUE})
    void testOddNumbers(int n) {
        assertFalse(Tasks.evenOddNumber(n));
    }

    /*
    Задание 2.
    Разработайте и протестируйте метод numberInInterval,
    который проверяет, попадает ли переданное число в интервал (25;100).
     */
    @ParameterizedTest
    @ValueSource(ints = {29, 45, 66, 93})
    void testNumberExistInInterval(int n) {
        assertTrue(Tasks.numberInInterval(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {20, -45, 106, -101, 0})
    void testNumberDoNotExistInInterval(int n) {
        assertFalse(Tasks.numberInInterval(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {26, 99})
    void testMinMaxLimitExistInInterval(int n) {
        assertTrue(Tasks.numberInInterval(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 100})
    void testMinMaxLimitDoNotExistInInterval(int n) {
        assertFalse(Tasks.numberInInterval(n));
    }
}
