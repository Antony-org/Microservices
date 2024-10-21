package org.iti.productservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = true)
    private String description;

    @Column(nullable = false)
    private int stock;

    @Column(name ="shoe_color", nullable = true)
    private String shoeColor;

    @Column(name ="shoe_size", nullable = true)
    private String shoeSize;

    @Column(name = "date_created", nullable = true)
    private LocalDateTime dateCreated;

    @Column(name = "last_updated", nullable = true)
    private LocalDateTime lastUpdated;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name= "product_image")
    private String imageUrl;

    @Column(name= "brand" , nullable = true)
    private String brand;


    public Product(String name, BigDecimal price, String description, int stock, LocalDateTime dateCreated, LocalDateTime lastUpdated) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
        this.dateCreated = dateCreated;
        this.lastUpdated = lastUpdated;

    }

    public Product(String imageUrl, String shoeSize, String shoeColor, int stock, String description, BigDecimal price, String name) {
        this.imageUrl = imageUrl;
        this.shoeSize = shoeSize;
        this.shoeColor = shoeColor;
        this.stock = stock;
        this.description = description;
        this.price = price;
        this.name = name;
    }


    public Product(String name, BigDecimal price, int stock, LocalDateTime dateCreated, LocalDateTime lastUpdated) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.dateCreated = dateCreated;
        this.lastUpdated = lastUpdated;

    }



    /* Constructor that accepts categoryId as a String */
    public Product(String name, BigDecimal price, int stock) {
        this.name        = name;
        this.price       = price;
        this.stock       = stock;
        this.dateCreated = LocalDateTime.now();
        this.lastUpdated = LocalDateTime.now();
    }

    public Product(String name, BigDecimal price, String description, int stock, String shoeColor, String shoeSize, String brand) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
        this.shoeColor = shoeColor;
        this.shoeSize = shoeSize;
        this.brand = brand;
    }
}