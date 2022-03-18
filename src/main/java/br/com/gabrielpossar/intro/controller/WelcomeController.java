package br.com.gabrielpossar.intro.controller;

import br.com.gabrielpossar.intro.model.Welcome;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/* Todas configurações de servlet */
@RestController

/* Ponto de entrada será o (/hello) */
@RequestMapping("/hello")

public class WelcomeController {

    private AtomicLong counter = new AtomicLong();

    @RequestMapping("/")
    public Welcome welcome(@RequestParam(value = "name", defaultValue = "FATEC Jales") String name,
                          @RequestParam(value = "msg", defaultValue = "Seja bem vindo!") String msg){
        return new Welcome(counter.incrementAndGet(), name, msg);
    }

    @RequestMapping("/{name}/{msg}")
    public Welcome hello(@PathVariable("name") String name,
                         @PathVariable("msg") String msg){

        return new Welcome(counter.incrementAndGet(), name, msg);

    }

}
