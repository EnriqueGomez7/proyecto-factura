package com.estech.backendfactura.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estech.backendfactura.model.Factura;
import com.estech.backendfactura.repository.FacturaRepository;

@Service
public class FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    public Factura guardarFactura(Factura factura){
        return facturaRepository.save(factura);
    }
    
}
