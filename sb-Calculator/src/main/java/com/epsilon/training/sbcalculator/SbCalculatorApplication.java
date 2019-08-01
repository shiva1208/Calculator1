package com.epsilon.training.sbcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.epsilon.training.sbcalculator.bean.Calculator;

@SpringBootApplication
public class SbCalculatorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbCalculatorApplication.class, args);
		Calculator calculator = context.getBean(Calculator.class);
		System.out.println("Addition result is " + calculator.addition(20, 10));
		System.out.println("Substraction result is " + calculator.substraction(20, 10));
		System.out.println("Multiplication result is " + calculator.multiplication(20, 10));
		System.out.println("Division result is " + calculator.division(20, 10));
	}

}
