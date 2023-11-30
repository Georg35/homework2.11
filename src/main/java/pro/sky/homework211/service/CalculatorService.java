package pro.sky.homework211.service;

public interface CalculatorService {
    String showWelcome();
    Integer summa(Integer usnum1, Integer usnum2);
    Integer minus(Integer usnum1, Integer usnum2);
    Integer multiply(Integer usnum1, Integer usnum2);
    Double divide(Integer usnum1, Integer usnum2);
}
