package com.ms.property.invoice.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class InvoiceApiRequest {
    private String invoiceId;
    private Double invoiceValue;
    private Date invoiceDate;
    private String invoiceMemo;

}
