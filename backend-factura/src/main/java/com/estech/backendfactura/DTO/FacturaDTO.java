package com.estech.backendfactura.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FacturaDTO {
    private Long id;

    private Double importe;
}
