package com.api.commerce.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "product_purchase")
public class ProductPurchaseEntity {

    @EmbeddedId
    private ProductPurchasePK id;

    private Integer quantity;

    private double pricePurchase;

    private double total;

    private Boolean status;

    @ManyToOne
    @MapsId(value = "purchaseNumber")
    @JoinColumn(name = "purchase_number", insertable = false, updatable = false)
    private PurchaseEntity purchaseEntity;

    @ManyToOne
    @MapsId(value = "productId")
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private ProductEntity productEntity;
}
