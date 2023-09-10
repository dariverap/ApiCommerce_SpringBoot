package com.api.commerce.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Collection;

@Getter
@Setter
@Entity
@Table(name = "purchases")
public class PurchaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer number;

    @Column(name = "supplier_id")
    private Integer supplierId;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime date;

    private double igv;

    private double subtotal;

    private double total;

    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "supplier_id", insertable = false, updatable = false)
    private SupplierEntity supplierEntity;

    @OneToMany(mappedBy = "purchaseEntity")
    private Collection<ProductPurchaseEntity> productPurchaseEntity;
}
