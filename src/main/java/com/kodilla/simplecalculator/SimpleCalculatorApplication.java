package com.kodilla.simplecalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class SimpleCalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleCalculatorApplication.class, args);

        SimpleCalculator simpleCalculator=new SimpleCalculator();
        Random r=new Random();
        int a=1+r.nextInt(99);
        int b=1+r.nextInt(99);
        int addResult=simpleCalculator.addAToB(a,b);
        int subtractResult=simpleCalculator.substractAFromB(a,b);
        int multiplyResult=simpleCalculator.multiplyAAndB(a,b);
        int divideResult=simpleCalculator.divideAByB(a,b);
        int moduloResult=simpleCalculator.moduloAByB(a,b);
        System.out.println(a+" + "+b+" = "+addResult);
        System.out.println(a+" - "+b+" = "+subtractResult);
        System.out.println(a+" * "+b+" = "+multiplyResult);
        System.out.println(a+" \u00F7 "+b+" = "+divideResult+"."+moduloResult);
    }

}
