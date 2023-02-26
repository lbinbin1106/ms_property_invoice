package com.ms.property.invoice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "property_invoice")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PropertyInvoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @Column(nullable = false)
    private String invoiceId;
    @NotNull
    @Column(nullable = false)
    private Double invoiceValue;
    @NotNull
    @Column(nullable = false)
    private Date invoiceDate;
    @NotNull
    @Column(nullable = false)
    private String invoiceMemo;
}
