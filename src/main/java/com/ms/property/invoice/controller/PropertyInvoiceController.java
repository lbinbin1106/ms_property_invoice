package com.ms.property.invoice.controller;

import com.ms.property.invoice.api.InvoiceApiResponse;
import com.ms.property.invoice.entity.PropertyInvoice;
import com.ms.property.invoice.service.PropertyService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping(produces = APPLICATION_JSON_VALUE)
@Slf4j
public class PropertyInvoiceController {

    private final PropertyService propertyService;

    @GetMapping("/v1/invoices")
    public ResponseEntity<List<PropertyInvoice>> getInvoices (
            @RequestHeader final HttpHeaders requestHeaders
    ) {
        return new ResponseEntity<>(propertyService.findAllInvoice(), HttpStatus.OK);
    }

    @PostMapping("/v1/invoices")
    public ResponseEntity<InvoiceApiResponse> postInvoice (
            @RequestHeader final HttpHeaders requestHeaders,
            @Valid @RequestBody PropertyInvoice propertyInvoice
    ) {
        propertyService.createOrUpdateInvoice(propertyInvoice);
        InvoiceApiResponse invoiceApiResponse = InvoiceApiResponse.builder().id(propertyInvoice.getId()).build();
        return new ResponseEntity<>(invoiceApiResponse, HttpStatus.CREATED);
    }

    @PutMapping("/v1/invoices/{id}")
    public ResponseEntity<InvoiceApiResponse> putInvoice (
            @PathVariable(value = "id") Long invoiceTableId,
            @RequestHeader final HttpHeaders requestHeaders,
            @Valid @RequestBody PropertyInvoice propertyInvoice
    ) {
        PropertyInvoice updatedInvoice = propertyService.findById(invoiceTableId);
        updatedInvoice.setInvoiceId(propertyInvoice.getInvoiceId());
        updatedInvoice.setInvoiceValue(propertyInvoice.getInvoiceValue());
        updatedInvoice.setInvoiceDate(propertyInvoice.getInvoiceDate());
        updatedInvoice.setInvoiceMemo(propertyInvoice.getInvoiceMemo());
        propertyService.createOrUpdateInvoice(updatedInvoice);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
