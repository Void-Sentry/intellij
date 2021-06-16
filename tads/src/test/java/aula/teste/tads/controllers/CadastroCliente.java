package aula.teste.tads.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class CadastroCliente {
    
    @GetMapping
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{

        var writer = response.getWriter();
        writer.println("Hello from get");
    }

    @PostMapping
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{

        var writer = response.getWriter();
        writer.println("hello from post");

        
    }
}