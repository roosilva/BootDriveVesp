package br.edu.ifms.frameworks.bootdrive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class CarrosController {

        @GetMapping("/carros")
        public String listarCarros() {
            return "ListaCarros";
        }
        
}
