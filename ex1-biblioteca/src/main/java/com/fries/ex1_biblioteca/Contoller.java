package com.fries.ex1_biblioteca;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/biblioteca")
public class Contoller {
    @GetMapping
    public String Bemvindo() {
        return "Bem-vindo a biblioteca";
    }
@GetMapping("/livros")
public  String getLicros(){
    return "Lista de livros";

}
}