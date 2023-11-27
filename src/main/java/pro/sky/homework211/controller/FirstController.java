package pro.sky.homework211.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homework211.service.CalculatorService;

@RestController
public class FirstController {

    private final CalculatorService calculatorService;
    public FirstController(CalculatorService calculatorService){
        this.calculatorService=calculatorService;
    }

    @GetMapping
    public String showWelcome(){
        return calculatorService.showWelcome();
    }

    @GetMapping(path = "/plus")
    public String summa(@RequestParam("num1") int usnum1, @RequestParam("num2")  int usnum2){
        return calculatorService.summa(usnum1,usnum2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") int usnum1,@RequestParam("num2")  int usnum2){
        return calculatorService.minus(usnum1,usnum2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") int usnum1,@RequestParam("num2")  int usnum2){
        return calculatorService.multiply(usnum1,usnum2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") int usnum1,@RequestParam("num2")  int usnum2){
        return calculatorService.divide(usnum1,usnum2);
    }
}
