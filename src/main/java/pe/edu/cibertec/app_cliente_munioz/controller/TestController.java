package pe.edu.cibertec.app_cliente_munioz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class TestController {
    @GetMapping("/publica")
    public String publicApi(){
        return "Esta es una API pública.";
    }
    @GetMapping("/privada")
    public String privateApi(){
        return "Esta API es privada";
    }
}
