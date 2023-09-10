package com.api.commerce.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "product_supplier")
public class ProductSupplierEntity {
    @EmbeddedId
    private ProductSupplierPK id;

    @Column(name = "current_purchase_price")
    private Double currentPurchasePrice;

    @ManyToOne
    @MapsId(value = "productId")
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private ProductEntity productEntity;

    @ManyToOne
    @MapsId(value = "supplierId")
    @JoinColumn(name = "supplier_id", insertable = false, updatable = false)
    private SupplierEntity supplierEntity;


}
