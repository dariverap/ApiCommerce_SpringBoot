package com.api.commerce.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "product_sale")
public class ProductSaleEntity {

    @EmbeddedId
    private ProductSalePK id;

    private Integer quantity;

    private double price;

    private double total;

    private Boolean status;

    @ManyToOne
    @MapsId(value = "sellNumber")
    @JoinColumn(name = "sale_number", insertable = false, updatable = false)
    private SaleEntity saleEntity;

    @ManyToOne
    @MapsId(value = "productId")
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private ProductEntity productEntity;
}
