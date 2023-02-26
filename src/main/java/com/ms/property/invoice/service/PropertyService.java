package com.ms.property.invoice.service;

import com.ms.property.invoice.entity.PropertyInvoice;
import com.ms.property.invoice.repository.PropertyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PropertyService {
    private final PropertyRepository propertyRepository;

    public void createOrUpdateInvoice(PropertyInvoice propertyInvoice) {
        propertyRepository.save(propertyInvoice);
    }

    public List<PropertyInvoice> findAllInvoice() {
        return propertyRepository.findAll();
    }
    public PropertyInvoice findById(Long id) {
        return propertyRepository.findById(id).get();
    }
}
