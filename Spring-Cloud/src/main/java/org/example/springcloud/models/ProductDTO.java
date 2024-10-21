package org.example.springcloud.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ProductDTO(
        Long id,
        String name,
        BigDecimal price,
        String description,
        int stock,
        String shoeColor,
        String shoeSize,
        LocalDateTime dateCreated,
        LocalDateTime lastUpdated,
        String createdBy,
        String imageUrl,
        String brand
) {}