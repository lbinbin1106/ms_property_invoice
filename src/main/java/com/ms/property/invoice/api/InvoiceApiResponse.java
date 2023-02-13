package com.ms.property.invoice.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class InvoiceApiResponse {
    private String invoiceId;
    private double invoiceValue;
    private String invoiceDate;
    private String invoiceMemo;

}
