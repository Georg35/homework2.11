package pro.sky.homework211.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String showWelcome() {
        return "Добро пожаловать в калькулятор";
    }


    public Integer summa(Integer usnum1, Integer usnum2) {
        return usnum1 + usnum2;
    }

    public Integer minus(Integer usnum1, Integer usnum2) {
        return usnum1 - usnum2;
    }

    public Integer multiply(Integer usnum1, Integer usnum2) {
        return usnum1 * usnum2;
    }

    public Double divide(Integer usnum1, Integer usnum2) {
        if (usnum2 == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя!");}

        else
            return usnum1.doubleValue() / usnum2.doubleValue();
    }
}
