package pro.sky.homework211;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Equals;
import pro.sky.homework211.service.CalculatorServiceImpl;
import pro.sky.homework211.service.CalculatorService;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceImplTest {
   public final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    void welcome() {
        String expected = "Добро пожаловать в калькулятор";
        assertEquals(expected, calculatorService.showWelcome());
    }

    @Test
    void summa() {
        int expekted = 15;
        assertEquals(expekted, calculatorService.summa(5, 10));
    }

    @Test
    void minus() {
        int expekted = -5;
        assertEquals(expekted, calculatorService.minus(5, 10));
    }

    @Test
    void multiply() {
        int expekted = 50;
        assertEquals(expekted, calculatorService.multiply(5, 10));
    }

    @Test
    void dividePositive() {
        double expected = 1;
        assertEquals(expected, calculatorService.divide(5, 5));
    }

    @Test
    void divideNegative() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(10, 0));
    }

    }
