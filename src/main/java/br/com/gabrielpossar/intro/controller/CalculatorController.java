package br.com.gabrielpossar.intro.controller;

import br.com.gabrielpossar.intro.model.Calculator;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")

public class CalculatorController {

    @RequestMapping("/sum/{n1}/{n2}")
    public float sum(@PathVariable("n1") String n1,
                     @PathVariable("n2") String n2){

        return Calculator.sum(Float.parseFloat(n1),Float.parseFloat(n2));

    }

    @RequestMapping("/multi/{n1}/{n2}")
    public float multi(@PathVariable("n1") String n1,
                       @PathVariable("n2") String n2){

        return Calculator.multi(Float.parseFloat(n1),Float.parseFloat(n2));

    }

}
