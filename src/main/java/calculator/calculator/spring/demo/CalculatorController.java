package calculator.calculator.spring.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculator")
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping("/calculator/plus")
    public int plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + num2;
    }

    @GetMapping("/calculator/minus")
    public int minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 - num2;
    }

    @GetMapping("/calculator/multiply")
    public int multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 * num2;
    }

    @GetMapping("/calculator/divide")
    public int divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        if (num2 == 0) {
            System.out.println("Делить на ноль нельзя");
        }
        return num1 / num2;
    }


}
