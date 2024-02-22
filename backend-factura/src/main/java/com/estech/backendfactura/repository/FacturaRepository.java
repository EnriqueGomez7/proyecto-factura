package com.estech.backendfactura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estech.backendfactura.model.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long> {
    
}
