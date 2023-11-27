package pro.sky.homework211.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String showWelcome() {
        return "Добро пожаловать в калькулятор";
    }


    public int summa(int usnum1, int usnum2) {
        return usnum1 + usnum2;
    }

    public int minus(int usnum1, int usnum2) {
        return usnum1 - usnum2;
    }

    public int multiply(int usnum1, int usnum2) {
        return usnum1 * usnum2;
    }
    public int divide(int usnum1, int usnum2) {
        if (usnum2 == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя!");}

        else
            return usnum1 / usnum2;
    }
}
