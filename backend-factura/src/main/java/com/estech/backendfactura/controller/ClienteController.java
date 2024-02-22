package com.estech.backendfactura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estech.backendfactura.DTO.ClienteFacturaDTO;
import com.estech.backendfactura.service.ClienteService;

@CrossOrigin({"*"})
@RestController
@RequestMapping("/api")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cliente/{nombre}")
    public ClienteFacturaDTO clientePorNombre(@PathVariable String nombre){
        return clienteService.clienteFacturas(nombre);
    }

}
