package com.estech.backendfactura.DTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteFacturaDTO {
    private String cliente;

    private List<Double> facturas;
}
