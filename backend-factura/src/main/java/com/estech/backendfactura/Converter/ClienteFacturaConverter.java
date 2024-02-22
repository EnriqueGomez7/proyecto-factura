package com.estech.backendfactura.Converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.estech.backendfactura.DTO.ClienteFacturaDTO;
import com.estech.backendfactura.DTO.FacturaDTO;
import com.estech.backendfactura.model.Cliente;
import com.estech.backendfactura.model.Factura;

@Component
public class ClienteFacturaConverter {
    
    public ClienteFacturaDTO convertEntityToClienteFacturaDTO(Cliente cliente){

        ClienteFacturaDTO clienteFacturaDTO = new ClienteFacturaDTO();

        clienteFacturaDTO.setCliente(cliente.getNombre());

        List<Factura> facturas = cliente.getFacturas();

        List<FacturaDTO> facturasForCliente = new ArrayList<>();

        facturas.forEach(factura -> {
            FacturaDTO facturaDTO = new FacturaDTO();

            facturaDTO.setId(factura.getId());
            facturaDTO.setImporte(factura.getImporteTotal());

            facturasForCliente.add(facturaDTO);
        });

        clienteFacturaDTO.setFacturas(facturasForCliente);

        return clienteFacturaDTO;

    }

}
