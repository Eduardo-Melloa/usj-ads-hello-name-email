package br.edu.usj.ads.lpii.helloemail;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloEmail {
    @PostMapping(value="helloEmail")
    public ModelAndView postHelloEmail(@RequestParam String nome, String email) {
        ModelAndView modelAndView = new ModelAndView("hello-email");

        String bemVindo = "Olá "+nome+", seu E-mail é: "+email;
        
        modelAndView.addObject("mensagem", bemVindo);
        
        return modelAndView;
    }
    
}
