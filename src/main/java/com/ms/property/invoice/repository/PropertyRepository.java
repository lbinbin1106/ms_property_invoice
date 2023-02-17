package com.ms.property.invoice.repository;

import com.ms.property.invoice.entity.PropertyInvoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends JpaRepository<PropertyInvoice, Long> {
}
