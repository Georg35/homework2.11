package pro.sky.homework211.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String showWelcome() {
        return "Добро пожаловать в калькулятор";
    }


    public String summa(int usnum1, int usnum2) {
        return usnum1 + " + " + usnum2 + " = " + (usnum1 + usnum2);
    }

    public String minus(int usnum1, int usnum2) {
        return usnum1 + " - " + usnum2 + " = " + (usnum1 - usnum2);
    }

    public String multiply(int usnum1, int usnum2) {
        return usnum1 + " * " + usnum2 + " = " + (usnum1 * usnum2);
    }
    public String divide(int usnum1, int usnum2) {
        if (usnum2 == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя!");}

        else
            return usnum1 + " / " + usnum2 + " = " + (usnum1 / usnum2);
    }
}
