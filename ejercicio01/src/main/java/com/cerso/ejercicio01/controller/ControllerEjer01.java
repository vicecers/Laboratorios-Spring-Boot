package com.cerso.ejercicio01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerEjer01 {
    
    @GetMapping("/saludo")
    public String saludo() {
        return "Hola mundo!!!";
    }
}
