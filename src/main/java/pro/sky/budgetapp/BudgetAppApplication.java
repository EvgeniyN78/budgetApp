package pro.sky.budgetapp;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class BudgetAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(BudgetAppApplication.class, args);
    }

}
