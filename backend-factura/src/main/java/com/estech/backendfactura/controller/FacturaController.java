package com.estech.backendfactura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estech.backendfactura.model.Factura;
import com.estech.backendfactura.service.FacturaService;

@CrossOrigin({"*"})
@RestController
@RequestMapping("/api")
public class FacturaController {
    
    @Autowired
    private FacturaService facturaService;

    @PostMapping("/factura")
    public Factura guardarFactura(@RequestBody Factura factura){
        return facturaService.guardarFactura(factura);
    }

}
