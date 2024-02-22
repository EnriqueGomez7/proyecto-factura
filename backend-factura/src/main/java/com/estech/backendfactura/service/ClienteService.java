package com.estech.backendfactura.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estech.backendfactura.Converter.ClienteFacturaConverter;
import com.estech.backendfactura.DTO.ClienteFacturaDTO;
import com.estech.backendfactura.model.Cliente;
import com.estech.backendfactura.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteFacturaConverter clienteFacturaConverter;

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteFacturaDTO clienteFacturas(String nombre){

        Cliente cliente = clienteRepository.findByNombre(nombre);

        ClienteFacturaDTO clienteFacturaDTO = new ClienteFacturaDTO();

        clienteFacturaDTO = clienteFacturaConverter.convertEntityToClienteFacturaDTO(cliente);

        return clienteFacturaDTO;

    }
    
}
