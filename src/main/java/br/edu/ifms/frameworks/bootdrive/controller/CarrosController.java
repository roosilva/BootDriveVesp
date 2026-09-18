package br.edu.ifms.frameworks.bootdrive.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifms.frameworks.bootdrive.model.Carro;

@Controller 
public class CarrosController {

        @GetMapping("/carros")
        public ModelAndView listar() {
            ModelAndView modelAndView = new ModelAndView("ListaCarros");
            
            modelAndView.addObject("carros", buscarCarros());

            for (Carro carro : buscarCarros()) {
                System.out.println("Id: " + carro.getId() + 
                    ", Placa: " + carro.getPlaca());
            }
            
            return modelAndView; 
        }

        public List<Carro> buscarCarros() {
            List<Carro> carros = new ArrayList<Carro>();
            
            Carro c1 = new Carro();
            c1.setId(1L);
            c1.setPlaca("HSR-1010");

            Carro c2 = new Carro();
            c2.setId(2L);
            c2.setPlaca("HSS-2020");

            Carro c3 = new Carro();
            c3.setId(3L);
            c3.setPlaca("HST-3030");

            carros.add(c1);
            carros.add(c2); 
            carros.add(c3);
            
            return carros;
        }
        
}
