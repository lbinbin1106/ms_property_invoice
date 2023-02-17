package com.ms.property.invoice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "property_invoice")
@Data
@AllArgsConstructor
public class PropertyInvoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String invoiceId;
    private Number invoiceValue;
    private Date invoiceDate;
    private String invoiceMemo;
}
