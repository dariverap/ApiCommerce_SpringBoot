package com.api.commerce.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
@Entity
@Table(name = "products")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "category_id")
    private Integer categoryId;

    private String name;

    private String description;
    @Column(name = "selling_price")
    private double sellingPrice;

    private Integer stock;

    @Column(name = "image_path")
    private String imagePath;

    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private CategoryEntity categoryEntity;

    @OneToMany(mappedBy = "productEntity")
    private Collection<ProductSaleEntity> productSaleEntity;

    @OneToMany(mappedBy = "productEntity")
    private Collection<ProductPurchaseEntity> productPurchaseEntity;

    @OneToMany(mappedBy = "productEntity")
    private Collection<ProductSupplierEntity> productSupplierEntity;

}
