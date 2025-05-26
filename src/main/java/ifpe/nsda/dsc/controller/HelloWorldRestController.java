package ifpe.nsda.dsc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/hello")
public class HelloWorldRestController {
    
    @GetMapping
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/param")
    public String helloWorldParam(@RequestParam("nome") String nome, @RequestParam("sobrenome") String sobrenome) {
        return ("Hello, " + nome + " " + sobrenome + "!");
    }

    @GetMapping("/path/{nome}/{sobrenome}")
    public String helloWorldPath(@PathVariable String nome, @PathVariable String sobrenome) {
        return ("Hello, " + nome + " " + sobrenome + "!");
    }

    @GetMapping("/path/{nome}/{sobrenome}/teste/{valor}")
    public String helloWorldPath(@PathVariable String nome, @PathVariable String sobrenome, @PathVariable String valor) {
        return ("Hello, " + nome + " " + sobrenome + "! Valor inserido: " + valor);
    }


}
