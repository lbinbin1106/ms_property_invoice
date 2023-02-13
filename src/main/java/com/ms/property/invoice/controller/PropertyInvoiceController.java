package com.ms.property.invoice.controller;

import com.ms.property.invoice.api.InvoiceApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping(produces = APPLICATION_JSON_VALUE)
@Slf4j
public class PropertyInvoiceController {

    @GetMapping("/v1/invoices")
    public ResponseEntity<InvoiceApiResponse> getInvoices(
            @RequestHeader final HttpHeaders requestHeadres
    ) {
        InvoiceApiResponse invoiceApiResponse = InvoiceApiResponse.builder().invoiceId("0000").build();
        return new ResponseEntity<>(invoiceApiResponse, HttpStatus.OK);
    }
}
